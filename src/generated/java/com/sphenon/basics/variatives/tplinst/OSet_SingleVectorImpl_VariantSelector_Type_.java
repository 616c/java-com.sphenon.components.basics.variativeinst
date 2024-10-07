// instantiated with jti.pl from OSet_SingleVectorImpl
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.monitoring.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.metadata.*;
import com.sphenon.basics.metadata.tplinst.*;

import com.sphenon.basics.many.returncodes.*;

import java.util.Vector;
import java.util.ListIterator;

public class OSet_SingleVectorImpl_VariantSelector_Type_
  implements OSet_VariantSelector_Type_ {
    protected java.util.Vector vector;
    protected Type itemtype;


    public OSet_SingleVectorImpl_VariantSelector_Type_ (CallContext context) {
        this.vector = new java.util.Vector ();
        this.itemtype = TypeManager.get(context, VariantSelector.class);
    }

    public OSet_SingleVectorImpl_VariantSelector_Type_ (CallContext context, java.util.Vector vector) {
        this.vector = vector;
        this.itemtype = TypeManager.get(context, VariantSelector.class);
    }


    public Set_VariantSelector_ get     (CallContext context, Type index) throws DoesNotExist {
        Set_VariantSelector_ result = tryGet(context, index);
        if (result.getSize(context) == 0) DoesNotExist.createAndThrow(context);
        return result;
    }

    public Set_VariantSelector_ getMany    (CallContext context, Type index) throws DoesNotExist {
        return this.get(context, index);
    }

    public VariantSelector      getSole    (CallContext context, Type index) throws DoesNotExist, MoreThanOne {
        VariantSelector result = null;
        for (Object o: vector) {
            if (TypeManager.get(context, o.getClass()).isA(context, index)) {
                if (result != null) MoreThanOne.createAndThrow(context);
                result = (VariantSelector) o;
            }
        }
        if (result == null) DoesNotExist.createAndThrow(context);
        return result;
    }

    public Set_VariantSelector_ tryGet  (CallContext context, Type index) {
        Set_VariantSelector_ result = new SetImpl_VariantSelector_(context);
        for (Object o: vector) {
            if (TypeManager.get(context, o.getClass()).isA(context, index)) {
                result.set(context, (VariantSelector) o);
            }
        }
        return result;
    }

    public Set_VariantSelector_ tryGetMany (CallContext context, Type index) {
        return this.tryGet(context, index);
    }

    public VariantSelector      tryGetSole (CallContext context, Type index) {
        VariantSelector result = null;
        for (Object o: vector) {
            if (TypeManager.get(context, o.getClass()).isA(context, index)) {
                if (result != null) return null;
                result = (VariantSelector) o;
            }
        }
        return result;
    }

    public boolean  canGet  (CallContext context, Type index) {
        for (Object o: vector) {
            if (TypeManager.get(context, o.getClass()).isA(context, index)) {
                return true;
            }
        }
        return false;
    }

    public boolean       canGetMany (CallContext context, Type index) {
        return this.canGet(context, index);
   
    }

    public boolean       canGetSole (CallContext context, Type index) {
        VariantSelector result = null;
        for (Object o: vector) {
            if (TypeManager.get(context, o.getClass()).isA(context, index)) {
                if (result != null) return false;
                result = (VariantSelector) o;
            }
        }
        return result == null ? false : true;
    }

    public void     set     (CallContext context, VariantSelector item) {
        vector.add(item);
    }

    public void     add     (CallContext context, VariantSelector item) throws AlreadyExists {
        vector.add(item);
    }

    public void     replace (CallContext context, VariantSelector item) throws DoesNotExist {
    }

    public void     unset   (CallContext context, VariantSelector item) {
        ListIterator li = vector.listIterator();
        while (li.hasNext()) {
            if (li.next() == item) {
                li.remove();
                return;
            }
        }
    }

    public void     remove  (CallContext context, VariantSelector item) throws DoesNotExist {
        ListIterator li = vector.listIterator();
        while (li.hasNext()) {
            if (li.next() == item) {
                li.remove();
                return;
            }
        }
        DoesNotExist.createAndThrow(context);
    }

    public Iterator_VariantSelector_ getNavigator (CallContext context) {
        return new OSet_SingleVector_IteratorImpl_VariantSelector_Type_(context, this.vector);
    }

    public long     getSize (CallContext context) {
        return this.vector.size();
    }
}
