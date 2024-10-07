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
import com.sphenon.basics.customary.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.tplinst.*;

public class VariantSelectorsClass implements VariantSelectors {
    static protected long notification_level;
    static public    long adjustNotifcationLevel(long new_level) { long old_level = notification_level; notification_level = new_level; return old_level; }
    static public    long getNotifcationLevel() { return notification_level; }
    static { notification_level = NotificationLocationContext.getLevel(RootContext.getInitialisationContext(), "com.sphenon.basics.variatives.VariantSelectorClass"); };

    private OSet_VariantSelector_Type_ selectors;

    public VariantSelectorsClass (CallContext context) {
        this.selectors = new OSetImpl_VariantSelector_Type_(context);
    }

    public VariantSelectorsClass (CallContext context, VariantSelector variant_selector) {
        this.selectors = new OSetImpl_VariantSelector_Type_(context);
        this.selectors.set(context, variant_selector);
    }

    public VariantSelector tryGetSelector(CallContext call_context, Class selector_class) {
        Context context = Context.create(call_context);
        CustomaryContext cc = CustomaryContext.create(context);
        Set_VariantSelector_ svs = selectors.tryGet(context, TypeManager.get(context, selector_class));
        if (svs == null) { return null; }
        Iterator_VariantSelector_ ivs = svs.getNavigator(context);
        VariantSelector vs = ivs.tryGetCurrent(context);
        if (vs == null) { return null; }
        ivs.next(context);
        if (ivs.canGetCurrent(context)) {
            if ((this.notification_level & Notifier.OBSERVATION) != 0) {
                cc.sendNotice(context, "Found more than one instance of '%(class)' in VariantSelectors, first one of type '%(first)' is used, others are ignored", "class", selector_class, "first", vs.getClass());
                // cannot use mulilingual message, since "send" method recursively
                // invokes this method here, which results in endless recursion
            }
        }
        return vs;
    }

    public OSet_VariantSelector_Type_ getSelectors (CallContext context) {
        return selectors;
    }
}
