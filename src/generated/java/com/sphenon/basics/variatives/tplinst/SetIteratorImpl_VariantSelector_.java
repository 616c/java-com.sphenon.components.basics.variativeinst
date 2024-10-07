// instantiated with jti.pl from SetIteratorImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.monitoring.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.customary.*;

import com.sphenon.basics.many.returncodes.*;

import java.util.Hashtable;

public class SetIteratorImpl_VariantSelector_
    implements Iterator_VariantSelector_
{
    private java.util.Hashtable map;
    private java.util.Set entry_set;
    private java.util.Iterator iterator;
    private VariantSelector current;

    public SetIteratorImpl_VariantSelector_ (CallContext context, java.util.Hashtable map) {
        this.map = map;
        this.entry_set = map.entrySet();
        this.iterator = entry_set.iterator();
        if (this.iterator.hasNext()) {
            java.util.Map.Entry me = (java.util.Map.Entry) this.iterator.next();
            this.current = (VariantSelector) me.getValue();
        } else {
            this.current = null;
        }
    }

    public void     next          (CallContext context)
    {
        if (this.iterator.hasNext()) {
            java.util.Map.Entry me = (java.util.Map.Entry) this.iterator.next();
            this.current = (VariantSelector) me.getValue();
        } else {
            this.current = null;
        }
    }

    public VariantSelector getCurrent    (CallContext context) throws DoesNotExist
    {
        if (this.current == null) DoesNotExist.createAndThrow(context);
        return this.current;
    }

    public VariantSelector tryGetCurrent (CallContext context)
    {
        return this.current;
    }

    public boolean  canGetCurrent (CallContext context)
    {
        return (this.current != null) ? true : false;
    }

    public SetIteratorImpl_VariantSelector_ clone(CallContext context) {
        CustomaryContext.create((Context)context).throwLimitation(context, "cannot clone, map entry set iterator is not cloneable");
        throw (ExceptionLimitation) null; // compiler insists
    }
}

