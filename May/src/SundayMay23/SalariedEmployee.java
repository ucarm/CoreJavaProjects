package SundayMay23;

public class SalariedEmployee extends Employee{
	private double salary;
	public SalariedEmployee(String name, int id, double salary) {
		super(name, id);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void getPaid() {
			System.out.println("SalariedEmployedd gets paid :"+salary);
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", getName()=" + getName() + ", getId()=" + getId() + "]";
	}

	public double calculateYearlyIncome() {
		return 12*salary;
	}
	
	public static void showEmployeeManual() {
		System.out.println("Manual for SalariedEmployee");
	}
}
