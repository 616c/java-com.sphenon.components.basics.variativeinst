// instantiated with jti.pl from DataSlotImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;

import com.sphenon.basics.context.*;

public class DataSlotImpl_Variative_Image__
    implements DataSlot_Variative_Image__ {

    Variative_Image_ data;

    public DataSlotImpl_Variative_Image__ (CallContext context) {
    }

    public DataSlotImpl_Variative_Image__ (CallContext context, Variative_Image_ data) {
        this.data = data;
    }

    public void set(CallContext context, Variative_Image_ data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (Variative_Image_)data);
    }

    public Variative_Image_ get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
