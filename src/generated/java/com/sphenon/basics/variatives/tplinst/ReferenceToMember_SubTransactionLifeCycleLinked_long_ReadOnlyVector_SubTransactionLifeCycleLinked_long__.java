// instantiated with jti.pl from ReferenceToMember
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.reference.*;
import com.sphenon.basics.many.*;

public interface ReferenceToMember_SubTransactionLifeCycleLinked_long_ReadOnlyVector_SubTransactionLifeCycleLinked_long__
  extends Reference_SubTransactionLifeCycleLinked_
    , ReferenceToMember<SubTransactionLifeCycleLinked,ReadOnlyVector<SubTransactionLifeCycleLinked>>
{
    public ReadOnlyVector_SubTransactionLifeCycleLinked_long_ getContainer(CallContext context);
    public long     getIndex    (CallContext context);
}
