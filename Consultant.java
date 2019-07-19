public class Consultant extends Employee {
	private double hourlyRate;
	
	public Consultant(int bNo, String fName, String lName, Department dept) {
		super(bNo, fName, lName, dept);
	}

public Consultant(int bNo, String fName, String lName, Department dept, double rate) {
		super(bNo, fName, lName, dept);
		this.hourlyRate = rate;
	}

public double getHourlyRate() {
		return hourlyRate;
	}

public String toString() {
		return super.toString()+ " "+hourlyRate;
	}

public int hashCode() {
	final int prime = 31;

	int result = super.hashCode();

	long temp;

	temp = Double.doubleToLongBits(hourlyRate);

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

if (!(obj instanceof Consultant)) {
		return false;
	}

Consultant other = (Consultant) obj;
	if (Double.doubleToLongBits(hourlyRate) != Double.doubleToLongBits(other.hourlyRate)) {
		return false;
	}
		return true;
	}
}
