// instantiated with jti.pl from Vector

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
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.tplinst.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

import com.sphenon.ui.annotations.*;

@UIId("")
@UIName("")
@UIClassifier("Vector_Variant_Object__")
@UIParts("js:instance.getIterable(context)")
public interface Vector_Variant_Object__long_
  extends ReadOnlyVector_Variant_Object__long_,
          WriteVector_Variant_Object__long_
          , GenericVector<Variant_Object_>
          , GenericIterable<Variant_Object_>
{
    public Variant_Object_                                    get             (CallContext context, long index) throws DoesNotExist;
    public Variant_Object_                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Variant_Object__long_ReadOnlyVector_Variant_Object__long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Variant_Object__long_ReadOnlyVector_Variant_Object__long__  tryGetReference (CallContext context, long index);

    public Variant_Object_                                    set             (CallContext context, long index, Variant_Object_ item);
    public void                                        add             (CallContext context, long index, Variant_Object_ item) throws AlreadyExists;
    public void                                        prepend         (CallContext context, Variant_Object_ item);
    public void                                        append          (CallContext context, Variant_Object_ item);
    public void                                        insertBefore    (CallContext context, long index, Variant_Object_ item) throws DoesNotExist;
    public void                                        insertBehind    (CallContext context, long index, Variant_Object_ item) throws DoesNotExist;
    public Variant_Object_                                    replace         (CallContext context, long index, Variant_Object_ item) throws DoesNotExist;
    public Variant_Object_                                    unset           (CallContext context, long index);
    public Variant_Object_                                    remove          (CallContext context, long index) throws DoesNotExist;

    public IteratorItemIndex_Variant_Object__long_       getNavigator    (CallContext context);

    public long                                        getSize         (CallContext context);

    // for sake of Iterable's
    public java.util.Iterator<Variant_Object_>              getIterator_Variant_Object__ (CallContext context);
    public java.util.Iterator                          getIterator (CallContext context);
    public VectorIterable_Variant_Object__long_          getIterable_Variant_Object__ (CallContext context);
    public Iterable<Variant_Object_> getIterable (CallContext context);
}
