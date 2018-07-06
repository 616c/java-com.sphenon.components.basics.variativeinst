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

public class Variative_VariantVectorImpl_Image_
         implements Variative_VariantVector_Image_,
                    OCPSerialisable
{
    static private String default_language = "en";
    protected Vector_Variant_Image__long_ variants;

    public Variative_VariantVectorImpl_Image_ (CallContext context) {
    }

    protected Image getExactVariant_Image_ (CallContext context, String isolang) {
        for (Iterator_Variant_Image__ ivt = variants.getNavigator(context);
             ivt.canGetCurrent(context);
             ivt.next(context)) {
            Variant_Image_ vt = ivt.tryGetCurrent(context);
            if (vt.getSelector(context) instanceof HumanLanguage && ((HumanLanguage) vt.getSelector(context)).getLanguage(context).equals(isolang)) {
                return vt.getValue(context);
            }
        }                        
        return null;
    }

    public class MyFinderOperations implements HumanLanguageVariantFinder.FinderOperations<Image> {
        protected Image result;
        public MyFinderOperations(CallContext context) {
            this.result = null;
        }
        public void addResult(CallContext context, Image variant, String isolang) {
            if (variant == null) {
                variant = Class_Image.create(context, "novariant");
            }
            if (this.result == null) {
                this.result = variant;
            } else {
                if (this.result == null) { this.result = variant; } /* nicht kombiniert, aber immerhin erster != null */;
            }
        }
        public Image getResult(CallContext context, String isolang) {
            return (this.result == null ? (Class_Image.create(context, "novariant-" + isolang)) : this.result);
        }
        public Image getExactVariant(CallContext context, String isolang) {
            return getExactVariant_Image_(context, isolang);
        }
    }

    protected Image getVariant_Image_ (CallContext context, String isolang) {
        return HumanLanguageVariantFinder.findVariant(context, new MyFinderOperations(context), isolang);
    }

    public Image getVariant_Image_ (CallContext context) {
        return getVariant_Image_ (context, (String) null);
    }

    public Image getVariant_Image_ (CallContext context, VariantSelectors variant_selectors) {
        VariantSelector vs = (variant_selectors == null ? null : variant_selectors.tryGetSelector(context, com.sphenon.basics.variatives.selectors.HumanLanguage.class));
        if (vs == null) {
            return this.getVariant_Image_(context);
        } else {
            return this.getVariant_Image_(context, ((HumanLanguage) vs).getLanguage(context));
        }
    }

    public Vector_Variant_Image__long_ getVariants (CallContext context) {
        if (variants == null) {
            variants = Factory_Vector_Variant_Image__long_.construct(context);
        }
        return variants;
    }

    // Searchable ----------------------------------------------------------
    public String getSearchableFullText(CallContext context) {
        return SearchText.getFullText(context, this.getVariant_Image_(context));
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

    // -----------------------------------------------------------------------
    // -- OCP Serialise ------------------------------------------------------
    
    public String ocpDefaultName(CallContext context) {
        return "Variants";
    }
    
    public String ocpClass(CallContext context) {
        return "Variative_VariantVector_Image_";
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
            for (Iterator_Variant_Image__ ivt = variants.getNavigator(context);
                 ivt.canGetCurrent(context);
                 ivt.next(context)) {
                Variant_Image_ vt = ivt.tryGetCurrent(context);
                String s = vt.getSelector(context).toString(context);
                Image v = vt.getValue(context);
                serialiser.serialise(context, v, s, false);
            }
        }
    }
    
    // -----------------------------------------------------------------------
}
