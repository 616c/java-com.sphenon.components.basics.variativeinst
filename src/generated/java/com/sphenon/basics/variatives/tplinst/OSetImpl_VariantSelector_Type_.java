// instantiated with jti.pl from OSetImpl
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

import java.util.Hashtable;

public class OSetImpl_VariantSelector_Type_
  implements OSet_VariantSelector_Type_ {
    protected java.util.Hashtable map;
    protected Set_VariantSelector_ toplevel_set;
    static protected Type itemtype;


    public OSetImpl_VariantSelector_Type_ (CallContext context) {
        if (itemtype == null) { itemtype = TypeManager.get(context, VariantSelector.class); }
    }

    public OSetImpl_VariantSelector_Type_ (CallContext context, java.util.Hashtable map) {
        this.map = map;
        if (itemtype == null) { itemtype = TypeManager.get(context, VariantSelector.class); }
    }

    protected void initialise(CallContext context) {
        if (this.toplevel_set == null) {
            if (this.map == null) {
                this.map = new java.util.Hashtable(4);
            }
            this.toplevel_set = new SetImpl_VariantSelector_ (context);
            map.put(this.itemtype, this.toplevel_set);
        }
    }


    public Set_VariantSelector_ get     (CallContext context, Type index) throws DoesNotExist {
        if (! index.isA(context, itemtype)) DoesNotExist.createAndThrow(context);
        Object item = (map == null ? null : map.get(index));
        if (item == null) DoesNotExist.createAndThrow(context);
        return (Set_VariantSelector_) item;
    }

    public Set_VariantSelector_ getMany    (CallContext context, Type index) throws DoesNotExist {
        return this.get(context, index);
    }

    public VariantSelector      getSole    (CallContext context, Type index) throws DoesNotExist, MoreThanOne {
        Set_VariantSelector_ set = this.get(context, index);
        if (set.getSize(context) != 1) MoreThanOne.createAndThrow(context);
        return set.getNavigator(context).tryGetCurrent(context);
    }

    public Set_VariantSelector_ tryGet  (CallContext context, Type index) {
        if (! index.isA(context, itemtype)) return null;
        return (Set_VariantSelector_) (map == null ? null : map.get(index));
    }

    public Set_VariantSelector_ tryGetMany (CallContext context, Type index) {
        return this.tryGet(context, index);
    }

    public VariantSelector      tryGetSole (CallContext context, Type index) {
        Set_VariantSelector_ set = this.tryGet(context, index);
        if (set == null || set.getSize(context) != 1) return null;
        return set.getNavigator(context).tryGetCurrent(context);
    }

    public boolean  canGet  (CallContext context, Type index) {
        if (! index.isA(context, itemtype)) return false;
        return (map == null ? false : map.containsKey(index));
    }

    public boolean       canGetMany (CallContext context, Type index) {
        return this.canGet(context, index);
   
    }

    public boolean       canGetSole (CallContext context, Type index) {
        Set_VariantSelector_ set = this.tryGet(context, index);
        if (set == null || set.getSize(context) != 1) return false;
        return true;
    }

    private Set_VariantSelector_ getEntry(CallContext context, Type index) {
        initialise(context);
        Set_VariantSelector_ set = (Set_VariantSelector_) map.get(index);
        if (set == null) {
            set = new SetImpl_VariantSelector_ (context);
            map.put(index, set);
        }
        return set;
    }

    private void    _setSuper  (CallContext context, VariantSelector item, Type index) {
        if (index.equals(itemtype)) return;
        // Iterator_Type_ supertypes = index.getSuperTypes(context).getNavigator(context);
        Iterator_Type_ supertypes = index.getAllSuperInterfaces(context).getNavigator(context);
        Type supertype;
        while ((supertype = supertypes.tryGetCurrent(context)) != null) {
            if (supertype.isA(context, itemtype)) {
                this.getEntry(context, supertype).set(context, item);
                // this._setSuper(context, item, supertype);
            }
            supertypes.next(context);
        }
    }

    private void    _unsetSuper  (CallContext context, VariantSelector item, Type index) {
        if (index.equals(itemtype)) return;
        // Iterator_Type_ supertypes = index.getSuperTypes(context).getNavigator(context);
        Iterator_Type_ supertypes = index.getAllSuperInterfaces(context).getNavigator(context);
        Type supertype;
        while ((supertype = supertypes.tryGetCurrent(context)) != null) {
            if (supertype.isA(context, itemtype)) {
                this.getEntry(context, supertype).unset(context, item);
                // this._unsetSuper(context, item, supertype);
            }
            supertypes.next(context);
        }
    }

    public void     set     (CallContext context, VariantSelector item) {
        Type index = TypeManager.get(context, item.getClass());
        this.getEntry(context, index).set(context, item);
        this._setSuper(context, item, index);
    }

    public void     add     (CallContext context, VariantSelector item) throws AlreadyExists {
        Type index = TypeManager.get(context, item.getClass());
        this.getEntry(context, index).add(context, item);
        this._setSuper(context, item, index);
    }

    public void     replace (CallContext context, VariantSelector item) throws DoesNotExist {
        Type index = TypeManager.get(context, item.getClass());
        this.getEntry(context, index).replace(context, item);
        this._setSuper(context, item, index);
    }

    public void     unset   (CallContext context, VariantSelector item) {
        Type index = TypeManager.get(context, item.getClass());
        this.getEntry(context, index).unset(context, item);
        this._unsetSuper(context, item, index);
    }

    public void     remove  (CallContext context, VariantSelector item) throws DoesNotExist {
        Type index = TypeManager.get(context, item.getClass());
        this.getEntry(context, index).remove(context, item);
        this._unsetSuper(context, item, index);
    }

    public Iterator_VariantSelector_ getNavigator (CallContext context) {
        initialise(context);
        return this.toplevel_set.getNavigator(context);
    }

    public long     getSize (CallContext context) {
        return (this.itemtype == null || this.toplevel_set == null ? 0L : this.toplevel_set.getSize(context));
    }

    public java.util.Hashtable getImplementationMap(CallContext context){
        return this.map;
    }
}
