package exam;

public class Merge2StringArrays {

	public static void main(String[] args) {
		String[] str1= {"abc", "xyz"};//{"abc", "def", "lkm", "xyz"}
		String[] str2= {"def", "lkm"};
		
		String[] strRes=mergeArray(str1, str2);
		for(int i=0; i<strRes.length-1; i++) {
			if(strRes[i].compareTo(strRes[i+1])>0) {
				String temp=strRes[i];
				strRes[i]=strRes[i+1];
				strRes[i+1]=temp;
			}
			else {
				strRes[i]=strRes[i];
			}
		}
		for (String string : strRes) {
			System.out.println(string);
		}
	}

	public static String[] mergeArray(String[] str1, String[] str2) {
		String[] sres=new String[str1.length+str2.length];
		
			for(int i=0,j=0; j<str1.length; i++) {
				sres[i]=str1[j++];
			}
			for(int i=str1.length,j=0; j<str2.length; i++) {
				sres[i]=str2[j++];
			}
		return sres;
	}
	

}
