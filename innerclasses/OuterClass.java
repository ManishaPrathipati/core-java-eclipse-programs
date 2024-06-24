package innerclasses;

public class OuterClass {

	private String name="Manisha";
	private String empId;
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	private void run() {
		System.out.println("Hiii I am from private Outer class"); 
	}
	
	class InnerClass{
		
		public void runn() {
			run();
			System.out.println("I am from Inner Class");
			System.out.println("Name: "+ name);
			setEmpId("T0040");
			System.out.println(getEmpId());
		}
	}
	
	public static void main(String[] args) {
		OuterClass class1=new OuterClass();
		OuterClass.InnerClass class2=new OuterClass().new InnerClass();
		class2.runn();
		
	}
}
