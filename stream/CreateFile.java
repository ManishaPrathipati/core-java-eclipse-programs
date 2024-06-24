package stream;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\sada\\Desktop\\DeskFile.txt");
		System.out.println("Enter Any text");
		char ch;
		while ((ch=(char)dis.read())!='@') {
			fos.write(ch);
			
		}
		fos.close();
	}

}
