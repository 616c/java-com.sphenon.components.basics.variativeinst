// instantiated with jti.pl from Factory_Variant
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.configuration.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.factory.*;

import com.sphenon.basics.variatives.*;

public class Factory_Variant_Object_ {

    /* -------------- extensible factory instantiation --------------------------------------------------------------------------------------- */
    static protected Configuration config;
    static protected FactoryInstantiator<Factory_Variant_Object_> factory_instantiator;
    static {
      CallContext context = RootContext.getInitialisationContext();
      config = Configuration.create(context, "com.sphenon.basics.variatives.tplinst.Factory_Variant_Object_");
      factory_instantiator = new FactoryInstantiator(context, Factory_Variant_Object_.class) { protected Factory_Variant_Object_ createDefault(CallContext context) { return new Factory_Variant_Object_(context); } };
    };
    /* --------------------------------------------------------------------------------------------------------------------------------------- */
    static public Factory_Variant_Object_ newInstance (CallContext context) {
        return factory_instantiator.newInstance(context);
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    protected Factory_Variant_Object_ (CallContext context) {
    }

    static public Variant_Object_ construct (CallContext context) {
        return newInstance(context).create(context);
    }

    static public Variant_Object_ construct (CallContext context, VariantSelector selector, Object value) {
        Factory_Variant_Object_ factory = newInstance(context);
        factory.setSelector(context, selector);
        factory.setValue   (context, value);
        return factory.create(context);
    }

    public Variant_Object_ create (CallContext context) {
        VariantImpl_Object_ result = new VariantImpl_Object_(context, this.selector, this.value);
        return result;
    }

    // Attributes -------------------------------------------------------------------------------

    protected VariantSelector selector;

    public VariantSelector getSelector (CallContext context) {
        return selector;
    }

    public void            setSelector (CallContext context, VariantSelector selector) {
        this.selector = selector;
    }

    protected Object value;

    public Object            getValue    (CallContext context) {
        return value;
    }

    public void            setValue    (CallContext context, Object value) {
        this.value = value;
    }
}

