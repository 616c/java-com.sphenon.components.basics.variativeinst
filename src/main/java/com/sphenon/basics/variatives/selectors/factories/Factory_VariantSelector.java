package com.sphenon.basics.variatives.selectors.factories;

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

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;
import com.sphenon.basics.variatives.factories.*;
import com.sphenon.basics.variatives.selectors.*;
import com.sphenon.basics.variatives.selectors.classes.*;
import com.sphenon.basics.variatives.selectors.factories.*;

public class Factory_VariantSelector {

    static public VariantSelector construct(CallContext context, String selector) {
        Factory_VariantSelector factory = new Factory_VariantSelector(context);
        factory.setSelector(context, selector);
        return factory.create(context);
    }

    public Factory_VariantSelector(CallContext context) {
    }

    protected String selector;

    public void setSelector(CallContext context, String selector) {
        this.selector = selector;
    }

    public String getSelector(CallContext context) {
        return this.selector;
    }

    public VariantSelector create (CallContext context) {
        String[] s = this.selector.split(":");
        if (s.length != 2) {
            CustomaryContext.create((Context)context).throwPreConditionViolation(context, "Invalid syntax of variant selector '%(selector)' (expected '<selector-id>:<selector-value>'", "selector", this.selector);
            throw (ExceptionPreConditionViolation) null; // compiler insists
        }
        
        VariantSelector vs = null;
        vs = HumanLanguageClass.tryCreate(context, s[0], s[1]);
        if (vs != null) { return vs; }

        CustomaryContext.create((Context)context).throwPreConditionViolation(context, "No matching implementation found for variant selector '%(selector)'", "selector", this.selector);
        throw (ExceptionPreConditionViolation) null; // compiler insists
    }
}

