package basic_struts.register.model;

public class Person {
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private String sport;
	private String gender;
	private String residency;
	private boolean over21;
	private String[] carModels;
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getResidency() {
		return residency;
	}

	public void setResidency(String residency) {
		this.residency = residency;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public boolean isOver21() {
		return over21;
	}

	public void setOver21(boolean over21) {
		this.over21 = over21;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getCarModels() {
		return carModels;
	}

	public void setCarModels(String[] carModels) {
		this.carModels = carModels;
	}

	public String toString() {
		return "First Name: " + getFirstName() + " Last Name:  " + getLastName() + " Gender: " + getGender()
				+ " Email:      " + getEmail() + " Age:      " + getAge() + " Over21: " + isOver21() + " Sport: " + getSport() + " Residency: "
				+ getResidency() + " CarModels: " + getCarModels() + " Phone: " + getPhoneNumber();
	}
}
