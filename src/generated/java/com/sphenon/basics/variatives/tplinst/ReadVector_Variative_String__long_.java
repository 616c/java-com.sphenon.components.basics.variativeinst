// instantiated with jti.pl from ReadVector
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.many.*;
import com.sphenon.basics.variatives.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

public interface ReadVector_Variative_String__long_
{
    public Variative_String_                                    get             (CallContext context, long index) throws DoesNotExist;
    public Variative_String_                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Variative_String__long_ReadOnlyVector_Variative_String__long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Variative_String__long_ReadOnlyVector_Variative_String__long__  tryGetReference (CallContext context, long index);
}

