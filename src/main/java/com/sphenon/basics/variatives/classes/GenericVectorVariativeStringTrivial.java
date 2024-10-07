package com.sphenon.basics.many;

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
import com.sphenon.basics.debug.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.interaction.*;
import com.sphenon.basics.event.*;
import com.sphenon.basics.event.tplinst.*;
import com.sphenon.basics.validation.returncodes.*;
import com.sphenon.ad.adcore.ModificationType;
import com.sphenon.engines.aggregator.*;
import com.sphenon.basics.data.*;
import com.sphenon.basics.metadata.Type;
import com.sphenon.basics.metadata.Typed;
import com.sphenon.basics.variatives.tplinst.*;
import com.sphenon.basics.variatives.classes.*;
import com.sphenon.basics.many.returncodes.*;

public class GenericVectorVariativeStringTrivial
  extends VectorAdapterBase<Variative_String_,String> {

    public GenericVectorVariativeStringTrivial (CallContext context, GenericVector<String> source_vector) {
        super(context, com.sphenon.basics.metadata.TypeManager.get(context, Variative_String_.class), source_vector);
    }

    public GenericVectorVariativeStringTrivial (CallContext context, DataSource<GenericVector<String>> source_vector_ds) {
        super(context, com.sphenon.basics.metadata.TypeManager.get(context, Variative_String_.class), source_vector_ds);
    }

    protected Variative_String_ convert(CallContext context, String source_item) {
        return source_item == null ? null : VariativeStringTrivial.create(context, source_item);
    }

    protected String reconvert(CallContext context, Variative_String_ target_item) {
        return target_item == null ? null : target_item.getVariant_String_(context);
    }
}
