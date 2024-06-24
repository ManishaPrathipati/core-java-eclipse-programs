package exam;

public class Employee {

	private String name;
	private int employeeId;
	private double salary;
			int hoursWorked;
			double basePay;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	//No Argument Constructor
	public Employee() {
		super();
	}
	
	//Constructor Using Fields
	public Employee(String name, int employeeId, int hoursWorked, double basePay) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.hoursWorked = hoursWorked;
		this.basePay = basePay;
	}
	@Override
	public String toString() {
		return "Employee [Name:" + name + ", id:" + employeeId + ", Base Pay:" + basePay + ", No. of hours worked:"
				+ hoursWorked + ", Payed:" + salary + "]";
	}
	
	
	
	
}
