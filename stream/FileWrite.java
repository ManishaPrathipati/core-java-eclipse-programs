package stream;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\sada\\Desktop\\FileWrite.txt");
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Please Enter any Text Here...!!!");
		String s=dis.readLine();
		for (int j = 0; j < s.length(); j++) {
			fw.write(s.charAt(j));
		}
		fw.close();
	}

}
abstract class AbsClaass{
	
}