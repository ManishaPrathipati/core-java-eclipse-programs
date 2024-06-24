package threadtasks;

public class HalfStringRev {

	public static void main(String[] args) {
		String s="Massil abdcefghijklmn", res="";
		
//		String[] ss=s.split(" ");
//		String s1=ss[ss.length-1];
//		
//		for (int i = s1.length()-1; i >=0 ; i--) {
//			if((s1.length()-1)%2!=0) {
//				if(s1.indexOf(s1.charAt(i),i)%2!=0)
//					res+=s1.charAt(i);
//			}
//			else if(s1.indexOf(s1.charAt(i),i)%2==0)
//				res+=s1.charAt(i);
//		}
		
		for (int i = s.length()-1; i >=0; i--) {
			if(s.charAt(i)==' ') {
				break;
			}
			else {
				if((s.length()-1)%2!=0) {
					if(s.indexOf(s.charAt(i),i)%2!=0)
						res+=s.charAt(i);
				}
				else if(s.indexOf(s.charAt(i),i)%2==0)
					res+=s.charAt(i);
			}
		}
		
		System.out.println(res);
		
	}

}
