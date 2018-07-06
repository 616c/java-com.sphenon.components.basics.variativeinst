// instantiated with jti.pl from ReadOnlyVector

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

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

public interface ReadOnlyVector_SubTransactionLifeCycleLinked_long_
  extends ReadVector_SubTransactionLifeCycleLinked_long_,
          ReadOnlyVector<SubTransactionLifeCycleLinked>,
          OfKnownSize
{
    public SubTransactionLifeCycleLinked                                    get             (CallContext context, long index) throws DoesNotExist;
    public SubTransactionLifeCycleLinked                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_SubTransactionLifeCycleLinked_long_ReadOnlyVector_SubTransactionLifeCycleLinked_long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_SubTransactionLifeCycleLinked_long_ReadOnlyVector_SubTransactionLifeCycleLinked_long__  tryGetReference (CallContext context, long index);
}
