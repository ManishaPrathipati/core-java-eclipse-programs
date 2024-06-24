package exam;

public class DayPay {
	
	//Methods
	private static double calculateSalry(Employee employee) {
		double salary;
		if(employee.basePay<8.0)
			return 0;
		if(employee.hoursWorked>=0 && employee.hoursWorked<=40) {
			salary = (employee.hoursWorked*employee.basePay);
		}
		else if(employee.hoursWorked>40 && employee.hoursWorked<=60){
			int hw=employee.hoursWorked-40;
			double overTime=employee.basePay*1.5*hw;
			salary=((employee.hoursWorked-hw)*employee.basePay)+overTime;
		}
		else
			return -1;
		
		return salary;
		
	}
	
	public static String displayEmployeeDetails(Employee employee) {
		System.out.println(DayPay.calculateSalry(employee));
		employee.setSalary(DayPay.calculateSalry(employee));
		if(employee.basePay<8.0 || employee.hoursWorked<=0 || employee.hoursWorked>=60)
			return "Employee cannot exist with given information";
		return employee.toString();
		
	}

}
