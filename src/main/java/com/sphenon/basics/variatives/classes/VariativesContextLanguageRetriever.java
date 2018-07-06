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
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.tplinst.*;
import com.sphenon.basics.variatives.selectors.*;

public class VariativesContextLanguageRetriever implements com.sphenon.basics.variatives.classes.HumanLanguageVariantFinder.LanguageRetriever {

    static protected VariativesContextLanguageRetriever singleton;

    static {
        singleton = new VariativesContextLanguageRetriever(RootContext.getInitialisationContext());
        HumanLanguageVariantFinder.setLanguageRetriever(RootContext.getInitialisationContext(), singleton);
    }

    static public void initialise (CallContext context) { }

    protected VariativesContextLanguageRetriever(CallContext context) {
        this.default_language = "en,de";
    }

    static public VariativesContextLanguageRetriever getSingleton(CallContext call_context) {
        return singleton;
    }

    protected String default_language;

    public String getDefaultLanguage (CallContext context) {
        return this.default_language;
    }

    public void setDefaultLanguage (CallContext context, String default_language) {
        if (default_language == null) {
            CustomaryContext.create((Context)context).throwPreConditionViolation(context, "Default language must not be empty (argument is null)");
            throw (ExceptionPreConditionViolation) null; // compiler insists
        }
        this.default_language = default_language;
    }

    public String getLanguage(CallContext context) {
        return getLanguage(context, null);
    }

    public String getLanguage(CallContext call_context, VariantSelectors vss) {
        Context context = Context.create(call_context);
        CustomaryContext cc = CustomaryContext.create(context);
        HumanLanguage hl;
        try {
            if (vss != null) {
                hl = (HumanLanguage) vss.tryGetSelector(context, HumanLanguage.class);
            } else {
                VariativesContext vc = VariativesContext.create(context);
                hl = (HumanLanguage) vc.getSelector(context, HumanLanguage.class);
            }
        } catch (ClassCastException cce) {
            cc.throwImpossibleState(context, "Selector in VariantSelectors of class HumanLanguage is not of class HumanLanguage");
            throw (ExceptionImpossibleState) null; // compiler insists
        }
        return (hl == null ? default_language : hl.getLanguage(context));
    }
}
