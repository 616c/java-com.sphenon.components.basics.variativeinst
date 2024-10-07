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

public class VariativeTrivial_Object_ implements Variative_Object_
{
    protected Object value;

    protected VariativeTrivial_Object_ (CallContext cc, Object value) {
        this.value = value;
    }

    static public VariativeTrivial_Object_ createVariativeTrivial_Object_ (CallContext cc, Object value) {
        return new VariativeTrivial_Object_(cc, value);
    }

    static public VariativeTrivial_Object_ create (CallContext cc, Object value) {
        return new VariativeTrivial_Object_(cc, value);
    }

    public Object get(CallContext cc) {
        return value;
    }

    public Object get(CallContext cc, String isolang) {
        return value;
    }

    public Object getVariant_Object_ (CallContext context) {
        return value;
    }

    public Object getVariant_Object_ (CallContext context, VariantSelectors variant_selectors) {
        return value;
    }

    public Object getVariant(CallContext context) {
        return this.getVariant_Object_(context);
    }

    public Object getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_Object_(context, variant_selectors);
    }

    public String toString () {
        return "[Variative:" + value.toString() + "]";
    }

    // Searchable ----------------------------------------------------------
    public String getSearchableFullText(CallContext context) {
        return SearchText.getFullText(context, this.getVariant_Object_(context));
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
