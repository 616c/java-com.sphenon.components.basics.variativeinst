package com.sphenon.basics.variatives.classes;

/****************************************************************************
  Copyright 2001-2024 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.tplinst.*;
import com.sphenon.basics.variatives.selectors.*;

import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

public class Class_Variative_Image_LanguagePostfix implements Variative_Image_ {
    public Class_Variative_Image_LanguagePostfix (CallContext context, String name) {
        this.name = name;
    }

    protected String name;

    public String getName (CallContext context) {
        return this.name;
    }

    public void setName (CallContext context, String name) {
        this.name = name;
    }

    public Image getVariant_Image_ (CallContext context) {
        String isolang = VariativesContextLanguageRetriever.getSingleton(context).getLanguage(context);
        return Class_Image.create(context, this.name + "-" + isolang);
    }

    public Image getVariant_Image_ (CallContext context, VariantSelectors variant_selectors) {
        VariantSelector vs = (variant_selectors == null ? null : variant_selectors.tryGetSelector(context, com.sphenon.basics.variatives.selectors.HumanLanguage.class));
        if (vs == null) {
            return this.getVariant_Image_(context);
        } else {
            String isolang = ((HumanLanguage) vs).getLanguage(context);
            return Class_Image.create(context, this.name + "-" + isolang);
        }
    }

    public Image getVariant(CallContext context) {
        return this.getVariant_Image_(context);
    }

    public Image getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_Image_(context, variant_selectors);
    }
}

