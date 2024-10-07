// instantiated with jti.pl from VectorImplList_DataSource
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;
import com.sphenon.basics.many.tplinst.*;
import com.sphenon.basics.event.tplinst.EventDispatcher_ChangeEvent_;
import com.sphenon.basics.event.Changing;

// java
import java.util.Date;

import com.sphenon.basics.many.returncodes.*;

public class VectorImplList_DataSource_Variant_Image__long_
  implements Vector_Variant_Image__long_, Changing, ManagedResource {
    protected DataSource_List_ vector_source;
    protected EventDispatcher_ChangeEvent_ dispatcher = null;

    public EventDispatcher_ChangeEvent_ 
    getChangeEventDispatcher(CallContext context) {
        if( this.dispatcher == null ){
          this.dispatcher = new EventDispatcher_ChangeEvent_(context);
        }
        return this.dispatcher;
    } // getChangeEventDispatcher
    
    public Date 
    getLastUpdate(CallContext call_context) {
        return new Date();
    } // getLastUpdate

    protected VectorImplList_DataSource_Variant_Image__long_ (CallContext context, DataSource_List_ vector_source) {
        this.vector_source = vector_source;
        if( this.vector_source instanceof Changing)  {
          Changing source_changing = (Changing)this.vector_source;
          source_changing.getChangeEventDispatcher(context).addListener(context,this.getChangeEventDispatcher(context));
        } 
    }

    static public VectorImplList_DataSource_Variant_Image__long_ create (CallContext context, DataSource_List_ vector_source) {
        return new VectorImplList_DataSource_Variant_Image__long_(context, vector_source);
    }

    public Variant_Image_ get          (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variant_Image_) vector_source.get(context).get((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
    }

    public Variant_Image_ tryGet       (CallContext context, long index) {
        try {
            return (Variant_Image_) vector_source.get(context).get((int) index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public boolean  canGet       (CallContext context, long index) {
        return (index >= 0 && index < vector_source.get(context).size()) ? true : false;
    }

    public VectorReferenceToMember_Variant_Image__long_ getReference    (CallContext context, long index) throws DoesNotExist {
        if ( ! canGet(context, index)) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
        return new VectorReferenceToMember_Variant_Image__long_(context, this, index);
    }

    public VectorReferenceToMember_Variant_Image__long_ tryGetReference (CallContext context, long index) {
        if ( ! canGet(context, index)) { return null; }
        return new VectorReferenceToMember_Variant_Image__long_(context, this, index);
    }

    public Variant_Image_ set          (CallContext context, long index, Variant_Image_ item) {
        while (index > vector_source.get(context).size()) { vector_source.get(context).add(null); }
        if( index == vector_source.get(context).size()) {
            vector_source.get(context).add(item);
            return null;
        } else {
            return (Variant_Image_) vector_source.get(context).set((int) index, item);
        }
    }

    public void     add          (CallContext context, long index, Variant_Image_ item) throws AlreadyExists {
        if (index < vector_source.get(context).size()) { AlreadyExists.createAndThrow (context); }
        set(context, index, item);
    }

    public void     prepend      (CallContext context, Variant_Image_ item) {
        if (vector_source.get(context).size() == 0) {
            vector_source.get(context).add(item);
        } else {
            vector_source.get(context).add(0, item);
        }
    }

    public void     append       (CallContext context, Variant_Image_ item) {
        vector_source.get(context).add(item);
    }

    public void     insertBefore (CallContext context, long index, Variant_Image_ item) throws DoesNotExist {
        try {
            vector_source.get(context).add((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(context);
        }
    }

    public void     insertBehind (CallContext context, long index, Variant_Image_ item) throws DoesNotExist {
        if (index == vector_source.get(context).size() - 1) {
            vector_source.get(context).add(item);
        } else {
            try {
                vector_source.get(context).add((int) index + 1, item);
            } catch (IndexOutOfBoundsException e) {
                DoesNotExist.createAndThrow (context);
            }
        }
    }

    public Variant_Image_ replace      (CallContext context, long index, Variant_Image_ item) throws DoesNotExist {
        try {
            return (Variant_Image_) vector_source.get(context).set((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(context);
            throw (DoesNotExist) null;
        }
    }

    public Variant_Image_ unset        (CallContext context, long index) {
        try {
            return (Variant_Image_) vector_source.get(context).remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            // we kindly ignore this exception
            return null;
        }
    }

    public Variant_Image_ remove       (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variant_Image_) vector_source.get(context).remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null;
        }
    }

    public IteratorItemIndex_Variant_Image__long_ getNavigator (CallContext context) {
        return new VectorIteratorImpl_Variant_Image__long_ (context, this);
    }

    public long     getSize      (CallContext context) {
        return vector_source.get(context).size();
    }

    // to be used with care
    public java.util.List getImplementationList (CallContext context) {
        return this.vector_source.get(context);
    }

    public java.util.Iterator<Variant_Image_> getIterator_Variant_Image__ (CallContext context) {
        return vector_source.get(context).iterator();
    }

    public java.util.Iterator getIterator (CallContext context) {
        return getIterator_Variant_Image__(context);
    }

    public VectorIterable_Variant_Image__long_ getIterable_Variant_Image__ (CallContext context) {
        return new VectorIterable_Variant_Image__long_(context, this);
    }

    public Iterable<Variant_Image_> getIterable (CallContext context) {
        return getIterable_Variant_Image__ (context);
    }
   
    public void release(CallContext context) {
        if (this.vector_source != null && this.vector_source instanceof ManagedResource) {
            ((ManagedResource)(this.vector_source)).release(context);
        }
    }
}
