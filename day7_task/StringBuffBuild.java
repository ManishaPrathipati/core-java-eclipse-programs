package day7_task;

public class StringBuffBuild {

	public static void main(String[] args) {
		
		
		StringBuffer sbf=new StringBuffer("Hello");
					sbf.append(" ");
					sbf.append("Manisha ");
					sbf.append('P');
		
					sbf.insert(15, " Your Id is: ");
					sbf.insert(28, 'T');
					sbf.insert(29, "0040");
		System.out.println(sbf);
		
					sbf.replace(14, 15, "Prathipati");
					//System.out.println(sbf);
					
					sbf.delete(0, 6);
					//System.out.println(sbf);
					
				StringBuffer sr=new StringBuffer("Java");
				sr.reverse();
				System.out.println(sr);
				
				StringBuffer sc=new StringBuffer(12);
				System.out.println(sc.capacity());
				sc.append("Hello");
				System.out.println(sc.capacity());
				sc.append(" My dear Buddy, Welcome to the world");
				System.out.println(sc);
				System.out.println(sc.capacity());
				
				System.out.println(sr.capacity());
				System.out.println(sbf.capacity());
				
				StringBuffer sec=new StringBuffer();
				System.out.println(sec.capacity());
				sec.ensureCapacity(10);
				System.out.println(sec.capacity());
				sec.ensureCapacity(30);
				System.out.println(sec.capacity());
				
				sc.deleteCharAt(19);
				System.out.println(sc);
				sc.delete(8, 13);
				System.out.println(sc);
				
				//String Builder
				
				StringBuilder sbl=new StringBuilder("Massil");
							sbl.append("Technology");
				System.out.println(sbl);
						
							sbl.insert(6, " ");
				System.out.println(sbl);
				
							sbl.replace(16, 18, "ies");
				System.out.println(sbl);
				
				StringBuilder sb=new StringBuilder();
				sb.append("Hello World");
				System.out.println(sb.capacity());
				sb.append("Sry for polluting You");
				System.out.println(sb.capacity());
				
				
				StringBuilder seb=new StringBuilder();
				System.out.println(seb.capacity());
				seb.ensureCapacity(7);
				System.out.println(seb.capacity());
				seb.ensureCapacity(40);
				System.out.println(seb.capacity());
	}

	

}
