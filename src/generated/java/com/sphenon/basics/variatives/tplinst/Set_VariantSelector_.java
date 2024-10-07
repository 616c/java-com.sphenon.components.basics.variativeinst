// instantiated with jti.pl from Set
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.monitoring.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

public interface Set_VariantSelector_
  extends ReadSet_VariantSelector_,
          WriteSet_VariantSelector_,
          Navigatable_Iterator_VariantSelector__,
          OfKnownSize
{
    public boolean contains (CallContext context, VariantSelector item);

    public void     set     (CallContext context, VariantSelector item);
    public void     add     (CallContext context, VariantSelector item) throws AlreadyExists;
    public void     replace (CallContext context, VariantSelector item) throws DoesNotExist;
    public void     unset   (CallContext context, VariantSelector item);
    public void     remove  (CallContext context, VariantSelector item) throws DoesNotExist;

    public Iterator_VariantSelector_ getNavigator (CallContext context);

    public long     getSize (CallContext context);
}

