package com.sphenon.basics.variatives.factories;

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

import com.sphenon.basics.context.*;
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;
import com.sphenon.basics.validation.returncodes.*;

public class Factory_VariativeStringDynamic {
    protected String template;
    
    public void setTemplate (CallContext context, String template){
        this.template = template;
    }
    
    public VariativeString create (CallContext context) throws ValidationFailure {
        if (template != null){
            return VariativeStringDynamicString.createVariativeStringDynamicString(context, template);
        }
        ValidationFailure.createAndThrow(context, "Variative String factory needs exactly either parameter 'Template' (values given: template is '%(template)'", "template", template);
        throw (ValidationFailure) null; // compiler insists
    }
}
