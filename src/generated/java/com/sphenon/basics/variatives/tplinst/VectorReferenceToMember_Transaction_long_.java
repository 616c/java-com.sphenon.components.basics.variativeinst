// instantiated with jti.pl from VectorReferenceToMember

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
import com.sphenon.basics.reference.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.message.*;
import com.sphenon.basics.monitoring.*;

import com.sphenon.basics.many.returncodes.*;

public class VectorReferenceToMember_Transaction_long_
    implements ReferenceToMember_Transaction_long_ReadOnlyVector_Transaction_long__
{
    private ReadOnlyVector_Transaction_long_ vector;
    private long                          index;

    public VectorReferenceToMember_Transaction_long_ (CallContext context, ReadOnlyVector_Transaction_long_ vector, long index) {
        this.vector = vector;
        this.index  = index;
        assert vector.canGet(context, this.index) : SystemStateMessage.create(context, MessageText.create(context, "VectorIndex created with invalid index '%(index)'", "index", t.s(index)), ProblemState.ERROR);
    }

    public ReadOnlyVector_Transaction_long_ getContainer (CallContext context) {
        return this.vector;
    }

    public long getIndex (CallContext context) {
        return this.index;
    }

    public Transaction get (CallContext context) {
            try {
            return vector.get(context, this.index);
        } catch (DoesNotExist dne) {
            CustomaryContext.create(Context.create(context)).throwPreConditionViolation(context, dne, "VectorIndex contains invalid index '%(index)'", "index", t.s(index));
            throw (ExceptionPreConditionViolation) null; // compiler insists
        }
    }

    public boolean equals (Object object) {
        if (object == null) return false;
        if (! (object instanceof VectorReferenceToMember_Transaction_long_)) return false;
        if (((VectorReferenceToMember_Transaction_long_) object).vector != this.vector) return false;
        if (((VectorReferenceToMember_Transaction_long_) object).index  != this.index ) return false;
        return true;
    }

    public int hashCode () {
        return (this.vector.hashCode() ^ (int) this.index);
    }
}
