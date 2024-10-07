// instantiated with jti.pl from VectorIterable
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.many.*;
import com.sphenon.basics.variatives.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

public class VectorIterable_Variative_String__long_ implements Iterable<Variative_String_>
{
    protected java.util.Iterator<Variative_String_> iterator;

    public VectorIterable_Variative_String__long_ (CallContext context, Vector_Variative_String__long_ vector) {
        this.iterator = (vector == null ? (new java.util.Vector<Variative_String_>()).iterator() : vector.getIterator_Variative_String__(context));
    }

    public java.util.Iterator<Variative_String_> iterator () {
        return this.iterator;
    }
}

