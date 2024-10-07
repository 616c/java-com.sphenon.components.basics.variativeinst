// instantiated with jti.pl from OSet
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

public interface OSet_VariantSelector_Type_
  extends ReadMap_Set_VariantSelector__Type_,
          WriteSet_VariantSelector_,
          Navigatable_Iterator_VariantSelector__,
          OfKnownSize
{
    public Set_VariantSelector_ get        (CallContext context, Type index) throws DoesNotExist;
    public Set_VariantSelector_ tryGet     (CallContext context, Type index);
    public boolean       canGet     (CallContext context, Type index);

    public Set_VariantSelector_ getMany    (CallContext context, Type index) throws DoesNotExist;
    public Set_VariantSelector_ tryGetMany (CallContext context, Type index);
    public boolean       canGetMany (CallContext context, Type index);

    public VariantSelector      getSole    (CallContext context, Type index) throws DoesNotExist, MoreThanOne;
    public VariantSelector      tryGetSole (CallContext context, Type index);
    public boolean       canGetSole (CallContext context, Type index);

    public void          set        (CallContext context, VariantSelector item);
    public void          add        (CallContext context, VariantSelector item) throws AlreadyExists;
    public void          replace    (CallContext context, VariantSelector item) throws DoesNotExist;
    public void          unset      (CallContext context, VariantSelector item);
    public void          remove     (CallContext context, VariantSelector item) throws DoesNotExist;

    public Iterator_VariantSelector_ getNavigator (CallContext context);

    public long          getSize (CallContext context);
}

