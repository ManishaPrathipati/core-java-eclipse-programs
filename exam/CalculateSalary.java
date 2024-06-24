package exam;

public class CalculateSalary {

	public static void main(String[] args) {
		Employee employee=new Employee("John", 123, 50, 17);
		DayPay dayPay=new DayPay();
		System.out.println(dayPay.displayEmployeeDetails(employee));
	}

}
