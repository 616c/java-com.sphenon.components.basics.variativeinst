// instantiated with jti.pl from VectorImpl

/****************************************************************************
  Copyright 2001-2018 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
// import com.sphenon.basics.monitoring.*;
// @review:wm
// zusätzliche includes müssen beim instantiieren angegeben werden,
// sie dürfen nicht direkt ins template eingetragen werden
// anderfalls würde eine dependency von *jeder* instant zu diesem
// package entstehen
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.debug.*;
import com.sphenon.basics.many.*;

import com.sphenon.basics.many.returncodes.*;

public class VectorImpl_SubTransactionLifeCycleLinked_long_
  implements Vector_SubTransactionLifeCycleLinked_long_,
             VectorOptimized<SubTransactionLifeCycleLinked>,
             Dumpable,
             ManagedResource
 {
    private java.util.Vector vector;

    protected VectorImpl_SubTransactionLifeCycleLinked_long_ (CallContext context) {
        vector = new java.util.Vector(4);
    }

    static public VectorImpl_SubTransactionLifeCycleLinked_long_ create (CallContext context) {
        return new VectorImpl_SubTransactionLifeCycleLinked_long_(context);
    }

    protected VectorImpl_SubTransactionLifeCycleLinked_long_ (CallContext context, java.util.Vector vector) {
        this.vector = vector;
    }

    static public VectorImpl_SubTransactionLifeCycleLinked_long_ create (CallContext context, java.util.Vector vector) {
        return new VectorImpl_SubTransactionLifeCycleLinked_long_(context, vector);
    }

    

    public SubTransactionLifeCycleLinked get          (CallContext context, long index) throws DoesNotExist {
        try {
            return (SubTransactionLifeCycleLinked) vector.elementAt((int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
    }

    public SubTransactionLifeCycleLinked tryGet       (CallContext context, long index) {
        try {
            return (SubTransactionLifeCycleLinked) vector.elementAt((int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
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
        if (index >= vector.size()) { vector.setSize((int) (index+1)); }
        return (SubTransactionLifeCycleLinked) vector.set((int) index, item);
    }

    public void     add          (CallContext context, long index, SubTransactionLifeCycleLinked item) throws AlreadyExists {
        if (index < vector.size()) { AlreadyExists.createAndThrow (context); }
        vector.setSize((int) (index+1));
        vector.setElementAt(item, (int) index);
    }

    public void     prepend      (CallContext call_context, SubTransactionLifeCycleLinked item) {
        if (vector.size() == 0) {
            vector.add(item);
        } else {
            try {
                vector.insertElementAt(item, 0);
            } catch (ArrayIndexOutOfBoundsException e) {
                Context context = Context.create(call_context);
                CustomaryContext cc = CustomaryContext.create(context);
                cc.throwImpossibleState(context, ManyStringPool.get(context, "0.0.1" /* cannot insert element at position 0, java-lib says 'out of bounds' ??? */));
            }
        }
    }

    public void     append       (CallContext context, SubTransactionLifeCycleLinked item) {
        vector.add(item);
    }

    public void     insertBefore (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist {
        try {
            vector.insertElementAt(item, (int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(context);
        }
    }

    public void     insertBehind (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist {
        if (index == vector.size() - 1) {
            vector.add(item);
        } else {
            try {
                vector.insertElementAt(item, (int) (index+1));
            } catch (ArrayIndexOutOfBoundsException e) {
                DoesNotExist.createAndThrow (context);
            }
        }
    }

    public SubTransactionLifeCycleLinked replace      (CallContext call_context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist {
        try {
            return (SubTransactionLifeCycleLinked) vector.set((int) index, item);
        } catch (ArrayIndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(call_context);
            throw (DoesNotExist) null;
        } catch (IllegalArgumentException e) {
            Context context = Context.create(call_context);
            CustomaryContext cc = CustomaryContext.create(context);
            cc.throwImpossibleState (context, ManyStringPool.get(context, "0.0.2" /* An exception occured, with respect to which the java-lib documentation is unfortunately incorrect */));
            throw (ExceptionImpossibleState) null;
        }
    }

    public SubTransactionLifeCycleLinked unset        (CallContext context, long index) {
        try {
            return (SubTransactionLifeCycleLinked) vector.remove((int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
            // we kindly ignore this exception
            return null;
        }
    }

    public SubTransactionLifeCycleLinked remove       (CallContext context, long index) throws DoesNotExist {
        try {
            return (SubTransactionLifeCycleLinked) vector.remove((int) index);
        } catch (ArrayIndexOutOfBoundsException e) {
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

    public java.util.Vector getImplementationVector(CallContext context){
      return this.vector;
    }

    public void setImplementationVector(CallContext context, java.util.Vector vector){
      this.vector = vector;
    }

    public boolean contains(CallContext context, SubTransactionLifeCycleLinked item) {
        return this.vector.contains(item);
    }

    public boolean removeFirst(CallContext context, SubTransactionLifeCycleLinked item) {
        return this.vector.remove(item);
    }

    public void removeAll(CallContext context, SubTransactionLifeCycleLinked item, VectorOptimized.Notifier<SubTransactionLifeCycleLinked> notifier) {
        java.util.Iterator i = this.vector.iterator();
        while (i.hasNext()) {
            if (i.next() == item) {
                i.remove();
                if (notifier != null) { notifier.onRemove(context, item); }
            }
        }
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
