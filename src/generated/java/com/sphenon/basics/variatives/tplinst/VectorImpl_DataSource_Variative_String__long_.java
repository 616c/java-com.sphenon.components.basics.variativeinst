// instantiated with jti.pl from VectorImpl_DataSource
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import java.util.Vector;
import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;
import com.sphenon.basics.many.tplinst.*;

import com.sphenon.basics.many.returncodes.*;

public class VectorImpl_DataSource_Variative_String__long_
  implements Vector_Variative_String__long_, ManagedResource {
    private com.sphenon.basics.data.DataSource<Vector> vector_source;

    public VectorImpl_DataSource_Variative_String__long_ (CallContext context, com.sphenon.basics.data.DataSource<Vector> vector_source) {
        this.vector_source = vector_source;
    }

    static public VectorImpl_DataSource_Variative_String__long_ create (CallContext context, com.sphenon.basics.data.DataSource<Vector> vector_source) {
        return new VectorImpl_DataSource_Variative_String__long_(context, vector_source);
    }

    public Variative_String_ get          (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variative_String_) vector_source.get(context).elementAt((int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
    }

    public Variative_String_ tryGet       (CallContext context, long index) {
        try {
            return (Variative_String_) vector_source.get(context).elementAt((int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    public boolean  canGet       (CallContext context, long index) {
        return (index >= 0 && index < vector_source.get(context).size()) ? true : false;
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
        if (index >= vector_source.get(context).size()) { vector_source.get(context).setSize((int) (index+1)); }
        return (Variative_String_) vector_source.get(context).set((int) index, item);
    }

    public void     add          (CallContext context, long index, Variative_String_ item) throws AlreadyExists {
        if (index < vector_source.get(context).size()) { AlreadyExists.createAndThrow (context); }
        vector_source.get(context).setSize((int) (index+1));
        vector_source.get(context).setElementAt(item, (int) index);
    }

    public void     prepend      (CallContext context, Variative_String_ item) {
        if (vector_source.get(context).size() == 0) {
            vector_source.get(context).add(item);
        } else {
            try {
                vector_source.get(context).insertElementAt(item, 0);
            } catch (ArrayIndexOutOfBoundsException e) {
                CustomaryContext cc = CustomaryContext.create((Context)context);
                cc.throwImpossibleState(context, ManyStringPool.get(context, "0.0.1" /* cannot insert element at position 0, java-lib says 'out of bounds' ??? */));
            }
        }
    }

    public void     append       (CallContext context, Variative_String_ item) {
        vector_source.get(context).add(item);
    }

    public void     insertBefore (CallContext context, long index, Variative_String_ item) throws DoesNotExist {
        try {
            vector_source.get(context).insertElementAt(item, (int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(context);
        }
    }

    public void     insertBehind (CallContext context, long index, Variative_String_ item) throws DoesNotExist {
        if (index == vector_source.get(context).size() - 1) {
            vector_source.get(context).add(item);
        } else {
            try {
                vector_source.get(context).insertElementAt(item, (int) (index+1));
            } catch (ArrayIndexOutOfBoundsException e) {
                DoesNotExist.createAndThrow (context);
            }
        }
    }

    public Variative_String_ replace      (CallContext context, long index, Variative_String_ item) throws DoesNotExist {
        try {
            return (Variative_String_) vector_source.get(context).set((int) index, item);
        } catch (ArrayIndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(context);
            throw (DoesNotExist) null;
        } catch (IllegalArgumentException e) {
            CustomaryContext cc = CustomaryContext.create((Context)context);
            cc.throwImpossibleState (context, ManyStringPool.get(context, "0.0.2" /* An exception occured, with respect to which the java-lib documentation is unfortunately incorrect */));
            throw (ExceptionImpossibleState) null;
        }
    }

    public Variative_String_ unset        (CallContext context, long index) {
        try {
            return (Variative_String_) vector_source.get(context).remove((int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
            // we kindly ignore this exception
            return null;
        }
    }

    public Variative_String_ remove       (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variative_String_) vector_source.get(context).remove((int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null;
        }
    }

    public IteratorItemIndex_Variative_String__long_ getNavigator (CallContext context) {
        return new VectorIteratorImpl_Variative_String__long_ (context, this);
    }

    public long     getSize      (CallContext context) {
        return vector_source.get(context).size();
    }

    public java.util.Iterator<Variative_String_> getIterator_Variative_String__ (CallContext context) {
        return vector_source.get(context).iterator();
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
        if (this.vector_source != null && this.vector_source instanceof ManagedResource) {
            ((ManagedResource)(this.vector_source)).release(context);
        }
    }
}
