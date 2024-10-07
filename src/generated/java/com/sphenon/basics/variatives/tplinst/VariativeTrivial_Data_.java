// instantiated with jti.pl from VariativeTrivial
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.data.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.search.*;

import com.sphenon.basics.variatives.*;

public class VariativeTrivial_Data_ implements Variative_Data_
{
    protected Data value;

    protected VariativeTrivial_Data_ (CallContext cc, Data value) {
        this.value = value;
    }

    static public VariativeTrivial_Data_ createVariativeTrivial_Data_ (CallContext cc, Data value) {
        return new VariativeTrivial_Data_(cc, value);
    }

    static public VariativeTrivial_Data_ create (CallContext cc, Data value) {
        return new VariativeTrivial_Data_(cc, value);
    }

    public Data get(CallContext cc) {
        return value;
    }

    public Data get(CallContext cc, String isolang) {
        return value;
    }

    public Data getVariant_Data_ (CallContext context) {
        return value;
    }

    public Data getVariant_Data_ (CallContext context, VariantSelectors variant_selectors) {
        return value;
    }

    public Data getVariant(CallContext context) {
        return this.getVariant_Data_(context);
    }

    public Data getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_Data_(context, variant_selectors);
    }

    public String toString () {
        return "[Variative:" + value.toString() + "]";
    }

    // Searchable ----------------------------------------------------------
    public String getSearchableFullText(CallContext context) {
        return SearchText.getFullText(context, this.getVariant_Data_(context));
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
