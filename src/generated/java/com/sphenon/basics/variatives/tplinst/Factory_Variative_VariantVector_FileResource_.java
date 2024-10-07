// instantiated with jti.pl from Factory_Variative_VariantVector
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
import com.sphenon.basics.many.*;
import com.sphenon.basics.factory.*;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;
import com.sphenon.basics.variatives.selectors.classes.*;

public class Factory_Variative_VariantVector_FileResource_ {

    /* -------------- extensible factory instantiation --------------------------------------------------------------------------------------- */
    static protected Configuration config;
    static protected FactoryInstantiator<Factory_Variative_VariantVector_FileResource_> factory_instantiator;
    static {
      CallContext context = RootContext.getInitialisationContext();
      config = Configuration.create(context, "com.sphenon.basics.variatives.tplinst.Factory_Variative_VariantVector_FileResource_");
      factory_instantiator = new FactoryInstantiator(context, Factory_Variative_VariantVector_FileResource_.class) { protected Factory_Variative_VariantVector_FileResource_ createDefault(CallContext context) { return new Factory_Variative_VariantVector_FileResource_(context); } };
    };
    /* --------------------------------------------------------------------------------------------------------------------------------------- */
    static public Factory_Variative_VariantVector_FileResource_ newInstance (CallContext context) {
        return factory_instantiator.newInstance(context);
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    protected Factory_Variative_VariantVector_FileResource_ (CallContext context) {
    }

    static public Variative_VariantVector_FileResource_ construct (CallContext context) {
        return newInstance(context).create(context);
    }

    static public Variative_VariantVector_FileResource_ construct (CallContext context, Object... arguments) {
        Factory_Variative_VariantVector_FileResource_ factory = new Factory_Variative_VariantVector_FileResource_(context);
        int size = arguments.length / 2;
        if (size != 0) {
            String[] names  = new String[size];
            FileResource[]   values = new FileResource  [size];
            for (int i=0, j=0; i<size; i++) {
                names [i] = (String) arguments[j++];
                Object value = arguments[j++];
                values[i] = (FileResource) value;
            }
            factory.set_ParametersAtOnce(context, names, values);
        }
        return factory.create(context);
    }

    protected String[] names;
    protected FileResource[] values;

    public Variative_VariantVector_FileResource_ create (CallContext context) {
        Variative_VariantVector_FileResource_ vvv = new Variative_VariantVectorImpl_FileResource_(context);
        Vector_Variant_FileResource__long_ variants = vvv.getVariants (context);
        if (names != null && values != null) {
            for (int i=0; i<names.length; i++) {
                variants.append(context, new VariantImpl_FileResource_(context, new HumanLanguageClass(context, names[i].replaceFirst("hl-","")), values[i]));
                // naja, eigentlich "add" statt "set"
                // und naja: wegen "hl-"; eigentlich sollten hier mal diverse verschiedene Präfixes erlaubt
                // werden, hl für human languages, derzeit funktioniert halt bloß sowohl_de_ als auch
                // <hl-de>, letzteres ist sauberer, aber es wird auch oft_de_ benutzt, macht als default
                // ja auch Sinn
            }
        }
        return vvv;
    }

    public void set_ParametersAtOnce(CallContext call_context, String[] names, FileResource[] values) {
        if (names.length != values.length) {
            Context context = Context.create(call_context);
            CustomaryContext cc = CustomaryContext.create(context);
            cc.throwPreConditionViolation(context, ManyStringPool.get(context, "0.5.0" /* Number of names differs from number of values */));
        }
        this.names = names;
        this.values = values;
    }
}
