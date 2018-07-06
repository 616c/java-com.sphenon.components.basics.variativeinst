// instantiated with jti.pl from VectorIteratorImpl

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
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

import java.util.Hashtable;

public class VectorIteratorImpl_SubTransactionLifeCycleLinked_long_
    implements IteratorItemIndex_SubTransactionLifeCycleLinked_long_,
               Cloneable
{
    private ReadOnlyVector_SubTransactionLifeCycleLinked_long_ vector;
    private long current_index;

    public VectorIteratorImpl_SubTransactionLifeCycleLinked_long_ (CallContext context, ReadOnlyVector_SubTransactionLifeCycleLinked_long_ vector) {
        this.vector = vector;
        this.current_index = 0;
    }

    public void     next          (CallContext context) {
        // if (this.current_index < this.vector.getSize(context))
           this.current_index++;
    }

    public long getCurrentIndex (CallContext context) throws DoesNotExist {
        return this.current_index;
    }

    public long tryGetCurrentIndex (CallContext context) {
        return this.current_index;
    }

    public SubTransactionLifeCycleLinked getCurrent    (CallContext context) throws DoesNotExist {
        return vector.get(context, this.current_index);
    }

    public SubTransactionLifeCycleLinked tryGetCurrent (CallContext context) {
        return vector.tryGet(context, this.current_index);
    }

    public boolean  canGetCurrent (CallContext context) {
        return vector.canGet(context, this.current_index);
    }

    public Reference_SubTransactionLifeCycleLinked_ getReferenceToCurrent (CallContext context) throws DoesNotExist {
        return vector.getReference(context, this.current_index);
    }

    public Reference_SubTransactionLifeCycleLinked_ tryGetReferenceToCurrent (CallContext context) {
        return vector.tryGetReference(context, this.current_index);
    }

    public VectorIteratorImpl_SubTransactionLifeCycleLinked_long_ clone(CallContext context) {
        try {
            return (VectorIteratorImpl_SubTransactionLifeCycleLinked_long_) super.clone();
        } catch (CloneNotSupportedException cnse) { return null; }
    }
}
