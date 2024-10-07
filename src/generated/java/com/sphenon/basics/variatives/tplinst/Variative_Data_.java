// instantiated with jti.pl from Variative
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.data.*;

import com.sphenon.basics.context.*;

import com.sphenon.basics.variatives.*;

public interface Variative_Data_
         extends Variative<Data>
{
    public Data getVariant_Data_ (CallContext context);
    public Data getVariant_Data_ (CallContext context, VariantSelectors variant_selectors);
}

