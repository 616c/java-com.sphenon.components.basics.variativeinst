// instantiated with jti.pl from SetImpl
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

import java.util.Hashtable;

public class SetImpl_VariantSelector_
  implements Set_VariantSelector_
{
    private java.util.Hashtable map;

    public SetImpl_VariantSelector_ (CallContext context)
    {
    }

    protected void initialise(CallContext context) {
        if (map == null) {
            map = new java.util.Hashtable(4);
        }
    }

    public SetImpl_VariantSelector_ (CallContext context, java.util.Hashtable map)
    {
        this.map = map;
    }

    public boolean  contains (CallContext context, VariantSelector item)
    {
        return (map == null ? false : map.containsKey(item));
    }

    public void     set     (CallContext context, VariantSelector item)
    {
        initialise(context);
        map.put(item, item);
    }

    public void     add     (CallContext context, VariantSelector item) throws AlreadyExists
    {
        initialise(context);
        if (map.containsKey(item)) AlreadyExists.createAndThrow (context);
        map.put(item, item);
    }

    public void     replace (CallContext context, VariantSelector item) throws DoesNotExist
    {
        initialise(context);
        if (!map.containsKey(item)) DoesNotExist.createAndThrow (context);
        map.put(item, item);
    }

    public void     unset   (CallContext context, VariantSelector item)
    {
        initialise(context);
        map.remove(item);
    }

    public void     remove  (CallContext context, VariantSelector item) throws DoesNotExist
    {
        initialise(context);
        if (!map.containsKey(item)) DoesNotExist.createAndThrow (context);
        map.remove(item);
    }

    public Iterator_VariantSelector_ getNavigator (CallContext context)
    {
        initialise(context);
        return new SetIteratorImpl_VariantSelector_ (context, map);
    }

    public long     getSize (CallContext context)
    {
        return (map == null ? 0L : map.size());
    }

    public java.util.Hashtable getImplementationMap(CallContext context){
        return this.map;
    }
}

