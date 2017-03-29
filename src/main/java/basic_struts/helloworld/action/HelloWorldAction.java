package basic_struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;

import basic_struts.helloworld.model.MessageStore;

public class HelloWorldAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1952975189091825288L;
	private MessageStore messageStore;
	private static int helloCount = 0;
	private String userName;

	public String execute() throws Exception {
		helloCount++;
		messageStore = new MessageStore();
		if (userName != null) {
			messageStore.setMessage(messageStore.getMessage() + " " + userName);
		}
		return SUCCESS;
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
}
