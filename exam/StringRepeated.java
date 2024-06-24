package exam;

public class StringRepeated {

	public static void main(String[] args) {
		String s="aaabbc", res="";
		
		for (int i = 0; i < s.length(); i++) {
			//for (int j = 1; j < s.length()-i; j++) {
//				if(i%2!=0) {
//					res+=s.charAt(i);
//				}
//				else {
//					//res+=" ";
//					if((s.charAt(i)==s.charAt(i+1)) || (s.charAt(i)==s.charAt(i-1)))
//						res+=" ";
//					else
//						res+=s.charAt(i);
//				}
			//}
		}
		System.out.println(res);
		
		String a="abc", b="xyz";
		System.out.println(a.compareTo(b));
	}

}
