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

public class VariativeRichTextTrivial implements VariativeRichText {

    protected RichText text;

    protected VariativeRichTextTrivial (CallContext context, RichText text) {
        this.text = text;
    }

    static public VariativeRichTextTrivial createVariativeRichTextTrivial (CallContext context, RichText text) {
        return new VariativeRichTextTrivial(context, text);
    }

    static public VariativeRichTextTrivial create (CallContext context, RichText text) {
        return new VariativeRichTextTrivial(context, text);
    }

    static public VariativeRichTextTrivial create (CallContext context, String text, String media_type) {
        return new VariativeRichTextTrivial(context, com.sphenon.basics.quantities.classes.Class_RichText.create(context, text, media_type));
    }

    public RichText get(CallContext context) {
        return text;
    }

    public RichText get(CallContext context, String isolang) {
        return text;
    }

    public RichText getVariant_RichText_ (CallContext context) {
        return text;
    }

    public RichText getVariant_RichText_ (CallContext context, VariantSelectors variant_selectors) {
        return text;
    }

    public RichText getVariant(CallContext context) {
        return this.getVariant_RichText_(context);
    }

    public RichText getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_RichText_(context, variant_selectors);
    }

    public String toString () {
        return text.getText(RootContext.getFallbackCallContext());
    }

    static protected class VRTTEmpty extends VariativeRichTextTrivial implements Empty {
        public VRTTEmpty(CallContext context) {
            super(context, com.sphenon.basics.quantities.classes.Class_RichText.create(context, "", "text/plain"));
        }
    }
    static protected VRTTEmpty empty;
    static public VariativeRichTextTrivial getEmpty(CallContext context) {
        if (empty == null) {
            empty = new VRTTEmpty(context);
        }
        return empty;
    }
}
