package exception;

import java.util.Scanner;

class SalaryInCorrectException extends Exception{
	
}

class Employee{
	String name;
	String job;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws SalaryInCorrectException {
		if(salary>10000)
			this.salary = salary;
		else {
				throw new SalaryInCorrectException();
			
		}
	}
	
	public Employee(String name, String job, double salary) throws SalaryInCorrectException {
		super();
		this.name = name;
		this.job = job;
		if(salary>10000)
			this.salary = salary;
		else {
				throw new SalaryInCorrectException();
		}
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", job=" + job + ", salary=" + salary + "]";
	}
	
	
}
public class CustomChecked {

	public static void main(String[] args) {
		Employee e1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please provide Salary Particulars");
		double sal=scan.nextDouble();
		try {
			e1 = new Employee("Mickey", "Trainee Software Engineer", sal);
			System.out.println(e1);
		} catch (SalaryInCorrectException e) {
			System.out.println("Please Provide Valid Salary");
			
		}
		

	}

}
