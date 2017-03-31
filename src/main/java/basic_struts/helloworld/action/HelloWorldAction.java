package basic_struts.helloworld.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ParameterNameAware;

import basic_struts.helloworld.model.MessageStore;

public class HelloWorldAction extends ActionSupport implements SessionAware, ParameterNameAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1952975189091825288L;
	private static final String HELLO_COUNT = "helloCounts";
	private MessageStore messageStore;
	private static int helloCount = 0;
	private String userName;
	private Map<String, Object> userSession;

	public String execute() throws Exception {
		helloCount++;
		increaseHelloCounts();
		messageStore = new MessageStore();
		if (userName != null) {
			messageStore.setMessage(messageStore.getMessage() + " " + userName);
		}
		return SUCCESS;
	}

	private void increaseHelloCounts() {
		Integer helloCount = (Integer) userSession.get(HELLO_COUNT);
		if (helloCount == null) {
			helloCount = 1;
		} else {
			helloCount++;
		}
		userSession.put(HELLO_COUNT, helloCount);
	}

	public void setSession(Map<String, Object> session) {
		userSession = session;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}

	public int getHelloCount() {
		return helloCount;
	}

	public void setHelloCount(int helloCount) {
		HelloWorldAction.helloCount = helloCount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public boolean acceptableParameterName(String parameterName) {
		boolean allowedParameterName = true;
		if (parameterName.contains("session") || parameterName.contains("request")) {
			allowedParameterName = false;
		}
		System.out.println("parameter " + parameterName);
		return allowedParameterName;
	}
}
