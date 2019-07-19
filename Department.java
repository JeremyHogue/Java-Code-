public class Department {

private String name;

private int buildingNumber;

public Department(String dept, int id) {
		this.name = dept;
		this.buildingNumber = id;
	}

public String getName() {
		return name;
	}

public void setName(String name) {
		this.name = name;
	}

public int getBuildingNumber() {
		return buildingNumber;
	}

public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

public String toString() {
		return this.name + " " + this.buildingNumber;
	}
}
