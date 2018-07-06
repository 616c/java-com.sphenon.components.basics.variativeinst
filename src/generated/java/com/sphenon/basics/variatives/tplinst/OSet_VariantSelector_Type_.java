// instantiated with jti.pl from OSet

/****************************************************************************
  Copyright 2001-2018 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/
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

