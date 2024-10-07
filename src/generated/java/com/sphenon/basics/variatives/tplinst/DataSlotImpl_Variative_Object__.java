// instantiated with jti.pl from DataSlotImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;

import com.sphenon.basics.context.*;

public class DataSlotImpl_Variative_Object__
    implements DataSlot_Variative_Object__ {

    Variative_Object_ data;

    public DataSlotImpl_Variative_Object__ (CallContext context) {
    }

    public DataSlotImpl_Variative_Object__ (CallContext context, Variative_Object_ data) {
        this.data = data;
    }

    public void set(CallContext context, Variative_Object_ data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (Variative_Object_)data);
    }

    public Variative_Object_ get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
