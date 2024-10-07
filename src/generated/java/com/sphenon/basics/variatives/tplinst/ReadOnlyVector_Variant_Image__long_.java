// instantiated with jti.pl from ReadOnlyVector
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.tplinst.*;


import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

public interface ReadOnlyVector_Variant_Image__long_
  extends ReadVector_Variant_Image__long_,
          ReadOnlyVector<Variant_Image_>,
          OfKnownSize
{
    public Variant_Image_                                    get             (CallContext context, long index) throws DoesNotExist;
    public Variant_Image_                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Variant_Image__long_ReadOnlyVector_Variant_Image__long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Variant_Image__long_ReadOnlyVector_Variant_Image__long__  tryGetReference (CallContext context, long index);
}

