package com.sphenon.basics.variatives.classes;

/****************************************************************************
  Copyright 2001-2024 Sphenon GmbH

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
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.util.*;

public class VariativeRichText_VariativeString implements VariativeRichText {

    protected VariativeString texts;
    protected String          media_type;

    protected VariativeRichText_VariativeString (CallContext context, VariativeString texts, String media_type) {
        this.texts      = texts;
        this.media_type = media_type;
    }

    static public VariativeRichText_VariativeString create (CallContext context, VariativeString texts, String media_type) {
        return new VariativeRichText_VariativeString(context, texts, media_type);
    }

    public RichText get(CallContext context) {
        return com.sphenon.basics.quantities.classes.Class_RichText.create(context, texts.get(context), media_type);
    }

    public RichText get(CallContext context, String isolang) {
        return com.sphenon.basics.quantities.classes.Class_RichText.create(context, texts.get(context, isolang), media_type);
    }

    public RichText getVariant_RichText_ (CallContext context) {
        return com.sphenon.basics.quantities.classes.Class_RichText.create(context, texts.getVariant_String_(context), media_type);
    }

    public RichText getVariant_RichText_ (CallContext context, VariantSelectors variant_selectors) {
        return com.sphenon.basics.quantities.classes.Class_RichText.create(context, texts.getVariant_String_(context, variant_selectors), media_type);
    }

    public RichText getVariant(CallContext context) {
        return this.getVariant_RichText_(context);
    }

    public RichText getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_RichText_(context, variant_selectors);
    }

    public String toString () {
        return texts.toString();
    }
}
