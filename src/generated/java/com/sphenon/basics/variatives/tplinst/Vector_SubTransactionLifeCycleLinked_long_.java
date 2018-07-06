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
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

import com.sphenon.ui.annotations.*;

@UIId("")
@UIName("")
@UIClassifier("Vector_SubTransactionLifeCycleLinked_")
@UIParts("js:instance.getIterable(context)")
public interface Vector_SubTransactionLifeCycleLinked_long_
  extends ReadOnlyVector_SubTransactionLifeCycleLinked_long_,
          WriteVector_SubTransactionLifeCycleLinked_long_
          , GenericVector<SubTransactionLifeCycleLinked>
          , GenericIterable<SubTransactionLifeCycleLinked>
{
    public SubTransactionLifeCycleLinked                                    get             (CallContext context, long index) throws DoesNotExist;
    public SubTransactionLifeCycleLinked                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_SubTransactionLifeCycleLinked_long_ReadOnlyVector_SubTransactionLifeCycleLinked_long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_SubTransactionLifeCycleLinked_long_ReadOnlyVector_SubTransactionLifeCycleLinked_long__  tryGetReference (CallContext context, long index);

    public SubTransactionLifeCycleLinked                                    set             (CallContext context, long index, SubTransactionLifeCycleLinked item);
    public void                                        add             (CallContext context, long index, SubTransactionLifeCycleLinked item) throws AlreadyExists;
    public void                                        prepend         (CallContext context, SubTransactionLifeCycleLinked item);
    public void                                        append          (CallContext context, SubTransactionLifeCycleLinked item);
    public void                                        insertBefore    (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist;
    public void                                        insertBehind    (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist;
    public SubTransactionLifeCycleLinked                                    replace         (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist;
    public SubTransactionLifeCycleLinked                                    unset           (CallContext context, long index);
    public SubTransactionLifeCycleLinked                                    remove          (CallContext context, long index) throws DoesNotExist;

    public IteratorItemIndex_SubTransactionLifeCycleLinked_long_       getNavigator    (CallContext context);

    public long                                        getSize         (CallContext context);

    // for sake of Iterable's
    public java.util.Iterator<SubTransactionLifeCycleLinked>              getIterator_SubTransactionLifeCycleLinked_ (CallContext context);
    public java.util.Iterator                          getIterator (CallContext context);
    public VectorIterable_SubTransactionLifeCycleLinked_long_          getIterable_SubTransactionLifeCycleLinked_ (CallContext context);
    public Iterable<SubTransactionLifeCycleLinked> getIterable (CallContext context);
}
