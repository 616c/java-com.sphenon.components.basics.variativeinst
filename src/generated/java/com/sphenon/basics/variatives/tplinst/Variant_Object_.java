// instantiated with jti.pl from Variant
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.variatives.*;

public interface Variant_Object_ {
    public VariantSelector getSelector (CallContext context);
    public Object            getValue    (CallContext context);
    public void            setValue    (CallContext context, Object value);
}

