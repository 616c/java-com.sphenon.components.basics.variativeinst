// instantiated with jti.pl from DataSlotImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;

import com.sphenon.basics.context.*;

public class DataSlotImpl_RichText_
    implements DataSlot_RichText_ {

    RichText data;

    public DataSlotImpl_RichText_ (CallContext context) {
    }

    public DataSlotImpl_RichText_ (CallContext context, RichText data) {
        this.data = data;
    }

    public void set(CallContext context, RichText data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (RichText)data);
    }

    public RichText get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
