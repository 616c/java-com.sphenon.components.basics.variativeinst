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

public class VariativeTrivial_RichText_ implements Variative_RichText_
{
    protected RichText value;

    protected VariativeTrivial_RichText_ (CallContext cc, RichText value) {
        this.value = value;
    }

    static public VariativeTrivial_RichText_ createVariativeTrivial_RichText_ (CallContext cc, RichText value) {
        return new VariativeTrivial_RichText_(cc, value);
    }

    static public VariativeTrivial_RichText_ create (CallContext cc, RichText value) {
        return new VariativeTrivial_RichText_(cc, value);
    }

    public RichText get(CallContext cc) {
        return value;
    }

    public RichText get(CallContext cc, String isolang) {
        return value;
    }

    public RichText getVariant_RichText_ (CallContext context) {
        return value;
    }

    public RichText getVariant_RichText_ (CallContext context, VariantSelectors variant_selectors) {
        return value;
    }

    public RichText getVariant(CallContext context) {
        return this.getVariant_RichText_(context);
    }

    public RichText getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_RichText_(context, variant_selectors);
    }

    public String toString () {
        return "[Variative:" + value.toString() + "]";
    }

    // Searchable ----------------------------------------------------------
    public String getSearchableFullText(CallContext context) {
        return SearchText.getFullText(context, this.getVariant_RichText_(context));
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
