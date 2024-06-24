package finalexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveStringsFromList {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the String");
		String s=scan.nextLine();
		//String s= "apple orange banana grapes MANGO";
		String[] sArr=s.split(" ");
//			String res[]=createSubList(sArr);
//			System.out.println(Arrays.toString(res));
		System.out.println(createSubList(sArr));
		
	}
	
	public static ArrayList<String> createSubList(String[] sArr){
		
		String vowels="aeiouAEIOU";
		int count=0;
//		for (int i = 0; i < sArr.length; i++) {
//			if((vowels.indexOf(sArr[i].charAt(0))==-1) && (vowels.indexOf(sArr[i].charAt(sArr[i].length()-1))==-1)) {
//				count++;
//			}
//		}
		ArrayList<String> r=new ArrayList<String>();
		for (int i = 0; i < sArr.length; i++) {
			if((vowels.indexOf(sArr[i].charAt(0))==-1) && (vowels.indexOf(sArr[i].charAt(sArr[i].length()-1))==-1)) {
				//r[j++]=sArr[i];
				r.add(sArr[i]);
			}
		}
		
		return r;
	}

}
