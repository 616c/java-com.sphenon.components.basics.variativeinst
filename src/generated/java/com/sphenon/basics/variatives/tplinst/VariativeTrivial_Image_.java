// instantiated with jti.pl from VariativeTrivial
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.search.*;

import com.sphenon.basics.variatives.*;

public class VariativeTrivial_Image_ implements Variative_Image_
{
    protected Image value;

    protected VariativeTrivial_Image_ (CallContext cc, Image value) {
        this.value = value;
    }

    static public VariativeTrivial_Image_ createVariativeTrivial_Image_ (CallContext cc, Image value) {
        return new VariativeTrivial_Image_(cc, value);
    }

    static public VariativeTrivial_Image_ create (CallContext cc, Image value) {
        return new VariativeTrivial_Image_(cc, value);
    }

    public Image get(CallContext cc) {
        return value;
    }

    public Image get(CallContext cc, String isolang) {
        return value;
    }

    public Image getVariant_Image_ (CallContext context) {
        return value;
    }

    public Image getVariant_Image_ (CallContext context, VariantSelectors variant_selectors) {
        return value;
    }

    public Image getVariant(CallContext context) {
        return this.getVariant_Image_(context);
    }

    public Image getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_Image_(context, variant_selectors);
    }

    public String toString () {
        return "[Variative:" + value.toString() + "]";
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
}
