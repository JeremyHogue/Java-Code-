public class SalariedEmployee extends Employee{

private double annualSalary;

public SalariedEmployee(int bNo, String fName, String lName, Department dept) {
		super(bNo, fName, lName, dept);
	}

public SalariedEmployee(int bNo, String fName, String lName, Department dept, double rate) {
		super(bNo, fName, lName, dept);
		this.annualSalary = rate;
	}

public double getAnnualSalary() {
		return annualSalary;
	}

public String toString() {
		return super.toString()+ " "+annualSalary;
	}

public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(annualSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

public boolean equals(Object obj) {
		if (this == obj) {
		return true;
	}

	if (!super.equals(obj)) {
		return false;
	}

	if (!(obj instanceof SalariedEmployee)) {
		return false;
	}

	SalariedEmployee other = (SalariedEmployee) obj;
	if (Double.doubleToLongBits(annualSalary) != Double.doubleToLongBits(other.annualSalary)) {
		return false;
	}
		return true;
	}
}
