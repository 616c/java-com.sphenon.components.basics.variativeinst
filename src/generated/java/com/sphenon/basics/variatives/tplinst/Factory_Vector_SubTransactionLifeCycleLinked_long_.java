// instantiated with jti.pl from Factory_Vector
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;
import com.sphenon.basics.many.tplinst.*;

public class Factory_Vector_SubTransactionLifeCycleLinked_long_
{
    private String[] names;
    private SubTransactionLifeCycleLinked[] values;

    static public Vector_SubTransactionLifeCycleLinked_long_ construct (CallContext context) {
        return (new Factory_Vector_SubTransactionLifeCycleLinked_long_(context)).create(context);
    }

    public Factory_Vector_SubTransactionLifeCycleLinked_long_ (CallContext context) {
    }

    public Factory_Vector_SubTransactionLifeCycleLinked_long_ () {
    }

    protected Vector_SubTransactionLifeCycleLinked_long_ instance;

    public Vector_SubTransactionLifeCycleLinked_long_ precreate (CallContext context) {
        return this.instance = VectorImpl_SubTransactionLifeCycleLinked_long_.create(context);
    }

    public Vector_SubTransactionLifeCycleLinked_long_ create (CallContext context) {
        Vector_SubTransactionLifeCycleLinked_long_ vector = (this.instance != null ? this.instance : VectorImpl_SubTransactionLifeCycleLinked_long_.create(context));
        this.instance = null;
        if (names != null && values != null) {
            for (int i=0; i<names.length; i++) {
                vector.set(context, i, values[i]); // naja, eigentlich "add" statt "set"
            }
        }
        return vector;
    }

    public void set_ParametersAtOnce(CallContext call_context, String[] names, SubTransactionLifeCycleLinked[] values) {
        if (names.length != values.length) {
            Context context = Context.create(call_context);
            CustomaryContext cc = CustomaryContext.create(context);
            cc.throwPreConditionViolation(context, ManyStringPool.get(context, "0.5.0" /* Number of names differs from number of values */));
        }
        this.names = names;
        this.values = values;
    }
}
