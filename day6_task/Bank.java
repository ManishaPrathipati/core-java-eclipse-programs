package day6_task;

public class Bank{
	String name;
	double salary;
	
	public Bank(String name, double sal) {
		this.name=name;
		this.salary=sal;
	}
	private class HDFC implements Account{
		String name;
		double salary;
		
		public HDFC(String name, double sal) {
			this.name=name;
			this.salary=sal;
		}
		
		public void banking() {
			System.out.println("Hey " + this.name + " Welcome to HDFC Banking");
		}

		public void salaryAccount() {
			System.out.println("Thanks for Opening Salary Account in HDFC, Your Salary Account is credited with " 
					+ this.salary + " as a Welcoming Gift");
		}

		public void nriAccount() {
			System.out.println("Various types of bank accounts for NRIs available are: \n"
					+ "1.  Non-resident ordinary (NRO) savings accounts or fixed deposit accounts \n"
					+ "2.  Non-resident external (NRE) savings accounts or fixed deposit accounts \n"
					+ "3. Foreign currency non-resident (FCNR) account");
		}

		public void fdAccount() {
			System.out.println("There are different types of Fixed Deposit accounts: \n"
					+ "1. Fixed deposit account \n 2.  Recurring deposit account");
		}

	}
	
	public Account account() {
		return new HDFC(name, salary);
		
	}

}