package basic_struts.exceptions.action;

import com.opensymphony.xwork2.ActionSupport;

import basic_struts.exceptions.SecurityBreachException;

public class ExceptionAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2579114799559952538L;


	public void throwSecurityException() {
		throw new SecurityBreachException();
	}

	public void throwAnyException() throws Exception {
		throw new Exception("from throwAnyException()");
	}
}
