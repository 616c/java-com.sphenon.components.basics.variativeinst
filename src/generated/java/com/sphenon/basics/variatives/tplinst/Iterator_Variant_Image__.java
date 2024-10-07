// instantiated with jti.pl from Iterator
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.tplinst.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

public interface Iterator_Variant_Image__
    extends com.sphenon.basics.many.Iterator<Variant_Image_>
{
    // advances iterator; if there is no next item iterator becomes invalid
    public void     next          (CallContext context);

    // returns current item; item must exist
    public Variant_Image_ getCurrent    (CallContext context) throws DoesNotExist;

    // like "getCurrent", but returns null instead of throwing exception
    public Variant_Image_ tryGetCurrent (CallContext context);

    // returns true if there is a current item available
    public boolean  canGetCurrent (CallContext context);

    // creates a clone of this iterator, pointing to exactly
    // the same position as yonder
    public Iterator_Variant_Image__ clone(CallContext context);
}
