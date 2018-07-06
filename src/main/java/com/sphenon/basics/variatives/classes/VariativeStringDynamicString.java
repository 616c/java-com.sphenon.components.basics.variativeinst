package com.sphenon.basics.variatives.classes;

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
import com.sphenon.basics.expression.*;
import com.sphenon.basics.expression.classes.*;
import com.sphenon.basics.variatives.*;

public class VariativeStringDynamicString implements VariativeString {
    protected DynamicString template = null;
    protected Scope scope = null;
    
    public VariativeStringDynamicString(CallContext context, String template) {
        this(context, template, null);
    }

    public VariativeStringDynamicString(CallContext context, String template, Scope scope) {
        this.template = new DynamicString(context, template);
        this.scope = scope;
    }
    
    static public VariativeStringDynamicString createVariativeStringDynamicString (CallContext context, String template) {
        return new VariativeStringDynamicString(context, template);
    }

    static public VariativeStringDynamicString createVariativeStringDynamicString (CallContext context, String template, Scope scope) {
        return new VariativeStringDynamicString(context, template, scope);
    }

    public String get (CallContext context) {
        return this.template.get(context, scope);
    }

    public String get (CallContext context, String isolang) {
        return this.template.get(context, new Class_Scope(context, null, this.scope, "humanlanguage", isolang));
    }

    public String getVariant_String_ (CallContext context) {
        return this.get(context);
    }

    public String getVariant_String_ (CallContext context, VariantSelectors variant_selectors) {
        VariantSelector vs = (variant_selectors == null ? null : variant_selectors.tryGetSelector(context, com.sphenon.basics.variatives.selectors.HumanLanguage.class));
        if (vs == null){
            return this.get(context);
        } else {
            return this.get(context, ((com.sphenon.basics.variatives.selectors.HumanLanguage) vs).getLanguage(context));
        }
    }
}
