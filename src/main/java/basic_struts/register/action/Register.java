package basic_struts.register.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.interceptor.ParameterNameAware;

import basic_struts.register.model.Person;
import basic_struts.register.model.State;
import basic_struts.register.service.PersonService;
import basic_struts.register.service.StateService;

public class Register extends ActionSupport implements Preparable, ParameterNameAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3594979221827708298L;
	private Person personBean;
	private PersonService personService;
	private StateService stateService;

	@Override
	public String execute() throws Exception {
		
		System.out.println("In execute method...");
		// call Service class to store personBean's state in database
		personService.savePerson(personBean);
		return SUCCESS;
	}

	@Override
	public String input() throws Exception {
		System.out.println("In input method...");
		setPersonBean(personService.getPerson());
		return INPUT;
	}

	@Override
	public void prepare() throws Exception {
		System.out.println("In prepare method...");
	}

    public void prepareExecute() {
    	System.out.println("In prepareExecute method...");
    }

    public void prepareInput() {
    	System.out.println("In prepareInput method...");
    }

	public String update() {
		System.out.println("In update method...");
		return SUCCESS;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

	public void validate() {
		System.out.println("In validate method...");
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
		return stateService.getStates();
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

	public StateService getStateService() {
		return stateService;
	}

	public void setStateService(StateService stateService) {
		this.stateService = stateService;
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
