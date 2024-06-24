package exam;

public class NoAdjucentChars {

	public static void main(String[] args) {
		String s="aaabbc";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			int c=0, c1=0;
			char ch1=s.charAt(i);
			for (int j = 0; j < s.length(); j++) {
				char ch2=s.charAt(j);
				if(ch1==ch2 && i>j){
					break;
				}
				if(ch1==ch2) {
					c++;
					c1=c;
				}
			}
			if(c1>=c)
//			if(c1>=c) {
				//System.out.println(ch1 + " Occured " + c + " times");
				System.out.println(c);
//			}
			
		}
	}

}
