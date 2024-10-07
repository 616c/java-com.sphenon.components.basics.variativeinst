// instantiated with jti.pl from Iterator
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.many.*;
import com.sphenon.basics.variatives.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

public interface Iterator_Variative_String__
    extends com.sphenon.basics.many.Iterator<Variative_String_>
{
    // advances iterator; if there is no next item iterator becomes invalid
    public void     next          (CallContext context);

    // returns current item; item must exist
    public Variative_String_ getCurrent    (CallContext context) throws DoesNotExist;

    // like "getCurrent", but returns null instead of throwing exception
    public Variative_String_ tryGetCurrent (CallContext context);

    // returns true if there is a current item available
    public boolean  canGetCurrent (CallContext context);

    // creates a clone of this iterator, pointing to exactly
    // the same position as yonder
    public Iterator_Variative_String__ clone(CallContext context);
}
