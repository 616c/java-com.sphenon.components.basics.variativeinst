package com.sphenon.basics.variatives.test;

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
import com.sphenon.basics.variatives.selectors.classes.*;

public class TestInst {

    public static void main(String[] args) {
        System.out.println( "main(inst)..." );
        Context context = RootContext.getRootContext();
        
        System.out.println( "main, some messages..." );

        System.out.println( "main, msg 1: " + VariativesTestStringPool.get(context, "0.0.0" /* Test Message Number One */) );

        System.out.println( "main, msg 2: " + VariativesTestStringPool.get(context, "0.0.1" /* Test Message Number Two */) );

        System.out.println( "main, auf Deutsch..." );

        VariativesContext vc = VariativesContext.create(context);
        vc.setSelector(context, new HumanLanguageClass(context, "de"));
        
        System.out.println( "haupt, nchrcht 1: " + VariativesTestStringPool.get(context, "0.0.0" /* Test Message Number One */) );

        System.out.println( "haupt, nchrcht 2: " + VariativesTestStringPool.get(context, "0.0.1" /* Test Message Number Two */) );

        System.out.println( "main done." );
    }
}

