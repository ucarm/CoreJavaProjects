package SundayMay23;

import java.util.List;
import java.util.ArrayList;

public class HR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> all = new ArrayList<>();
		
		all.add(new SalariedEmployee("John", 10, 10000));
		all.add(new HourlyEmployee("ali", 10, 9, 40));
		all.add(new SalariedEmployee("John", 10, 10000));
		all.add(new HourlyEmployee("em1", 10, 9, 40));
		all.add(new SalariedEmployee("kem1", 10, 10000));
		all.add(new HourlyEmployee("zem1", 10, 9, 40));
		all.add(new SalariedEmployee("dem", 10, 10000));
		all.add(new HourlyEmployee("jajan1", 10, 9, 40));
		
		for (Employee employee : all) {
			System.out.println(employee);
			employee.getPaid();
			
			if(employee instanceof SalariedEmployee) {
				SalariedEmployee empS= (SalariedEmployee) employee;
				empS.calculateYearlyIncome();
				System.out.println("Salary emplyee gets yearly $"+
						empS.calculateYearlyIncome());
			}
			else if(employee instanceof HourlyEmployee) {
				HourlyEmployee empH= (HourlyEmployee) employee;
				System.out.println("Hourly worker gets yearly $"+
						empH.calculateYearlyWage());
			}
			
		}
		
	}

}
