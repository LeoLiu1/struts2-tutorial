package basic_struts.register.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import basic_struts.register.model.Person;
import basic_struts.register.model.State;
import basic_struts.register.service.PersonService;

public class Register extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3594979221827708298L;
	private Person personBean;
	private PersonService personService;

	@Override
	public String execute() throws Exception {
		// call Service class to store personBean's state in database
		personService.savePerson(personBean);
		return SUCCESS;
	}

	@Override
	public String input() throws Exception {
		setPersonBean(personService.getPerson());
		return INPUT;
	}

	public String update() {
		return SUCCESS;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

	public void validate() {
		if (personBean.getFirstName().length() == 0) {
			addFieldError("personBean.firstName", "First name is required.");
		}

		if (personBean.getEmail().length() == 0) {
			addFieldError("personBean.email", "Email is required.");
		}

		if (personBean.getAge() < 18) {
			addFieldError("personBean.age", "Age is required and must be 18 or older");
		}
	}

	public String[] getSports() {
		return getText("sports").split(",");
	}

	public String[] getGenders() {
		return getText("genders").split(",");
	}

	public List<State> getStates() {
		List<State> states = new ArrayList<State>();
		states.add(new State("皖", "安徽"));
		states.add(new State("苏", "江苏"));
		states.add(new State("浙", "浙江"));
		states.add(new State("沪", "上海"));
		states.add(new State("赣", "江西"));
		states.add(new State("粤", "广东"));
		return states;
	}

	public String[] getCarModelsAvailable() {
		return getText("carmodels").split(",");
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}
