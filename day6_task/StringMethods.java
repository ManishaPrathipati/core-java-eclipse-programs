package day6_task;

import java.util.Arrays;

public class StringMethods{

	public static void main(String[] args){

		String s1="manisha";
		String s2="Prathipati";
		String s3="manisha";
		String s4=new String();
		String s5=new String("manisha");
		String s6=new String("manisha");
		String s7=new String("prathipati");
		String s="  My name is Manisha, Manisha Prathipati  ";
		
		System.out.println(s1.length());
		System.out.println(s2.length());

		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(5));

		System.out.println(s1==s2);	
		System.out.println(s1==s3);	
		System.out.println(s2==s7);	
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s6));
		System.out.println(s5==s6);	
		System.out.println(s5.equals(s6));

		System.out.println(s1.compareTo(s6));
		System.out.println(s6.compareTo(s2));
		System.out.println(s6.compareTo(s7));

		System.out.println(s1.concat(s2));
		
		System.out.println(s3.contains(s6));
		System.out.println(s3.contains(s7));
		
		System.out.println(s3.endsWith("ha"));
		System.out.println(s2.endsWith("hi"));
		
		System.out.println(s2.equalsIgnoreCase(s7));
		
		System.out.println(s.indexOf("Prathipati"));
		System.out.println(s.indexOf("Manisha",11));
		System.out.println(s.indexOf('y'));
		System.out.println(s.indexOf('M', 21));
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s3.replace('m', 'M'));
		
		System.out.println(s1.replaceAll(s1, "manisha p"));
		
		System.out.println(Arrays.toString(s.split(" ")));
		String[] sArr=s.split(" ");
		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(s.split(" ", 3)));
		String[] sArrl=s.split(" ", 3);
		for (int i = 0; i < sArrl.length; i++) {
			System.out.print(sArrl[i]);
		}
		
		System.out.println();
		System.out.println(s1.startsWith("M"));
		
		System.out.println(s5.substring(3));
		System.out.println(s.substring(5,21));
		
		char [] cArr=s.toCharArray();
		System.out.println(cArr);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.trim());
		
		System.out.println(s.valueOf('m'));
		System.out.println(s.valueOf(cArr));
	}
}
