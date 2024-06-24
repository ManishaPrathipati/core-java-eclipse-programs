package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\sada\\Desktop\\DeskFile.txt");
		System.out.println("Reading of file is Completed");
		int i;
		while ((i=fis.read())!=-1) {
			System.out.println((char)i);
		}
		fis.close();
	}

}
