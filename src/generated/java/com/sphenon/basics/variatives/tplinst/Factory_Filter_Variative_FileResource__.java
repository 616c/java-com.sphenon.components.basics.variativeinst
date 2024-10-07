// instantiated with jti.pl from Factory_Filter
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.retriever.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.configuration.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.retriever.*;
import com.sphenon.basics.factory.*;

public class Factory_Filter_Variative_FileResource__ {

    /* -------------- extensible factory instantiation --------------------------------------------------------------------------------------- */
    static protected Configuration config;
    static protected FactoryInstantiator<Factory_Filter_Variative_FileResource__> factory_instantiator;
    static {
      CallContext context = RootContext.getInitialisationContext();
      config = Configuration.create(context, "com.sphenon.basics.variatives.tplinst.Factory_Filter_Variative_FileResource__");
      factory_instantiator = new FactoryInstantiator(context, Factory_Filter_Variative_FileResource__.class) { protected Factory_Filter_Variative_FileResource__ createDefault(CallContext context) { return new Factory_Filter_Variative_FileResource__(context); } };
    };
    /* --------------------------------------------------------------------------------------------------------------------------------------- */
    static public Factory_Filter_Variative_FileResource__ newInstance (CallContext context) {
        return factory_instantiator.newInstance(context);
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    static public Filter_Variative_FileResource__ construct (CallContext context) {
        return newInstance(context).create(context);
    }

    protected Factory_Filter_Variative_FileResource__ (CallContext context) {
    }

    public Filter_Variative_FileResource__ create (CallContext context) {
        FilterByRegExp_Variative_FileResource__ filter = new FilterByRegExp_Variative_FileResource__(context);
filter.setExpression(context, this.expression);
        return filter;
    }

    static public Filter_Variative_FileResource__ construct (CallContext context, String expression) {
        return newInstance(context).create(context, expression);
    }

    public Filter_Variative_FileResource__ create (CallContext context, String expression) {
        return new FilterByRegExp_Variative_FileResource__(context, expression);
    }
protected String expression; public String getExpression (CallContext context) { return this.expression; } public String defaultExpression (CallContext context) { return null; } public void setExpression (CallContext context, String expression) { this.expression = expression; }
}
