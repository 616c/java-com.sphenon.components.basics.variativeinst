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
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;
import com.sphenon.basics.validation.returncodes.*;

public class Factory_Variative_String_ {

    protected String     id;
    protected StringPool pool;
    protected String     text;
    protected String     template;

    public void setText (CallContext context, String text) {
        this.text = text;
    }

    public String defaultText (CallContext context) {
        return null;
    }
    
    public void setTemplate (CallContext context, String template){
        this.template = template;
    } 
    
    public String defaultTemplate (CallContext context){
        return null;
    }

    public void setId (CallContext context, String id) {
        this.id = id;
    }

    public String defaultId (CallContext context) {
        return null;
    }

    public void setPool (CallContext context, StringPool pool) {
        this.pool = pool;
    }

    public String defaultPool (CallContext context) {
        return null;
    }

    public VariativeString create (CallContext context) throws ValidationFailure {
        if (text != null && id == null && pool == null && template == null) {
            return VariativeStringTrivial.createVariativeStringTrivial(context, text);
        }
        if (text == null && id != null && pool != null) {
            return VariativeStringClass.createVariativeStringClass(context, id, pool);
        }
        if (template != null){
            return VariativeStringDynamicString.createVariativeStringDynamicString(context, template);
        }
        ValidationFailure.createAndThrow(context, "Variative String factory needs exactly either parameter 'Text' OR parameters 'Id' and 'Pool' (values given: text is '%(text)', id is '%(id)', pool is '%(pool)'", "text", text, "id", id, "pool", pool);
        throw (ValidationFailure) null; // compiler insists
    }
}
