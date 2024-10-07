// instantiated with jti.pl from DataSlotImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.data.*;

import com.sphenon.basics.context.*;

public class DataSlotImpl_Data_MediaObject_
    implements DataSlot_Data_MediaObject_ {

    Data_MediaObject data;

    public DataSlotImpl_Data_MediaObject_ (CallContext context) {
    }

    public DataSlotImpl_Data_MediaObject_ (CallContext context, Data_MediaObject data) {
        this.data = data;
    }

    public void set(CallContext context, Data_MediaObject data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (Data_MediaObject)data);
    }

    public Data_MediaObject get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
