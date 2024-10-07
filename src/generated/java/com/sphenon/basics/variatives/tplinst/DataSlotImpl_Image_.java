// instantiated with jti.pl from DataSlotImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;

import com.sphenon.basics.context.*;

public class DataSlotImpl_Image_
    implements DataSlot_Image_ {

    Image data;

    public DataSlotImpl_Image_ (CallContext context) {
    }

    public DataSlotImpl_Image_ (CallContext context, Image data) {
        this.data = data;
    }

    public void set(CallContext context, Image data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (Image)data);
    }

    public Image get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
