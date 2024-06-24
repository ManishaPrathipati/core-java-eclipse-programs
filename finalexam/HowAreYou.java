package finalexam;

import java.util.Arrays;

public class HowAreYou {

	public static void main(String[] args) {
		String s="How Are You", res1="", res2="", res3="";
		String[] sArr=s.split(" ");
		String[] res=new String[sArr.length];
		for (int i = 0; i < sArr.length; i++) {
			for (int j = 0; j < sArr[i].length(); j++) {
					switch (j) {
					case 0: {
						res1+=sArr[i].charAt(j);
						break;
					}
					case 1: {
						res2+=sArr[i].charAt(j);
						break;
					}
					case 2: {
						res3+=sArr[i].charAt(j);
						break;
					}
					default:
						System.out.println("Hiiiii");
						break;
					}
			}
		}
		System.out.println(res1+res2+res3);
	}

}
