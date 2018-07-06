// instantiated with jti.pl from VectorImplListSynchronised

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
import com.sphenon.basics.quantities.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;

import com.sphenon.basics.many.returncodes.*;

public class VectorImplListSynchronised_Variant_String__long_
  extends VectorImplList_Variant_String__long_ {

    protected VectorImplListSynchronised_Variant_String__long_ (CallContext context) {
        super(context);
    }

    static public VectorImplListSynchronised_Variant_String__long_ create (CallContext context) {
        return new VectorImplListSynchronised_Variant_String__long_(context);
    }

    protected VectorImplListSynchronised_Variant_String__long_ (CallContext context, java.util.List vector) {
        super(context, vector);
    }

    static public VectorImplListSynchronised_Variant_String__long_ create (CallContext context, java.util.List vector) {
        return new VectorImplListSynchronised_Variant_String__long_(context, vector);
    }

    public synchronized Variant_String_ get          (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variant_String_) vector.get((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
    }

    public synchronized Variant_String_ tryGet       (CallContext context, long index) {
        try {
            return (Variant_String_) vector.get((int) index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public synchronized boolean  canGet       (CallContext context, long index) {
        return (index >= 0 && index < vector.size()) ? true : false;
    }

    public VectorReferenceToMember_Variant_String__long_ getReference    (CallContext context, long index) throws DoesNotExist {
        if ( ! canGet(context, index)) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
        return new VectorReferenceToMember_Variant_String__long_(context, this, index);
    }

    public VectorReferenceToMember_Variant_String__long_ tryGetReference (CallContext context, long index) {
        if ( ! canGet(context, index)) { return null; }
        return new VectorReferenceToMember_Variant_String__long_(context, this, index);
    }

    public synchronized Variant_String_ set          (CallContext context, long index, Variant_String_ item) {
        while (index > vector.size()) { vector.add(null); }
        if( index == vector.size()) {
            vector.add(item);
            return null;
        } else {
            return (Variant_String_) vector.set((int) index, item);
        }
    }

    public synchronized void     add          (CallContext context, long index, Variant_String_ item) throws AlreadyExists {
        if (index < vector.size()) { AlreadyExists.createAndThrow (context); }
        set(context, index, item);
    }

    public synchronized void     prepend      (CallContext call_context, Variant_String_ item) {
        if (vector.size() == 0) {
            vector.add(item);
        } else {
            vector.add(0, item);
        }
    }

    public synchronized void     append       (CallContext context, Variant_String_ item) {
        vector.add(item);
    }

    public synchronized void     insertBefore (CallContext context, long index, Variant_String_ item) throws DoesNotExist {
        try {
            vector.add((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(context);
        }
    }

    public synchronized void     insertBehind (CallContext context, long index, Variant_String_ item) throws DoesNotExist {
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

    public synchronized Variant_String_ replace      (CallContext call_context, long index, Variant_String_ item) throws DoesNotExist {
        try {
            return (Variant_String_) vector.set((int) index, item);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow(call_context);
            throw (DoesNotExist) null;
        }
    }

    public synchronized Variant_String_ unset        (CallContext context, long index) {
        try {
            return (Variant_String_) vector.remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            // we kindly ignore this exception
            return null;
        }
    }

    public synchronized Variant_String_ remove       (CallContext context, long index) throws DoesNotExist {
        try {
            return (Variant_String_) vector.remove((int) index);
        } catch (IndexOutOfBoundsException e) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null;
        }
    }

    public IteratorItemIndex_Variant_String__long_ getNavigator (CallContext context) {
        return new VectorIteratorImpl_Variant_String__long_ (context, this);
    }

    public synchronized long     getSize      (CallContext context) {
        return vector.size();
    }

    // to be used with care
    public java.util.List getImplementationList (CallContext context) {
        return this.vector;
    }

    public java.util.Iterator<Variant_String_> getIterator_Variant_String__ (CallContext context) {
        return this.vector.iterator();
    }

    public java.util.Iterator getIterator (CallContext context) {
        return getIterator_Variant_String__(context);
    }

    public VectorIterable_Variant_String__long_ getIterable_Variant_String__ (CallContext context) {
        return new VectorIterable_Variant_String__long_(context, this);
    }

    public Iterable<Variant_String_> getIterable (CallContext context) {
        return getIterable_Variant_String__ (context);
    }
}
