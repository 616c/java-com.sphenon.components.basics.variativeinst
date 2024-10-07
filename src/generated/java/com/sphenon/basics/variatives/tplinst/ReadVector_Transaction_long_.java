// instantiated with jti.pl from ReadVector
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

public interface ReadVector_Transaction_long_
{
    public Transaction                                    get             (CallContext context, long index) throws DoesNotExist;
    public Transaction                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Transaction_long_ReadOnlyVector_Transaction_long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Transaction_long_ReadOnlyVector_Transaction_long__  tryGetReference (CallContext context, long index);
}

