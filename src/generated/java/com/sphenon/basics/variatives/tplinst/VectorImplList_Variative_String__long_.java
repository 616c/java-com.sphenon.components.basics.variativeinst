// instantiated with jti.pl from VectorImplList
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.debug.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;

import com.sphenon.basics.many.returncodes.*;

public class VectorImplList_Variative_String__long_
  implements Vector_Variative_String__long_, VectorImplList, Dumpable, ManagedResource {
    protected java.util.List vector;

    protected VectorImplList_Variative_String__long_ (CallContext context) {
        vector = new java.util.ArrayList ();
    }

    static public VectorImplList_Variative_String__long_ create (CallContext context) {
        return new VectorImplList_Variative_String__long_(context);
    }

    protected VectorImplList_Variative_String__long_ (CallContext context, java.util.List vector) {
        this.vector = vector;
    }

    static public VectorImplList_Variative_String__long_ create (CallContext context, java.util.List vector) {
        return new VectorImplList_Variative_String__long_(context, vector);
    }

    public Variative_String_ get          (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variative_String_) vector.get((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
    }

    public Variative_String_ tryGet       (CallContext context, long index) {
        if (index < 0 || index >= vector.size()) {
            return null;
        }
        return (Variative_String_) vector.get((int) index);
    }

    public boolean  canGet       (CallContext context, long index) {
        return (index >= 0 && index < vector.size()) ? true : false;
    }

    public VectorReferenceToMember_Variative_String__long_ getReference    (CallContext context, long index) throws DoesNotExist {
        if ( ! canGet(context, index)) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
        return new VectorReferenceToMember_Variative_String__long_(context, this, index);
    }

    public VectorReferenceToMember_Variative_String__long_ tryGetReference (CallContext context, long index) {
        if ( ! canGet(context, index)) { return null; }
        return new VectorReferenceToMember_Variative_String__long_(context, this, index);
    }

    public Variative_String_ set          (CallContext context, long index, Variative_String_ item) {
        while (index > vector.size()) { vector.add(null); }
        if( index == vector.size()) {
            vector.add(item);
            return null;
        } else {
            return (Variative_String_) vector.set((int) index, item);
        }
    }

    public void     add          (CallContext context, long index, Variative_String_ item) throws AlreadyExists {
        if (index < vector.size()) { AlreadyExists.createAndThrow (context); }
        set(context, index, item);
    }

    public void     prepend      (CallContext call_context, Variative_String_ item) {
        if (vector.size() == 0) {
            vector.add(item);
        } else {
            vector.add(0, item);
        }
    }

    public void     append       (CallContext context, Variative_String_ item) {
        vector.add(item);
    }

    public void     insertBefore (CallContext context, long index, Variative_String_ item) throws DoesNotExist {
        try {
            vector.add((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(context);
        }
    }

    public void     insertBehind (CallContext context, long index, Variative_String_ item) throws DoesNotExist {
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

    public Variative_String_ replace      (CallContext call_context, long index, Variative_String_ item) throws DoesNotExist {
        try {
            return (Variative_String_) vector.set((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(call_context);
            throw (DoesNotExist) null;
        }
    }

    public Variative_String_ unset        (CallContext context, long index) {
        try {
            return (Variative_String_) vector.remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            // we kindly ignore this exception
            return null;
        }
    }

    public Variative_String_ remove       (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variative_String_) vector.remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null;
        }
    }

    public IteratorItemIndex_Variative_String__long_ getNavigator (CallContext context) {
        return new VectorIteratorImpl_Variative_String__long_ (context, this);
    }

    public long     getSize      (CallContext context) {
        return vector.size();
    }

    // to be used with care
    public java.util.List getImplementationList (CallContext context) {
        return this.vector;
    }

    public java.util.Iterator<Variative_String_> getIterator_Variative_String__ (CallContext context) {
        return vector.iterator();
    }

    public java.util.Iterator getIterator (CallContext context) {
        return getIterator_Variative_String__(context);
    }

    public VectorIterable_Variative_String__long_ getIterable_Variative_String__ (CallContext context) {
        return new VectorIterable_Variative_String__long_(context, this);
    }

    public Iterable<Variative_String_> getIterable (CallContext context) {
        return getIterable_Variative_String__ (context);
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
