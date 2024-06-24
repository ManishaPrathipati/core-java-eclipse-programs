package stringexamples;

public class EncriptingString {

	public static void main(String[] args) {
		String s="ad", res="";
		int c=0;
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i)+9)>122) {
				c++;
			}
		}
		if(c!=0) {
			for (int i = 0; i < s.length(); i++) {
				if((s.charAt(i)+9)>122) {
					res+=(char)('a'+8);
				}
				else {
					res+=(char)(s.charAt(i));
				}
			}
		}
		else {
			for (int i = 0; i < s.length(); i++) {
					res+=(char)(s.charAt(i)+9);
			}
		}
		System.out.println(res);
	}

}
