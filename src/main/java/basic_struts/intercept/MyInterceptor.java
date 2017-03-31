package basic_struts.intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import basic_struts.helloworld.action.HelloWorldAction;

public class MyInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7121189286773744302L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		HelloWorldAction action = (HelloWorldAction) invocation.getAction();
		if(action != null)
			action.getMessageStore().setMessage("Intercept before action");
		return invocation.invoke();
	}

}
