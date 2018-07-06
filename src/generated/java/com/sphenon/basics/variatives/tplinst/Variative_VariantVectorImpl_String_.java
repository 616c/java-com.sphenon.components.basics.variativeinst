// instantiated with jti.pl from Variative_VariantVectorImpl

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

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.search.*;
import com.sphenon.basics.encoding.*;
import com.sphenon.sm.tsm.*;
import com.sphenon.engines.aggregator.*;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;
import com.sphenon.basics.variatives.selectors.*;
import com.sphenon.basics.variatives.selectors.classes.*;
import com.sphenon.basics.variatives.selectors.factories.*;

public class Variative_VariantVectorImpl_String_
         implements Variative_VariantVector_String_,
                    OCPSerialisable
                    , TSMMapped
{
    static private String default_language = "en";
    protected Vector_Variant_String__long_ variants;

    public Variative_VariantVectorImpl_String_ (CallContext context) {
    }

    protected String getExactVariant_String_ (CallContext context, String isolang) {
        for (Iterator_Variant_String__ ivt = variants.getNavigator(context);
             ivt.canGetCurrent(context);
             ivt.next(context)) {
            Variant_String_ vt = ivt.tryGetCurrent(context);
            if (vt.getSelector(context) instanceof HumanLanguage && ((HumanLanguage) vt.getSelector(context)).getLanguage(context).equals(isolang)) {
                return vt.getValue(context);
            }
        }                        
        return null;
    }

    public class MyFinderOperations implements HumanLanguageVariantFinder.FinderOperations<String> {
        protected String result;
        public MyFinderOperations(CallContext context) {
            this.result = null;
        }
        public void addResult(CallContext context, String variant, String isolang) {
            if (variant == null) {
                variant = "---";
            }
            if (this.result == null) {
                this.result = variant;
            } else {
                this.result += " / " + variant;
            }
        }
        public String getResult(CallContext context, String isolang) {
            return (this.result == null ? ("[no variant: " + isolang + "]") : this.result);
        }
        public String getExactVariant(CallContext context, String isolang) {
            return getExactVariant_String_(context, isolang);
        }
    }

    protected String getVariant_String_ (CallContext context, String isolang) {
        return HumanLanguageVariantFinder.findVariant(context, new MyFinderOperations(context), isolang);
    }

    public String getVariant_String_ (CallContext context) {
        return getVariant_String_ (context, (String) null);
    }

    public String getVariant_String_ (CallContext context, VariantSelectors variant_selectors) {
        VariantSelector vs = (variant_selectors == null ? null : variant_selectors.tryGetSelector(context, com.sphenon.basics.variatives.selectors.HumanLanguage.class));
        if (vs == null) {
            return this.getVariant_String_(context);
        } else {
            return this.getVariant_String_(context, ((HumanLanguage) vs).getLanguage(context));
        }
    }

    public Vector_Variant_String__long_ getVariants (CallContext context) {
        if (variants == null) {
            variants = Factory_Vector_Variant_String__long_.construct(context);
        }
        return variants;
    }

    // Searchable ----------------------------------------------------------
    public String getSearchableFullText(CallContext context) {
        return SearchText.getFullText(context, this.getVariant_String_(context));
    }
    // static protected String[] search_text_tags = { "type" };
    public String[] getSearchableTags(CallContext context) {
        return null; // search_text_tags;
    }
    public String[] getSearchableTextByTag(CallContext context, String tag) {
        // if (tag.equals("type")) {
        //     String[] result = { this.getMediaType(context) };
        //     return result;
        // } else {
            return null;
        // }
    }
    // ---------------------------------------------------------------------

    public Object saveToPersistentType(CallContext context) {
        StringBuffer sb = new StringBuffer();
        boolean first = true;
        if (variants != null) {
            for (Iterator_Variant_String__ ivt = variants.getNavigator(context);
                 ivt.canGetCurrent(context);
                 ivt.next(context)) {
                if (first == false) { sb.append(","); }
                first = false;
                Variant_String_ vt = ivt.tryGetCurrent(context);
                String s = vt.getSelector(context).toString(context);
                String v = vt.getValue(context);
                s = Encoding.recode(context, s, Encoding.UTF8, Encoding.URI);
                v = Encoding.recode(context, v, Encoding.UTF8, Encoding.URI);
                sb.append(s);
                sb.append('=');
                sb.append(v);
            }
        }
        return sb.toString();
    }

    public Variative_VariantVectorImpl_String_ loadFromPersistentType(CallContext context, Object persistent_type) {
        String[] new_variants = ((String) persistent_type).split(",");
        if (new_variants != null) {
            this.variants = null;
            for (int i=0; i<new_variants.length; i++) {
                if (new_variants[i].isEmpty() == false) {
                    String[] variant = new_variants[i].split("=", 2);
                    String s = Encoding.recode(context, variant[0], Encoding.URI, Encoding.UTF8);
                    String v = Encoding.recode(context, variant[1], Encoding.URI, Encoding.UTF8);
                    this.getVariants(context).append(context, new VariantImpl_String_(context, Factory_VariantSelector.construct(context, s), v));
                }
            }
        }
        return this;
    }

    // -----------------------------------------------------------------------
    // -- OCP Serialise ------------------------------------------------------
    
    public String ocpDefaultName(CallContext context) {
        return "Variants";
    }
    
    public String ocpClass(CallContext context) {
        return "Variative_VariantVector_String_";
    }
    
    public String ocpRetriever(CallContext context) {
        return null;
    }
    
    public String ocpFactory(CallContext context) {
        return null;
    }
    
    public boolean ocpContainsData(CallContext context) {
        return false;
    }
    
    public boolean ocpEmpty(CallContext context) {
        return (variants == null || variants.getSize(context) == 0 ? true : false);
    }

    public void ocpSerialise(CallContext context, com.sphenon.engines.aggregator.OCPSerialiser serialiser, boolean as_reference) {
        if (variants != null) {
            for (Iterator_Variant_String__ ivt = variants.getNavigator(context);
                 ivt.canGetCurrent(context);
                 ivt.next(context)) {
                Variant_String_ vt = ivt.tryGetCurrent(context);
                String s = vt.getSelector(context).toString(context);
                String v = vt.getValue(context);
                serialiser.serialise(context, v, s, false);
            }
        }
    }
    
    // -----------------------------------------------------------------------
}
