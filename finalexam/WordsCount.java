package finalexam;

import java.io.FileReader;
import java.io.IOException;

public class WordsCount {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\sada\\Desktop\\DeskFile.txt");
		int i, c=0;
		String s="";
		
//		while((i=fr.read())!=-1) {
//			System.out.println((char)i);
//			if(i==' '){
//				c++;
//				System.out.println(c);
//			}
//		}
//		c++;
//		System.out.println(c);
		
		while((i=fr.read())!=-1) {
			s+=(char)i;
		}
		String[] sArr=s.split(" ");
		System.out.println(sArr.length);
		fr.close();
	}

}
