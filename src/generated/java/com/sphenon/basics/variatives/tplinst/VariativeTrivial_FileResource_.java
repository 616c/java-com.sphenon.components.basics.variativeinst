// instantiated with jti.pl from VariativeTrivial

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

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.search.*;

import com.sphenon.basics.variatives.*;

public class VariativeTrivial_FileResource_ implements Variative_FileResource_
{
    protected FileResource value;

    protected VariativeTrivial_FileResource_ (CallContext cc, FileResource value) {
        this.value = value;
    }

    static public VariativeTrivial_FileResource_ createVariativeTrivial_FileResource_ (CallContext cc, FileResource value) {
        return new VariativeTrivial_FileResource_(cc, value);
    }

    static public VariativeTrivial_FileResource_ create (CallContext cc, FileResource value) {
        return new VariativeTrivial_FileResource_(cc, value);
    }

    public FileResource get(CallContext cc) {
        return value;
    }

    public FileResource get(CallContext cc, String isolang) {
        return value;
    }

    public FileResource getVariant_FileResource_ (CallContext context) {
        return value;
    }

    public FileResource getVariant_FileResource_ (CallContext context, VariantSelectors variant_selectors) {
        return value;
    }

    public String toString () {
        return "[Variative:" + value.toString() + "]";
    }

    // Searchable ----------------------------------------------------------
    public String getSearchableFullText(CallContext context) {
        return SearchText.getFullText(context, this.getVariant_FileResource_(context));
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
