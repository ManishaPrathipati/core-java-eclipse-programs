package exam;

public class MirrorImageString {

	public static void main(String[] args) {
		System.out.println(getImage("EARTH"));
	}
	
	public static String getImage(String s) {
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			rev=s.charAt(i)+rev;
		}
		return s+"|"+rev;
	}

}
