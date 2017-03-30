package basic_struts.register.service;

import basic_struts.register.model.Person;

public interface PersonService {
	void savePerson(Person person);
	Person getPerson();
}
