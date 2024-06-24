package day6_task;

public class StringMethhods_1 {

	public static void main(String[] args) {

		String s1="manisha";
		String s2="prathipati";
		String s3="HEllo";
		String s4=new String("Hello Mickey");
		String s5=new String("Hello Mickey");
		String s="Welcome to Massil Technology";
		
		System.out.println(String.format("My Name is: %s", s1));
		
		byte[] bArr=s3.getBytes();
		for(int a:bArr) {
			System.out.println(a);
		}
		
		String ss4=s4.intern();
		String ss5=s5.intern();
		System.out.println(ss4==ss5);
		
		System.out.println(s3.lastIndexOf('y'));
		System.out.println(s.lastIndexOf("Technology"));
		System.out.println(s.lastIndexOf('o', 5));
		System.out.println(s2.lastIndexOf("ht", 3));

	}

}
