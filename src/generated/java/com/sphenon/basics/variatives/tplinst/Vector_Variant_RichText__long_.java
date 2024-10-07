// instantiated with jti.pl from Vector
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

import com.sphenon.ui.annotations.*;

@UIId("")
@UIName("")
@UIClassifier("Vector_Variant_RichText__")
@UIParts("js:instance.getIterable(context)")
public interface Vector_Variant_RichText__long_
  extends ReadOnlyVector_Variant_RichText__long_,
          WriteVector_Variant_RichText__long_
          , GenericVector<Variant_RichText_>
          , GenericIterable<Variant_RichText_>
{
    public Variant_RichText_                                    get             (CallContext context, long index) throws DoesNotExist;
    public Variant_RichText_                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Variant_RichText__long_ReadOnlyVector_Variant_RichText__long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Variant_RichText__long_ReadOnlyVector_Variant_RichText__long__  tryGetReference (CallContext context, long index);

    public Variant_RichText_                                    set             (CallContext context, long index, Variant_RichText_ item);
    public void                                        add             (CallContext context, long index, Variant_RichText_ item) throws AlreadyExists;
    public void                                        prepend         (CallContext context, Variant_RichText_ item);
    public void                                        append          (CallContext context, Variant_RichText_ item);
    public void                                        insertBefore    (CallContext context, long index, Variant_RichText_ item) throws DoesNotExist;
    public void                                        insertBehind    (CallContext context, long index, Variant_RichText_ item) throws DoesNotExist;
    public Variant_RichText_                                    replace         (CallContext context, long index, Variant_RichText_ item) throws DoesNotExist;
    public Variant_RichText_                                    unset           (CallContext context, long index);
    public Variant_RichText_                                    remove          (CallContext context, long index) throws DoesNotExist;

    public IteratorItemIndex_Variant_RichText__long_       getNavigator    (CallContext context);

    public long                                        getSize         (CallContext context);

    // for sake of Iterable's
    public java.util.Iterator<Variant_RichText_>              getIterator_Variant_RichText__ (CallContext context);
    public java.util.Iterator                          getIterator (CallContext context);
    public VectorIterable_Variant_RichText__long_          getIterable_Variant_RichText__ (CallContext context);
    public Iterable<Variant_RichText_> getIterable (CallContext context);
}
