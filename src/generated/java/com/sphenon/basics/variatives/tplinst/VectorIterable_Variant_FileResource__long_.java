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

public class VectorIterable_Variant_FileResource__long_ implements Iterable<Variant_FileResource_>
{
    protected java.util.Iterator<Variant_FileResource_> iterator;

    public VectorIterable_Variant_FileResource__long_ (CallContext context, Vector_Variant_FileResource__long_ vector) {
        this.iterator = (vector == null ? (new java.util.Vector<Variant_FileResource_>()).iterator() : vector.getIterator_Variant_FileResource__(context));
    }

    public java.util.Iterator<Variant_FileResource_> iterator () {
        return this.iterator;
    }
}

