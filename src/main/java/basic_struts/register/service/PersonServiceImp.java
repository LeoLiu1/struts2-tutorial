package basic_struts.register.service;

import basic_struts.register.model.Person;

public class PersonServiceImp implements PersonService {

	private static Person person;
	private static String[] carModels = { "Ford", "Nissan" };
	public PersonServiceImp(){}
	static {

		person = new Person();
		person.setFirstName("Bruce");
		person.setLastName("Phillips");
		person.setSport("basketball");
		person.setGender("not sure");
		person.setResidency("KS");
		person.setOver21(true);
		person.setCarModels(carModels);
		person.setPhoneNumber("111-111-1111");
		person.setEmail("Bruce.Phillips@outlook.com");
		person.setAge(33);
		person.setResidency("沪");
	}

	@Override
	public void savePerson(Person personBean) {
		PersonServiceImp.person.setFirstName(personBean.getFirstName());
		PersonServiceImp.person.setLastName(personBean.getLastName());
		PersonServiceImp.person.setSport(personBean.getSport());
		PersonServiceImp.person.setGender(personBean.getGender());
		PersonServiceImp.person.setResidency(personBean.getResidency());
		PersonServiceImp.person.setOver21(personBean.isOver21());
		PersonServiceImp.person.setCarModels(personBean.getCarModels());
		PersonServiceImp.person.setPhoneNumber(personBean.getPhoneNumber());
		PersonServiceImp.person.setEmail(personBean.getEmail());
		PersonServiceImp.person.setAge(personBean.getAge());
		PersonServiceImp.person.setResidency(personBean.getResidency());
	}

	@Override
	public Person getPerson() {
		return PersonServiceImp.person;
	}

}
