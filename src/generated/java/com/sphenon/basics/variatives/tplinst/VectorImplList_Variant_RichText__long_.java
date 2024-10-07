// instantiated with jti.pl from VectorImplList
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.debug.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;

import com.sphenon.basics.many.returncodes.*;

public class VectorImplList_Variant_RichText__long_
  implements Vector_Variant_RichText__long_, VectorImplList, Dumpable, ManagedResource {
    protected java.util.List vector;

    protected VectorImplList_Variant_RichText__long_ (CallContext context) {
        vector = new java.util.ArrayList ();
    }

    static public VectorImplList_Variant_RichText__long_ create (CallContext context) {
        return new VectorImplList_Variant_RichText__long_(context);
    }

    protected VectorImplList_Variant_RichText__long_ (CallContext context, java.util.List vector) {
        this.vector = vector;
    }

    static public VectorImplList_Variant_RichText__long_ create (CallContext context, java.util.List vector) {
        return new VectorImplList_Variant_RichText__long_(context, vector);
    }

    public Variant_RichText_ get          (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variant_RichText_) vector.get((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
    }

    public Variant_RichText_ tryGet       (CallContext context, long index) {
        if (index < 0 || index >= vector.size()) {
            return null;
        }
        return (Variant_RichText_) vector.get((int) index);
    }

    public boolean  canGet       (CallContext context, long index) {
        return (index >= 0 && index < vector.size()) ? true : false;
    }

    public VectorReferenceToMember_Variant_RichText__long_ getReference    (CallContext context, long index) throws DoesNotExist {
        if ( ! canGet(context, index)) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
        return new VectorReferenceToMember_Variant_RichText__long_(context, this, index);
    }

    public VectorReferenceToMember_Variant_RichText__long_ tryGetReference (CallContext context, long index) {
        if ( ! canGet(context, index)) { return null; }
        return new VectorReferenceToMember_Variant_RichText__long_(context, this, index);
    }

    public Variant_RichText_ set          (CallContext context, long index, Variant_RichText_ item) {
        while (index > vector.size()) { vector.add(null); }
        if( index == vector.size()) {
            vector.add(item);
            return null;
        } else {
            return (Variant_RichText_) vector.set((int) index, item);
        }
    }

    public void     add          (CallContext context, long index, Variant_RichText_ item) throws AlreadyExists {
        if (index < vector.size()) { AlreadyExists.createAndThrow (context); }
        set(context, index, item);
    }

    public void     prepend      (CallContext call_context, Variant_RichText_ item) {
        if (vector.size() == 0) {
            vector.add(item);
        } else {
            vector.add(0, item);
        }
    }

    public void     append       (CallContext context, Variant_RichText_ item) {
        vector.add(item);
    }

    public void     insertBefore (CallContext context, long index, Variant_RichText_ item) throws DoesNotExist {
        try {
            vector.add((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(context);
        }
    }

    public void     insertBehind (CallContext context, long index, Variant_RichText_ item) throws DoesNotExist {
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

    public Variant_RichText_ replace      (CallContext call_context, long index, Variant_RichText_ item) throws DoesNotExist {
        try {
            return (Variant_RichText_) vector.set((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(call_context);
            throw (DoesNotExist) null;
        }
    }

    public Variant_RichText_ unset        (CallContext context, long index) {
        try {
            return (Variant_RichText_) vector.remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            // we kindly ignore this exception
            return null;
        }
    }

    public Variant_RichText_ remove       (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variant_RichText_) vector.remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null;
        }
    }

    public IteratorItemIndex_Variant_RichText__long_ getNavigator (CallContext context) {
        return new VectorIteratorImpl_Variant_RichText__long_ (context, this);
    }

    public long     getSize      (CallContext context) {
        return vector.size();
    }

    // to be used with care
    public java.util.List getImplementationList (CallContext context) {
        return this.vector;
    }

    public java.util.Iterator<Variant_RichText_> getIterator_Variant_RichText__ (CallContext context) {
        return vector.iterator();
    }

    public java.util.Iterator getIterator (CallContext context) {
        return getIterator_Variant_RichText__(context);
    }

    public VectorIterable_Variant_RichText__long_ getIterable_Variant_RichText__ (CallContext context) {
        return new VectorIterable_Variant_RichText__long_(context, this);
    }

    public Iterable<Variant_RichText_> getIterable (CallContext context) {
        return getIterable_Variant_RichText__ (context);
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
