package com.sphenon.basics.variatives;

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
//import com.sphenon.basics.configuration.*;
import com.sphenon.basics.variatives.tplinst.*;
import com.sphenon.basics.variatives.classes.*;

public class VariativesContext extends SpecificContext {

    static public VariativesContext getOrCreate(Context context) {
        VariativesContext variatives_context = (VariativesContext) context.getSpecificContext(VariativesContext.class);
        if (variatives_context == null) {
            variatives_context = new VariativesContext(context);
            context.setSpecificContext(VariativesContext.class, variatives_context);
        }
        return variatives_context;
    }

    static public VariativesContext get(Context context) {
        return (VariativesContext) context.getSpecificContext(VariativesContext.class);
    }

    static public VariativesContext create(Context context) {
        VariativesContext vc = new VariativesContext(context);
        context.setSpecificContext(VariativesContext.class, vc);
        return vc;
    }

    protected VariativesContext (Context context) {
        super(context);
        this.selectors = null;
    }

    protected VariantSelectorsClass selectors;

    public void setSelector (CallContext cc, VariantSelector selector) {
        if (this.selectors == null) {
            this.selectors = new VariantSelectorsClass(cc);
        }
        this.selectors.getSelectors(cc).set(cc, selector);
    }

    public VariantSelector getSelector(CallContext cc, Class selector_class) {
        VariantSelector vs = null;
        if (this.selectors != null && ((vs = this.selectors.tryGetSelector(cc, selector_class)) != null)) {
            return vs;
        }
        VariativesContext vc;
        return (vc = (VariativesContext) this.getCallContext(VariativesContext.class)) != null ?
                 vc.getSelector(cc, selector_class)
               : null
            ;
    }

    /**
       Get current contextual language specification. This is a sequence of
       ISO 639 language identifiers, according to the following scheme:
       <pre>
       lang[,lang,...][+lang[,lang,...]+...]
       </pre>
       I.e., languages combined with a plus sign shall be shown
       simultaneously, while commas separate alternatives. E.g.:
       <pre>
       de,en+fr,*debug*
       </pre>
       which means: show german or alternatively english plus french, if
       french is not available show debugging info
     */
    public String getLanguage(CallContext context) {
        return VariativesContextLanguageRetriever.getSingleton(context).getLanguage(context);
    }

    public String getMainLanguage(CallContext context) {
        return VariativesContextLanguageRetriever.getSingleton(context).getLanguage(context).split("[,+]")[0];
    }
}
