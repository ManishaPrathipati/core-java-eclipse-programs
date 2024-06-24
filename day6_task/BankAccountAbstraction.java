package day6_task;

import java.util.Scanner;

public class BankAccountAbstraction {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		String name=scan.next();
		Bank b=new Bank(name, 2000);
		Account a = b.account();
				a.banking();
				a.salaryAccount();
				a.nriAccount();
				a.fdAccount();

	}

}
