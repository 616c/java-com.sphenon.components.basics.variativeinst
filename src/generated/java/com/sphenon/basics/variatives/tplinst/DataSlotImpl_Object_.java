// instantiated with jti.pl from DataSlotImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;

import com.sphenon.basics.context.*;

public class DataSlotImpl_Object_
    implements DataSlot_Object_ {

    Object data;

    public DataSlotImpl_Object_ (CallContext context) {
    }

    public DataSlotImpl_Object_ (CallContext context, Object data) {
        this.data = data;
    }

    public void set(CallContext context, Object data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (Object)data);
    }

    public Object get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
