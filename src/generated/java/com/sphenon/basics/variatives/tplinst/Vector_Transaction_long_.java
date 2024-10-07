// instantiated with jti.pl from Vector
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
@UIClassifier("Vector_Transaction_")
@UIParts("js:instance.getIterable(context)")
public interface Vector_Transaction_long_
  extends ReadOnlyVector_Transaction_long_,
          WriteVector_Transaction_long_
          , GenericVector<Transaction>
          , GenericIterable<Transaction>
{
    public Transaction                                    get             (CallContext context, long index) throws DoesNotExist;
    public Transaction                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Transaction_long_ReadOnlyVector_Transaction_long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Transaction_long_ReadOnlyVector_Transaction_long__  tryGetReference (CallContext context, long index);

    public Transaction                                    set             (CallContext context, long index, Transaction item);
    public void                                        add             (CallContext context, long index, Transaction item) throws AlreadyExists;
    public void                                        prepend         (CallContext context, Transaction item);
    public void                                        append          (CallContext context, Transaction item);
    public void                                        insertBefore    (CallContext context, long index, Transaction item) throws DoesNotExist;
    public void                                        insertBehind    (CallContext context, long index, Transaction item) throws DoesNotExist;
    public Transaction                                    replace         (CallContext context, long index, Transaction item) throws DoesNotExist;
    public Transaction                                    unset           (CallContext context, long index);
    public Transaction                                    remove          (CallContext context, long index) throws DoesNotExist;

    public IteratorItemIndex_Transaction_long_       getNavigator    (CallContext context);

    public long                                        getSize         (CallContext context);

    // for sake of Iterable's
    public java.util.Iterator<Transaction>              getIterator_Transaction_ (CallContext context);
    public java.util.Iterator                          getIterator (CallContext context);
    public VectorIterable_Transaction_long_          getIterable_Transaction_ (CallContext context);
    public Iterable<Transaction> getIterable (CallContext context);
}
