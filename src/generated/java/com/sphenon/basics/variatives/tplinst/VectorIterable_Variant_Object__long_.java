// instantiated with jti.pl from VectorIterable
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

public class VectorIterable_Variant_Object__long_ implements Iterable<Variant_Object_>
{
    protected java.util.Iterator<Variant_Object_> iterator;

    public VectorIterable_Variant_Object__long_ (CallContext context, Vector_Variant_Object__long_ vector) {
        this.iterator = (vector == null ? (new java.util.Vector<Variant_Object_>()).iterator() : vector.getIterator_Variant_Object__(context));
    }

    public java.util.Iterator<Variant_Object_> iterator () {
        return this.iterator;
    }
}

