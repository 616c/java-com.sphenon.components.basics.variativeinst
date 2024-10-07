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

public interface ReferenceToMember_Transaction_long_ReadOnlyVector_Transaction_long__
  extends Reference_Transaction_
    , ReferenceToMember<Transaction,ReadOnlyVector<Transaction>>
{
    public ReadOnlyVector_Transaction_long_ getContainer(CallContext context);
    public long     getIndex    (CallContext context);
}
