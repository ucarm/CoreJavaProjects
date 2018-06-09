package SundayMay23;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String name, int id, double wage, double hours) {
		super(name, id);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public void getPaid() {
		// TODO Auto-generated method stub
		double a= calculateYearlyWage();
		System.out.println(a); 
		
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", getName()=" + getName() + ", getId()=" + getId()
				+ "]";
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double calculateYearlyWage() {
		return wage*hours*52;// 52 weeks in   a year
	}
	
	public static void showEmployeeManual() {
		System.out.println("Emp Manual for hourly");
	}
}
