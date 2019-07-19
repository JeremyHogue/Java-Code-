public class Employee {	

	private int badgeNumber;
	private String firstName;
	private String lastName;
	private Department department;
	public Employee(int bNo, String fName, String lName, Department dept) {

		this.badgeNumber = bNo;
		this.firstName = fName;
		this.lastName = lName;
		this.department = dept;
	}
	
	public int getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
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
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return this.badgeNumber + " " + this.firstName + " " + this.lastName + " " + this.department;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
	
	result = prime * result + badgeNumber;
	result = prime * result + ((department == null) ? 0 : department.hashCode());
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
	return true;
	}

	if (obj == null) {
		return false;
	}
	if (!(obj instanceof Employee)) {
		return false;
	}
	
	Employee other = (Employee) obj;
		if (badgeNumber != other.badgeNumber) {
			return false;
	}

	if (department == null) {
	if (other.department != null) {
		return false;
	}

	} else if (!department.equals(other.department)) {
		return false;
	}

	if (firstName == null) {

	if (other.firstName != null) {
		return false;
	}

	} else if (!firstName.equals(other.firstName)) {
		return false;
	}
	
	if (lastName == null) {
	if (other.lastName != null) {
		return false;
	}

	} else if (!lastName.equals(other.lastName)) {
		return false;
	}
		return true;
	}
}
