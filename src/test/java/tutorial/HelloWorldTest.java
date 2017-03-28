package tutorial;

import com.opensymphony.xwork2.ActionSupport;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	public void testHelloWorld() throws Exception {

		HelloWorld hello_world = new HelloWorld();
		String result = hello_world.execute();

		assertTrue("Expected a success result!", ActionSupport.SUCCESS.equals(result));

		assertTrue("Expected the default message!", HelloWorld.MESSAGE.equals(hello_world.getMessage()));

	}
}
