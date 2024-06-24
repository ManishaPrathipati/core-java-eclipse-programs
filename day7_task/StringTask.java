package day7_task;

public class StringTask {

	public static void main(String[] args) {
		String s1="Manisha ";
		String s11="manisha ";
		String s2="Prathipati ";
		String s22="prathipati ";
		String s="Java Programming";
		
		//Concatination
		System.out.println(s1.concat(s2));
		System.out.println(s2+s1);
		
		//Length
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//SubString
		System.out.println(s1.substring(3));
		System.out.println(s.substring(5,12));
		
		//Equals
		System.out.println(s1.equals(s11));
		System.out.println(s2.equals(s22));
		
		//EqualsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s11));
		System.out.println(s2.equalsIgnoreCase(s22));
		
		//CompareTo
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s11));
		System.out.println(s2.compareToIgnoreCase(s22));
		
		//Reverse a String
		String sr="Massil Technology";
		String rev="";
		for (int i = 0; i < sr.length(); i++) {
			rev=sr.charAt(i)+rev;
		}
		System.out.println(rev);
		
		//Counting Vowels And consonants
		int vcount=0, ccount=0;
		String svc="Masiil Technology...!!!";
		for (int i = 0; i < svc.length(); i++) {
			char ch=svc.charAt(i);
			
			switch (ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				vcount++;
				break;
			default:
				if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
					ccount++;
				else
					System.out.println(ch + " is not an Alphabet"); 
			}
		}
		System.out.println(svc +" contains " + vcount + " Vowels");
		System.out.println(svc +" contains " + ccount + " Consonents");
		
		//Split Sentence
		String sArr[]=s.split("a");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		
		//Join Strings with Delimeter
		String emp1="Manisha";
		String emp2="Manjusha";
		String emp3="Anitha";
		String emp4="Lakshmi";
		String emp5="Ektha";
		String emp6="Navi Kanth";
		String emp7="Nikhil";
		String emp8="Rajesh";
		
		System.out.println("Trainig is Ongoing for: "+String.join(",", emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8));
		
		//Regax Matching
		String sreg="Java is a  high level programming Language";
		System.out.println(sreg.matches("(.*)level(.*)"));
		System.out.println(sreg.matches("(.*)Language"));
		System.out.println(sreg.matches("Java"));
		
		//Replace String
		System.out.println(sreg.replace('a', 'A'));
		System.out.println(sreg.replaceFirst("a", "A"));
	}

}
