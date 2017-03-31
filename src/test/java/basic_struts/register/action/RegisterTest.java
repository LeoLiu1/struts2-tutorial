package basic_struts.register.action;

import org.apache.struts2.StrutsSpringTestCase;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterTest extends StrutsSpringTestCase {

	@Test
	public void testExecuteValidationPasses() throws Exception {

		request.setParameter("personBean.firstName", "Bruce");
		request.setParameter("personBean.lastName", "Phillips");
		request.setParameter("personBean.email", "bphillips@ku.edu");
		request.setParameter("personBean.age", "19");
		request.setParameter("personBean.sport", "basketball");
		request.setParameter("personBean.gender", "maile");
		request.setParameter("personBean.residency", "");
		request.setParameter("personBean.over21", "true");
		request.setParameter("personBean.carModels", "Ford");
		request.setParameter("personBean.phoneNumber", "444-444-4444");
		ActionProxy actionProxy = getActionProxy("/register.action");
		Register action = (Register) actionProxy.getAction();
		assertNotNull("The action is null but should not be.", action);
		String result = actionProxy.execute();
		assertEquals("The execute method did not return " + ActionSupport.SUCCESS + " but should have.",
				ActionSupport.SUCCESS, result);
	}

	@Test
	public void testExecuteValidationFailsMissingFirstName() throws Exception {
		 request.setParameter("personBean.firstName", "");
		request.setParameter("personBean.lastName", "Phillips");
		request.setParameter("personBean.email", "bphillips@ku.edu");
		request.setParameter("personBean.age", "19");
		ActionProxy actionProxy = getActionProxy("/register.action");
		Register action = (Register) actionProxy.getAction();
		assertNotNull("The action is null but should not be.", action);
		String result = actionProxy.execute();
		assertEquals("The execute method did not return " + ActionSupport.INPUT + " but should have.",
				ActionSupport.INPUT, result);
	}
}
