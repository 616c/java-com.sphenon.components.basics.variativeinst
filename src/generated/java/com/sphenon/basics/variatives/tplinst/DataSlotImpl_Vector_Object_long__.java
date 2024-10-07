// instantiated with jti.pl from DataSlotImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.many.tplinst.*;

import com.sphenon.basics.context.*;

public class DataSlotImpl_Vector_Object_long__
    implements DataSlot_Vector_Object_long__ {

    Vector_Object_long_ data;

    public DataSlotImpl_Vector_Object_long__ (CallContext context) {
    }

    public DataSlotImpl_Vector_Object_long__ (CallContext context, Vector_Object_long_ data) {
        this.data = data;
    }

    public void set(CallContext context, Vector_Object_long_ data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (Vector_Object_long_)data);
    }

    public Vector_Object_long_ get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
