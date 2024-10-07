package com.sphenon.basics.variatives.factories;

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
import com.sphenon.basics.configuration.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;
import com.sphenon.basics.many.traits.*;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;

public class Factory_StringPool
{
    protected StringPoolConfiguration instance;

    public StringPool precreateStringPool (CallContext context) {
        if (this.instance == null) {
            this.instance = StringPoolConfiguration.precreate(context);
        }
        return this.instance;
    }

    public StringPool createStringPool (CallContext context) {
        StringPoolConfiguration instance = this.instance;
        this.instance = null;
        if (instance == null) {
            instance = StringPoolConfiguration.precreate(context);
        }
        instance.setConfigurationPrefix(context, this.configuration_prefix);
        return instance;
    }

    protected String configuration_prefix;

    public String getConfigurationPrefix (CallContext context) {
        return this.configuration_prefix;
    }

    public void setConfigurationPrefix (CallContext context, String configuration_prefix) {
        this.configuration_prefix = configuration_prefix;
    }
}
