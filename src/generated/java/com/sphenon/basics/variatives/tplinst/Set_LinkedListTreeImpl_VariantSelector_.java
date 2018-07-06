// instantiated with jti.pl from Set_LinkedListTreeImpl

/****************************************************************************
  Copyright 2001-2018 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/
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

public class Set_LinkedListTreeImpl_VariantSelector_
  implements Set_VariantSelector_
{
    private java.util.LinkedList linked_list;

    public Set_LinkedListTreeImpl_VariantSelector_ (CallContext context)
    {
        linked_list = new java.util.LinkedList ();
    }

    public Set_LinkedListTreeImpl_VariantSelector_ (CallContext context, java.util.LinkedList linked_list)
    {
        this.linked_list = linked_list;
    }

    public boolean  contains (CallContext context, VariantSelector item)
    {
        return linked_list.contains(item);
    }

    public void     set     (CallContext context, VariantSelector item)
    {
        linked_list.addLast(item);
    }

    public void     set     (CallContext context, Set_LinkedListTreeImpl_VariantSelector_ item_set)
    {
        linked_list.addLast(item_set);
    }

    public void     add     (CallContext context, VariantSelector item) throws AlreadyExists
    {
        if (linked_list.contains(item)) AlreadyExists.createAndThrow (context);
        linked_list.addLast(item);
    }

    public void     add     (CallContext context, Set_LinkedListTreeImpl_VariantSelector_ item_set) throws AlreadyExists
    {
        if (linked_list.contains(item_set)) AlreadyExists.createAndThrow (context);
        linked_list.addLast(item_set);
    }

    public void     replace (CallContext context, VariantSelector item) throws DoesNotExist
    {
        if (!linked_list.contains(item)) DoesNotExist.createAndThrow (context);
        // linked_list.put(item, item);
    }

    public void     unset   (CallContext context, VariantSelector item)
    {
        linked_list.remove(item);
    }

    public void     unset   (CallContext context, Set_LinkedListTreeImpl_VariantSelector_ item_set)
    {
        linked_list.remove(item_set);
    }

    public void     remove  (CallContext context, VariantSelector item) throws DoesNotExist
    {
        if (!linked_list.contains(item)) DoesNotExist.createAndThrow (context);
        linked_list.remove(item);
    }

    public Iterator_VariantSelector_ getNavigator (CallContext context)
    {
        return new Set_LinkedListTreeIteratorImpl_VariantSelector_ (context, linked_list);
    }

    public long     getSize (CallContext context)
    {
        long size = 0;
        for (Object o : linked_list) {
            size += (o instanceof Set_VariantSelector_ ? ((Set_VariantSelector_) o).getSize(context) : 1);
        }
        return size;
    }
}

