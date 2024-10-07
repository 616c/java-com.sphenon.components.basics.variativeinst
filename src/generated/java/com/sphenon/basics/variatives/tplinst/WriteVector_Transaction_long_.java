// instantiated with jti.pl from WriteVector
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.interaction.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

public interface WriteVector_Transaction_long_
{
    public Transaction set          (CallContext context, long index, Transaction item);
    public void     add          (CallContext context, long index, Transaction item) throws AlreadyExists;
    public void     prepend      (CallContext context, Transaction item);
    public void     append       (CallContext context, Transaction item);
    public void     insertBefore (CallContext context, long index, Transaction item) throws DoesNotExist;
    public void     insertBehind (CallContext context, long index, Transaction item) throws DoesNotExist;
    public Transaction replace      (CallContext context, long index, Transaction item) throws DoesNotExist;
    public Transaction unset        (CallContext context, long index);
    public Transaction remove       (CallContext context, long index) throws DoesNotExist;
}

