// instantiated with jti.pl from Vector
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
@UIClassifier("Vector_Variant_Image__")
@UIParts("js:instance.getIterable(context)")
public interface Vector_Variant_Image__long_
  extends ReadOnlyVector_Variant_Image__long_,
          WriteVector_Variant_Image__long_
          , GenericVector<Variant_Image_>
          , GenericIterable<Variant_Image_>
{
    public Variant_Image_                                    get             (CallContext context, long index) throws DoesNotExist;
    public Variant_Image_                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Variant_Image__long_ReadOnlyVector_Variant_Image__long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Variant_Image__long_ReadOnlyVector_Variant_Image__long__  tryGetReference (CallContext context, long index);

    public Variant_Image_                                    set             (CallContext context, long index, Variant_Image_ item);
    public void                                        add             (CallContext context, long index, Variant_Image_ item) throws AlreadyExists;
    public void                                        prepend         (CallContext context, Variant_Image_ item);
    public void                                        append          (CallContext context, Variant_Image_ item);
    public void                                        insertBefore    (CallContext context, long index, Variant_Image_ item) throws DoesNotExist;
    public void                                        insertBehind    (CallContext context, long index, Variant_Image_ item) throws DoesNotExist;
    public Variant_Image_                                    replace         (CallContext context, long index, Variant_Image_ item) throws DoesNotExist;
    public Variant_Image_                                    unset           (CallContext context, long index);
    public Variant_Image_                                    remove          (CallContext context, long index) throws DoesNotExist;

    public IteratorItemIndex_Variant_Image__long_       getNavigator    (CallContext context);

    public long                                        getSize         (CallContext context);

    // for sake of Iterable's
    public java.util.Iterator<Variant_Image_>              getIterator_Variant_Image__ (CallContext context);
    public java.util.Iterator                          getIterator (CallContext context);
    public VectorIterable_Variant_Image__long_          getIterable_Variant_Image__ (CallContext context);
    public Iterable<Variant_Image_> getIterable (CallContext context);
}
