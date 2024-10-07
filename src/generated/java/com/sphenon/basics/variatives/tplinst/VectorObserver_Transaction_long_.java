// instantiated with jti.pl from VectorObserver
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.debug.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;
import com.sphenon.basics.event.*;
import com.sphenon.basics.event.tplinst.*;

import com.sphenon.ad.adcore.ModificationType;

public class VectorObserver_Transaction_long_
  implements Vector_Transaction_long_,
             Changing,
             Dumpable,
             ManagedResource
{
    protected Vector_Transaction_long_ observed_vector;
    protected boolean need_notification;
    protected VectorObserverEventPolicy event_policy = VectorObserverEventPolicy.ON_DEMAND;

    protected VectorObserverEventPolicy getEventPolicy(CallContext context) {
        return this.event_policy;
    }

    protected void setEventPolicy(CallContext context, VectorObserverEventPolicy event_policy) {
        this.event_policy = event_policy;
    }

    public VectorObserver_Transaction_long_ (CallContext context, Vector_Transaction_long_ observed_vector,VectorObserverEventPolicy event_policy, ModificationType modification_type) {
        this.setEventPolicy(context,event_policy);
        this.observed_vector = observed_vector;
        need_notification = false;
        if (this.observed_vector != null && modification_type != ModificationType.STATE_LOAD) {
            if (getEventPolicy(context) == VectorObserverEventPolicy.ON_DEMAND) {
                need_notification = true;
            } else if (getEventPolicy(context) == VectorObserverEventPolicy.IMMEDIATELY) {
                for (Transaction item : observed_vector.getIterable_Transaction_(context)) {
                    onAdd(context, item);
                }
            }
        }
    }

    public VectorObserver_Transaction_long_ (CallContext context, Vector_Transaction_long_ observed_vector,VectorObserverEventPolicy event_policy) {
        this(context, observed_vector, event_policy, null);
    }

    public VectorObserver_Transaction_long_(CallContext context, Vector_Transaction_long_ observed_vector) {
        this(context, observed_vector, VectorObserverEventPolicy.ON_DEMAND);   
    }

    public void setObserved (CallContext context, Vector_Transaction_long_ observed_vector) {
        if (this.getObserved(context) != null) {
            for (Transaction item : this.observed_vector.getIterable_Transaction_(context)) {
                onRemove(context, item);
            }
        }

        this.observed_vector = observed_vector;

        need_notification = false;
        if (this.observed_vector != null) {
            if (getEventPolicy(context) == VectorObserverEventPolicy.ON_DEMAND || getEventPolicy(context) == VectorObserverEventPolicy.ON_DEMAND_ONLY_EXPLICIT) {
                need_notification = true;
            } else if (getEventPolicy(context) == VectorObserverEventPolicy.IMMEDIATELY || getEventPolicy(context) == VectorObserverEventPolicy.IMMEDIATELY_ONLY_EXPLICIT) {
                for (Transaction item : this.observed_vector.getIterable_Transaction_(context)) {
                    onAdd(context, item);
                }
            }
        }
    }

    public Vector_Transaction_long_ getObserved (CallContext context) {
        if (need_notification && this.observed_vector != null) {
            need_notification = false;
            for (Transaction item : this.observed_vector.getIterable_Transaction_(context)) {
                onAdd(context, item);
            }
        }
        return this.observed_vector;
    }

    // ------------------------------------------------------------------------------------
    // Aspect: Changing
    protected EventDispatcher_ChangeEvent_ change_event_dispatcher = null;
    protected java.util.Date last_update = null;

    protected void notify(CallContext context, ChangeEvent change_event) {
        if (change_event_dispatcher != null) {
            change_event_dispatcher.notify(context, change_event);
        }
        if (this.last_update != null) {
            this.last_update.setTime(System.currentTimeMillis());
        }
    }

    protected void notify(CallContext context) {
        if (change_event_dispatcher != null) {
            change_event_dispatcher.notify(context);
        }
        if (this.last_update != null) {
            this.last_update.setTime(System.currentTimeMillis());
        }
    }

    protected void onAdd(CallContext context, Transaction item) {
    }

    protected void onRemove(CallContext context, Transaction item) {
    }

    public EventDispatcher_ChangeEvent_ getChangeEventDispatcher(CallContext context) {
        if (change_event_dispatcher == null) {
            this.change_event_dispatcher = new EventDispatcher_ChangeEvent_(context);
        }
        return this.change_event_dispatcher;
    }

    public java.util.Date getLastUpdate(CallContext context) {
        if (this.last_update == null) {
            this.last_update = new java.util.Date();
        }
        return this.last_update;
    }
    // ------------------------------------------------------------------------------------

    public Transaction                                    get             (CallContext context, long index) throws DoesNotExist {
        return this.getObserved(context).get(context, index);
    }

    public Transaction                                    tryGet          (CallContext context, long index) {
        return this.getObserved(context).tryGet(context, index);
    }

    public boolean                                     canGet          (CallContext context, long index) {
        return this.getObserved(context).canGet(context, index);
    }

    public ReferenceToMember_Transaction_long_ReadOnlyVector_Transaction_long__ getReference    (CallContext context, long index) throws DoesNotExist {
        return this.getObserved(context).getReference(context, index);
    }

    public ReferenceToMember_Transaction_long_ReadOnlyVector_Transaction_long__ tryGetReference (CallContext context, long index) {
        return this.getObserved(context).tryGetReference(context, index);
    }

    public Transaction                                    set             (CallContext context, long index, Transaction item) {
        Transaction old_item = this.getObserved(context).set(context, index, item);
        if (old_item != null) { 
           onRemove(context, old_item); 
           ChangeEvent event = new RemoveEvent(context,old_item,index);   
           notify(context,event);
        }
        onAdd(context, item);
        ChangeEvent event = new AddEvent(context,item,index);   
        notify(context,event);
        return old_item;
    }

    public void                                        add             (CallContext context, long index, Transaction item) throws AlreadyExists {
        this.getObserved(context).add(context, index, item);
        onAdd(context, item);
        ChangeEvent event = new AddEvent(context,item,index);   
        notify(context,event);
    }

    public void                                        prepend         (CallContext context, Transaction item) {
        this.getObserved(context).prepend(context, item);
        onAdd(context, item);
        ChangeEvent event = new AddEvent(context,item);   
        notify(context,event);
    }

    public void                                        append          (CallContext context, Transaction item) {
        this.getObserved(context).append(context, item);
        onAdd(context, item);
        ChangeEvent event = new AddEvent(context,item);   
        notify(context,event);
    }

    public void                                        insertBefore    (CallContext context, long index, Transaction item) throws DoesNotExist {
        this.getObserved(context).insertBefore(context, index, item);
        onAdd(context, item);
        ChangeEvent event = new AddEvent(context,item);   
        notify(context,event);
    }

    public void                                        insertBehind    (CallContext context, long index, Transaction item) throws DoesNotExist {
        this.getObserved(context).insertBehind(context, index, item);
        onAdd(context, item);
        ChangeEvent event = new AddEvent(context,item,index);   
        notify(context,event);
    }

    public Transaction                                    replace         (CallContext context, long index, Transaction item) throws DoesNotExist {
        Transaction old_item = this.getObserved(context).replace(context, index, item);
        onRemove(context, old_item);
        ChangeEvent event = new RemoveEvent(context,old_item,index);   
        notify(context,event);
        onAdd(context, item);
        event = new AddEvent(context,item,index);   
        notify(context,event);
        return old_item;
    }

    public Transaction                                    unset           (CallContext context, long index) {
        Transaction old_item = this.getObserved(context).unset(context, index);
        if (old_item != null) { 
           onRemove(context, old_item); 
           ChangeEvent event = new RemoveEvent(context,old_item,index);   
           notify(context,event);
        }
        return old_item;
    }

    public Transaction                                    remove          (CallContext context, long index) throws DoesNotExist {
        Transaction old_item = this.getObserved(context).remove(context, index);
        onRemove(context, old_item);
        ChangeEvent event = new RemoveEvent(context,old_item,index);   
        notify(context,event);
        return old_item;
    }

    public IteratorItemIndex_Transaction_long_       getNavigator    (CallContext context) {
        return this.getObserved(context).getNavigator(context);
    }

    public long                                        getSize         (CallContext context) {
        return this.getObserved(context).getSize(context);
    }

    public java.util.Iterator<Transaction> getIterator_Transaction_ (CallContext context) {
        return this.getObserved(context).getIterator_Transaction_(context);
    }

    public java.util.Iterator getIterator (CallContext context) {
        return getIterator_Transaction_(context);
    }

    public VectorIterable_Transaction_long_ getIterable_Transaction_ (CallContext context) {
        return new VectorIterable_Transaction_long_(context, this);
    }

    public Iterable<Transaction> getIterable (CallContext context) {
        return getIterable_Transaction_ (context);
    }

    public void release(CallContext context) {
        if (this.observed_vector != null && this.observed_vector instanceof ManagedResource) {
            ((ManagedResource)(this.observed_vector)).release(context);
        }
    }

    public void dump(CallContext context, DumpNode dump_node) {
        if (observed_vector instanceof Dumpable) {
            ((Dumpable)observed_vector).dump(context, dump_node);
        } else {
            dump_node.dump(context, observed_vector.toString());
        }
    }
}

