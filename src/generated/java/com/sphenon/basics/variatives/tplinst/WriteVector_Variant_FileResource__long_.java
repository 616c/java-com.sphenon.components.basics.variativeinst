// instantiated with jti.pl from WriteVector
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;

import com.sphenon.basics.many.returncodes.*;

public interface WriteVector_Variant_FileResource__long_
{
    public Variant_FileResource_ set          (CallContext context, long index, Variant_FileResource_ item);
    public void     add          (CallContext context, long index, Variant_FileResource_ item) throws AlreadyExists;
    public void     prepend      (CallContext context, Variant_FileResource_ item);
    public void     append       (CallContext context, Variant_FileResource_ item);
    public void     insertBefore (CallContext context, long index, Variant_FileResource_ item) throws DoesNotExist;
    public void     insertBehind (CallContext context, long index, Variant_FileResource_ item) throws DoesNotExist;
    public Variant_FileResource_ replace      (CallContext context, long index, Variant_FileResource_ item) throws DoesNotExist;
    public Variant_FileResource_ unset        (CallContext context, long index);
    public Variant_FileResource_ remove       (CallContext context, long index) throws DoesNotExist;
}

