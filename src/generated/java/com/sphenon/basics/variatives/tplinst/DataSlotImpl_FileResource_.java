// instantiated with jti.pl from DataSlotImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;

import com.sphenon.basics.context.*;

public class DataSlotImpl_FileResource_
    implements DataSlot_FileResource_ {

    FileResource data;

    public DataSlotImpl_FileResource_ (CallContext context) {
    }

    public DataSlotImpl_FileResource_ (CallContext context, FileResource data) {
        this.data = data;
    }

    public void set(CallContext context, FileResource data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (FileResource)data);
    }

    public FileResource get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
