// instantiated with jti.pl from OSet_SingleVector_IteratorImpl

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
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.monitoring.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

import java.util.Hashtable;

public class OSet_SingleVector_IteratorImpl_VariantSelector_Type_
    implements Iterator_VariantSelector_,
               Cloneable
{
    private java.util.Vector vector;
    private java.util.ListIterator list_iterator;
    private VariantSelector current_item;

    public OSet_SingleVector_IteratorImpl_VariantSelector_Type_ (CallContext context, java.util.Vector vector) {
        this.vector = vector;
        this.list_iterator = vector.listIterator();
        this.next(context);
    }

    public void     next          (CallContext context) {
        if (this.list_iterator.hasNext()) {
            this.current_item = (VariantSelector) this.list_iterator.next();
        } else {
            this.current_item = null;
        }
    }

    public VariantSelector getCurrent    (CallContext context) throws DoesNotExist {
        if (this.current_item == null) {
            DoesNotExist.createAndThrow(context);
        }
        return this.current_item;
    }

    public VariantSelector tryGetCurrent (CallContext context) {
        return this.current_item;
    }

    public boolean  canGetCurrent (CallContext context) {
        return this.current_item == null ? false : true;
    }

    public OSet_SingleVector_IteratorImpl_VariantSelector_Type_ clone(CallContext context) {
        try {
            return (OSet_SingleVector_IteratorImpl_VariantSelector_Type_) super.clone();
        } catch (CloneNotSupportedException cnse) { return null; }
    }
}
