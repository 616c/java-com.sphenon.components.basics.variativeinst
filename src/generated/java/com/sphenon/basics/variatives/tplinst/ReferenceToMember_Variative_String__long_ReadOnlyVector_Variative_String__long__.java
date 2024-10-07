// instantiated with jti.pl from ReferenceToMember
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.many.*;
import com.sphenon.basics.variatives.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.reference.*;
import com.sphenon.basics.many.*;

public interface ReferenceToMember_Variative_String__long_ReadOnlyVector_Variative_String__long__
  extends Reference_Variative_String__
    , ReferenceToMember<Variative_String_,ReadOnlyVector<Variative_String_>>
{
    public ReadOnlyVector_Variative_String__long_ getContainer(CallContext context);
    public long     getIndex    (CallContext context);
}
