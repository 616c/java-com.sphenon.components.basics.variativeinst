// instantiated with jti.pl from ReadOnlyVector
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

