// instantiated with jti.pl from Factory_OSet

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
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.monitoring.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.configuration.*;
import com.sphenon.basics.many.*;
import com.sphenon.basics.factory.*;
import com.sphenon.basics.validation.returncodes.*;

public class Factory_OSet_VariantSelector_Type_
{
    /* -------------- extensible factory instantiation --------------------------------------------------------------------------------------- */
    static protected Configuration config;
    static protected FactoryInstantiator<Factory_OSet_VariantSelector_Type_> factory_instantiator;
    static {
      CallContext context = RootContext.getInitialisationContext();
      config = Configuration.create(context, "com.sphenon.basics.variatives.tplinst.Factory_OSet_VariantSelector_Type_");
      reloadConfiguration(context);
    };
    static public void reloadConfiguration(CallContext context) {
      factory_instantiator = new FactoryInstantiator(context, Factory_OSet_VariantSelector_Type_.class) { protected Factory_OSet_VariantSelector_Type_ createDefault(CallContext context) { return new Factory_OSet_VariantSelector_Type_(context); } };
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */
    static public Factory_OSet_VariantSelector_Type_ newInstance (CallContext context) {
        return factory_instantiator.newInstance(context);
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    protected Factory_OSet_VariantSelector_Type_ (CallContext context) {
    }

    static public OSet_VariantSelector_Type_ construct (CallContext context) {
        return newInstance(context).create(context);
    }

    public OSet_VariantSelector_Type_ create (CallContext context) {
        OSet_VariantSelector_Type_ oset = new OSetImpl_VariantSelector_Type_(context);
        if (names != null && values != null) {
            for (int i=0; i<names.length; i++) {
                oset.set(context, values[i]);
                // naja, eigentlich "add" statt "set"
            }
        }
        return oset;
    }

    public Object createObject    (CallContext context) throws ValidationFailure {
        return create(context);
    }

    public void   reset           (CallContext context) {
    }

    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    protected String[] names;
    protected VariantSelector[] values;

    public void set_ParametersAtOnce(CallContext call_context, String[] names, VariantSelector[] values) {
        if (names.length != values.length) {
            Context context = Context.create(call_context);
            CustomaryContext cc = CustomaryContext.create(context);
            cc.throwPreConditionViolation(context, ManyStringPool.get(context, "0.2.0" /* number of names differs from number of values */));
        }
        this.names = names;
        this.values = values;
    }
}
