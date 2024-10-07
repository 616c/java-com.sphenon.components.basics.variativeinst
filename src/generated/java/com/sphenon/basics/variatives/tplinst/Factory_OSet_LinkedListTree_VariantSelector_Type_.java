// instantiated with jti.pl from Factory_OSet_LinkedListTree
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.monitoring.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;

public class Factory_OSet_LinkedListTree_VariantSelector_Type_ extends Factory_OSet_VariantSelector_Type_
{
    public Factory_OSet_LinkedListTree_VariantSelector_Type_ (CallContext context) {
        super(context);
    }

    public OSet_VariantSelector_Type_ create (CallContext context) {
        OSet_VariantSelector_Type_ oset = new OSet_LinkedListTreeImpl_VariantSelector_Type_(context);
        if (names != null && values != null) {
            for (int i=0; i<names.length; i++) {
                oset.set(context, values[i]);
                // naja, eigentlich "add" statt "set"
            }
        }
        return oset;
    }
}
