// instantiated with jti.pl from DataSlotImpl

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
import com.sphenon.basics.data.*;

import com.sphenon.basics.context.*;

public class DataSlotImpl_Data_MediaObject_
    implements DataSlot_Data_MediaObject_ {

    Data_MediaObject data;

    public DataSlotImpl_Data_MediaObject_ (CallContext context) {
    }

    public DataSlotImpl_Data_MediaObject_ (CallContext context, Data_MediaObject data) {
        this.data = data;
    }

    public void set(CallContext context, Data_MediaObject data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (Data_MediaObject)data);
    }

    public Data_MediaObject get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
