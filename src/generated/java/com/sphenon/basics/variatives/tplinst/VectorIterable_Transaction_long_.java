// instantiated with jti.pl from VectorIterable
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

public class VectorIterable_Transaction_long_ implements Iterable<Transaction>
{
    protected java.util.Iterator<Transaction> iterator;

    public VectorIterable_Transaction_long_ (CallContext context, Vector_Transaction_long_ vector) {
        this.iterator = (vector == null ? (new java.util.Vector<Transaction>()).iterator() : vector.getIterator_Transaction_(context));
    }

    public java.util.Iterator<Transaction> iterator () {
        return this.iterator;
    }
}

