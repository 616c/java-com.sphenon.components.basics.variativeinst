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
@UIClassifier("Vector_Variant_FileResource__")
@UIParts("js:instance.getIterable(context)")
public interface Vector_Variant_FileResource__long_
  extends ReadOnlyVector_Variant_FileResource__long_,
          WriteVector_Variant_FileResource__long_
          , GenericVector<Variant_FileResource_>
          , GenericIterable<Variant_FileResource_>
{
    public Variant_FileResource_                                    get             (CallContext context, long index) throws DoesNotExist;
    public Variant_FileResource_                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Variant_FileResource__long_ReadOnlyVector_Variant_FileResource__long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Variant_FileResource__long_ReadOnlyVector_Variant_FileResource__long__  tryGetReference (CallContext context, long index);

    public Variant_FileResource_                                    set             (CallContext context, long index, Variant_FileResource_ item);
    public void                                        add             (CallContext context, long index, Variant_FileResource_ item) throws AlreadyExists;
    public void                                        prepend         (CallContext context, Variant_FileResource_ item);
    public void                                        append          (CallContext context, Variant_FileResource_ item);
    public void                                        insertBefore    (CallContext context, long index, Variant_FileResource_ item) throws DoesNotExist;
    public void                                        insertBehind    (CallContext context, long index, Variant_FileResource_ item) throws DoesNotExist;
    public Variant_FileResource_                                    replace         (CallContext context, long index, Variant_FileResource_ item) throws DoesNotExist;
    public Variant_FileResource_                                    unset           (CallContext context, long index);
    public Variant_FileResource_                                    remove          (CallContext context, long index) throws DoesNotExist;

    public IteratorItemIndex_Variant_FileResource__long_       getNavigator    (CallContext context);

    public long                                        getSize         (CallContext context);

    // for sake of Iterable's
    public java.util.Iterator<Variant_FileResource_>              getIterator_Variant_FileResource__ (CallContext context);
    public java.util.Iterator                          getIterator (CallContext context);
    public VectorIterable_Variant_FileResource__long_          getIterable_Variant_FileResource__ (CallContext context);
    public Iterable<Variant_FileResource_> getIterable (CallContext context);
}
