// instantiated with jti.pl from Factory_Variative_VariantVector

/****************************************************************************
  Copyright 2001-2018 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/
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

public class Factory_Variative_VariantVector_Image_ {

    /* -------------- extensible factory instantiation --------------------------------------------------------------------------------------- */
    static protected Configuration config;
    static protected FactoryInstantiator<Factory_Variative_VariantVector_Image_> factory_instantiator;
    static {
      CallContext context = RootContext.getInitialisationContext();
      config = Configuration.create(context, "com.sphenon.basics.variatives.tplinst.Factory_Variative_VariantVector_Image_");
      factory_instantiator = new FactoryInstantiator(context, Factory_Variative_VariantVector_Image_.class) { protected Factory_Variative_VariantVector_Image_ createDefault(CallContext context) { return new Factory_Variative_VariantVector_Image_(context); } };
    };
    /* --------------------------------------------------------------------------------------------------------------------------------------- */
    static public Factory_Variative_VariantVector_Image_ newInstance (CallContext context) {
        return factory_instantiator.newInstance(context);
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    protected Factory_Variative_VariantVector_Image_ (CallContext context) {
    }

    static public Variative_VariantVector_Image_ construct (CallContext context) {
        return newInstance(context).create(context);
    }

    static public Variative_VariantVector_Image_ construct (CallContext context, Object... arguments) {
        Factory_Variative_VariantVector_Image_ factory = new Factory_Variative_VariantVector_Image_(context);
        int size = arguments.length / 2;
        if (size != 0) {
            String[] names  = new String[size];
            Image[]   values = new Image  [size];
            for (int i=0, j=0; i<size; i++) {
                names [i] = (String) arguments[j++];
                Object value = arguments[j++];
                values[i] = (Image) value;
            }
            factory.set_ParametersAtOnce(context, names, values);
        }
        return factory.create(context);
    }

    protected String[] names;
    protected Image[] values;

    public Variative_VariantVector_Image_ create (CallContext context) {
        Variative_VariantVector_Image_ vvv = new Variative_VariantVectorImpl_Image_(context);
        Vector_Variant_Image__long_ variants = vvv.getVariants (context);
        if (names != null && values != null) {
            for (int i=0; i<names.length; i++) {
                variants.append(context, new VariantImpl_Image_(context, new HumanLanguageClass(context, names[i].replaceFirst("hl-","")), values[i]));
                // naja, eigentlich "add" statt "set"
                // und naja: wegen "hl-"; eigentlich sollten hier mal diverse verschiedene Präfixes erlaubt
                // werden, hl für human languages, derzeit funktioniert halt bloß sowohl_de_ als auch
                // <hl-de>, letzteres ist sauberer, aber es wird auch oft_de_ benutzt, macht als default
                // ja auch Sinn
            }
        }
        return vvv;
    }

    public void set_ParametersAtOnce(CallContext call_context, String[] names, Image[] values) {
        if (names.length != values.length) {
            Context context = Context.create(call_context);
            CustomaryContext cc = CustomaryContext.create(context);
            cc.throwPreConditionViolation(context, ManyStringPool.get(context, "0.5.0" /* Number of names differs from number of values */));
        }
        this.names = names;
        this.values = values;
    }
}
