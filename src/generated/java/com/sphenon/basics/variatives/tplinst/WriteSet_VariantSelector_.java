// instantiated with jti.pl from WriteSet
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.monitoring.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

public interface WriteSet_VariantSelector_
{
    // adds item, may already exist
    public void     set     (CallContext context, VariantSelector item);

    // adds item, must not already exist
    public void     add     (CallContext context, VariantSelector item) throws AlreadyExists;

    // replace item, must already exist
    public void     replace (CallContext context, VariantSelector item) throws DoesNotExist;
    // does this method make any sense?
    // should'nt it be? : 
    // public void     replace (CallContext context, VariantSelector item, VariantSelector item) throws DoesNotExist;

    // removes item, need not exist
    public void     unset   (CallContext context, VariantSelector item);

    // removes item, must exist
    public void     remove  (CallContext context, VariantSelector item) throws DoesNotExist;
}

