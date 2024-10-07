// instantiated with jti.pl from VectorImplList
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.debug.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;

import com.sphenon.basics.many.returncodes.*;

public class VectorImplList_SubTransactionLifeCycleLinked_long_
  implements Vector_SubTransactionLifeCycleLinked_long_, VectorImplList, Dumpable, ManagedResource {
    protected java.util.List vector;

    protected VectorImplList_SubTransactionLifeCycleLinked_long_ (CallContext context) {
        vector = new java.util.ArrayList ();
    }

    static public VectorImplList_SubTransactionLifeCycleLinked_long_ create (CallContext context) {
        return new VectorImplList_SubTransactionLifeCycleLinked_long_(context);
    }

    protected VectorImplList_SubTransactionLifeCycleLinked_long_ (CallContext context, java.util.List vector) {
        this.vector = vector;
    }

    static public VectorImplList_SubTransactionLifeCycleLinked_long_ create (CallContext context, java.util.List vector) {
        return new VectorImplList_SubTransactionLifeCycleLinked_long_(context, vector);
    }

    public SubTransactionLifeCycleLinked get          (CallContext context, long index) throws DoesNotExist {
        try {
            return (SubTransactionLifeCycleLinked) vector.get((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
    }

    public SubTransactionLifeCycleLinked tryGet       (CallContext context, long index) {
        if (index < 0 || index >= vector.size()) {
            return null;
        }
        return (SubTransactionLifeCycleLinked) vector.get((int) index);
    }

    public boolean  canGet       (CallContext context, long index) {
        return (index >= 0 && index < vector.size()) ? true : false;
    }

    public VectorReferenceToMember_SubTransactionLifeCycleLinked_long_ getReference    (CallContext context, long index) throws DoesNotExist {
        if ( ! canGet(context, index)) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
        return new VectorReferenceToMember_SubTransactionLifeCycleLinked_long_(context, this, index);
    }

    public VectorReferenceToMember_SubTransactionLifeCycleLinked_long_ tryGetReference (CallContext context, long index) {
        if ( ! canGet(context, index)) { return null; }
        return new VectorReferenceToMember_SubTransactionLifeCycleLinked_long_(context, this, index);
    }

    public SubTransactionLifeCycleLinked set          (CallContext context, long index, SubTransactionLifeCycleLinked item) {
        while (index > vector.size()) { vector.add(null); }
        if( index == vector.size()) {
            vector.add(item);
            return null;
        } else {
            return (SubTransactionLifeCycleLinked) vector.set((int) index, item);
        }
    }

    public void     add          (CallContext context, long index, SubTransactionLifeCycleLinked item) throws AlreadyExists {
        if (index < vector.size()) { AlreadyExists.createAndThrow (context); }
        set(context, index, item);
    }

    public void     prepend      (CallContext call_context, SubTransactionLifeCycleLinked item) {
        if (vector.size() == 0) {
            vector.add(item);
        } else {
            vector.add(0, item);
        }
    }

    public void     append       (CallContext context, SubTransactionLifeCycleLinked item) {
        vector.add(item);
    }

    public void     insertBefore (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist {
        try {
            vector.add((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(context);
        }
    }

    public void     insertBehind (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist {
        if (index == vector.size() - 1) {
            vector.add(item);
        } else {
            try {
                vector.add((int) index + 1, item);
            } catch (IndexOutOfBoundsException e) {
                DoesNotExist.createAndThrow (context);
            }
        }
    }

    public SubTransactionLifeCycleLinked replace      (CallContext call_context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist {
        try {
            return (SubTransactionLifeCycleLinked) vector.set((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(call_context);
            throw (DoesNotExist) null;
        }
    }

    public SubTransactionLifeCycleLinked unset        (CallContext context, long index) {
        try {
            return (SubTransactionLifeCycleLinked) vector.remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            // we kindly ignore this exception
            return null;
        }
    }

    public SubTransactionLifeCycleLinked remove       (CallContext context, long index) throws DoesNotExist {
        try {
            return (SubTransactionLifeCycleLinked) vector.remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null;
        }
    }

    public IteratorItemIndex_SubTransactionLifeCycleLinked_long_ getNavigator (CallContext context) {
        return new VectorIteratorImpl_SubTransactionLifeCycleLinked_long_ (context, this);
    }

    public long     getSize      (CallContext context) {
        return vector.size();
    }

    // to be used with care
    public java.util.List getImplementationList (CallContext context) {
        return this.vector;
    }

    public java.util.Iterator<SubTransactionLifeCycleLinked> getIterator_SubTransactionLifeCycleLinked_ (CallContext context) {
        return vector.iterator();
    }

    public java.util.Iterator getIterator (CallContext context) {
        return getIterator_SubTransactionLifeCycleLinked_(context);
    }

    public VectorIterable_SubTransactionLifeCycleLinked_long_ getIterable_SubTransactionLifeCycleLinked_ (CallContext context) {
        return new VectorIterable_SubTransactionLifeCycleLinked_long_(context, this);
    }

    public Iterable<SubTransactionLifeCycleLinked> getIterable (CallContext context) {
        return getIterable_SubTransactionLifeCycleLinked_ (context);
    }


    public void release(CallContext context) {
        if (this.vector != null && this.vector instanceof ManagedResource) {
            ((ManagedResource)(this.vector)).release(context);
        }
    }

    public void dump(CallContext context, DumpNode dump_node) {
        int i=1;
        for (Object o : vector) {
            dump_node.dump(context, (new Integer(i++)).toString(), o);
        }
    }
}
