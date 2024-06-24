package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class BufferedEg {

	public static void main(String[] args) throws IOException {
		
		//Buffered Input
		
//		FileInputStream fi=new FileInputStream("C:\\Users\\sada\\Desktop\\DeskFile.txt");
//		BufferedInputStream bi=new BufferedInputStream(fi);
//		while (bi.available()>0) {
//			System.out.print((char)bi.read());
//		}
//		bi.close();
		
		
		//Buffred Output
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\sada\\Desktop\\FileWrite.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		DataInputStream dis=new DataInputStream(System.in);
		String s=dis.readLine();
		for (int i = 0; i < s.length(); i++) {
			bo.write(s.charAt(i));
		}
		bo.close();
	}

}
