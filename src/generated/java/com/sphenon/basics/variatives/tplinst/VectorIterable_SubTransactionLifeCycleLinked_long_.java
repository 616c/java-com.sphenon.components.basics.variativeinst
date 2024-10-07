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

public class VectorIterable_SubTransactionLifeCycleLinked_long_ implements Iterable<SubTransactionLifeCycleLinked>
{
    protected java.util.Iterator<SubTransactionLifeCycleLinked> iterator;

    public VectorIterable_SubTransactionLifeCycleLinked_long_ (CallContext context, Vector_SubTransactionLifeCycleLinked_long_ vector) {
        this.iterator = (vector == null ? (new java.util.Vector<SubTransactionLifeCycleLinked>()).iterator() : vector.getIterator_SubTransactionLifeCycleLinked_(context));
    }

    public java.util.Iterator<SubTransactionLifeCycleLinked> iterator () {
        return this.iterator;
    }
}

