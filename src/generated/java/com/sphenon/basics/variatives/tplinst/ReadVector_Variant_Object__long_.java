// instantiated with jti.pl from ReadVector
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

public interface ReadVector_Variant_Object__long_
{
    public Variant_Object_                                    get             (CallContext context, long index) throws DoesNotExist;
    public Variant_Object_                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Variant_Object__long_ReadOnlyVector_Variant_Object__long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Variant_Object__long_ReadOnlyVector_Variant_Object__long__  tryGetReference (CallContext context, long index);
}

