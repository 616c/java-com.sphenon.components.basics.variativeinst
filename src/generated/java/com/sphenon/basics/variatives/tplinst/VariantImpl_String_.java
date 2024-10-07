// instantiated with jti.pl from VariantImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.variatives.*;

public class VariantImpl_String_
         implements Variant_String_ {

    public VariantImpl_String_ (CallContext context, VariantSelector selector, String value) {
        this.selector = selector;
        this.value = value;
    }

    protected VariantSelector selector;

    public VariantSelector getSelector (CallContext context) {
        return selector;
    }

    protected String value;

    public String            getValue    (CallContext context) {
        return value;
    }

    public void            setValue    (CallContext context, String value) {
        this.value = value;
    }
}

