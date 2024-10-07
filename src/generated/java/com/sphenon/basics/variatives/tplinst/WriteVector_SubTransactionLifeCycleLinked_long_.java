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

public interface WriteVector_SubTransactionLifeCycleLinked_long_
{
    public SubTransactionLifeCycleLinked set          (CallContext context, long index, SubTransactionLifeCycleLinked item);
    public void     add          (CallContext context, long index, SubTransactionLifeCycleLinked item) throws AlreadyExists;
    public void     prepend      (CallContext context, SubTransactionLifeCycleLinked item);
    public void     append       (CallContext context, SubTransactionLifeCycleLinked item);
    public void     insertBefore (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist;
    public void     insertBehind (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist;
    public SubTransactionLifeCycleLinked replace      (CallContext context, long index, SubTransactionLifeCycleLinked item) throws DoesNotExist;
    public SubTransactionLifeCycleLinked unset        (CallContext context, long index);
    public SubTransactionLifeCycleLinked remove       (CallContext context, long index) throws DoesNotExist;
}

