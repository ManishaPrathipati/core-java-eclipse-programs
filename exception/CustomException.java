package exception;

import java.util.Scanner;

class InValiedAge extends Exception{
	
}
class Age{
	
		private int age;

		public int getAge() {
			return age;
		}

		public void setAge(int age) throws InValiedAge {
			if(age>=18)
				this.age = age;
			else {
					throw new InValiedAge();
			}
		}

		public Age(int age) throws InValiedAge {
			super();
			if(age>=18)
				this.age = age;
			else {
					throw new InValiedAge();
			}
		}

		@Override
		public String toString() {
			return "Age [age=" + age + "]";
		}

}
public class CustomException{

	static Age a;
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=scan.nextInt();
		
			try {
				a=new Age(age);
				System.out.println(a);
			} catch (InValiedAge e) {
				System.out.println("Age Limit is not matching with the Credentials");
			}
			
		
	}

}
