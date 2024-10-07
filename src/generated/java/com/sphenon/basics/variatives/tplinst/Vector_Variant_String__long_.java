// instantiated with jti.pl from Vector
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

import com.sphenon.ui.annotations.*;

@UIId("")
@UIName("")
@UIClassifier("Vector_Variant_String__")
@UIParts("js:instance.getIterable(context)")
public interface Vector_Variant_String__long_
  extends ReadOnlyVector_Variant_String__long_,
          WriteVector_Variant_String__long_
          , GenericVector<Variant_String_>
          , GenericIterable<Variant_String_>
{
    public Variant_String_                                    get             (CallContext context, long index) throws DoesNotExist;
    public Variant_String_                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Variant_String__long_ReadOnlyVector_Variant_String__long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Variant_String__long_ReadOnlyVector_Variant_String__long__  tryGetReference (CallContext context, long index);

    public Variant_String_                                    set             (CallContext context, long index, Variant_String_ item);
    public void                                        add             (CallContext context, long index, Variant_String_ item) throws AlreadyExists;
    public void                                        prepend         (CallContext context, Variant_String_ item);
    public void                                        append          (CallContext context, Variant_String_ item);
    public void                                        insertBefore    (CallContext context, long index, Variant_String_ item) throws DoesNotExist;
    public void                                        insertBehind    (CallContext context, long index, Variant_String_ item) throws DoesNotExist;
    public Variant_String_                                    replace         (CallContext context, long index, Variant_String_ item) throws DoesNotExist;
    public Variant_String_                                    unset           (CallContext context, long index);
    public Variant_String_                                    remove          (CallContext context, long index) throws DoesNotExist;

    public IteratorItemIndex_Variant_String__long_       getNavigator    (CallContext context);

    public long                                        getSize         (CallContext context);

    // for sake of Iterable's
    public java.util.Iterator<Variant_String_>              getIterator_Variant_String__ (CallContext context);
    public java.util.Iterator                          getIterator (CallContext context);
    public VectorIterable_Variant_String__long_          getIterable_Variant_String__ (CallContext context);
    public Iterable<Variant_String_> getIterable (CallContext context);
}
