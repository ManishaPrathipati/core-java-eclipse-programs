package arraytasks;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch_2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size=scanner.nextInt();
		int[] l=new int[size];
		
		for (int i = 0; i < l.length; i++) {
			System.out.println("enter the Element for index "+ i);
			l[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the Element to search");
		int element=scanner.nextInt();
		int index=l.length;
		
		for (int i = 0; i < l.length; i++) {
			if(l[i]==element)
				index=i;
		} 
		
		if(index!=l.length)
			System.out.println("Element is Present at " + index + " index");
		else
			System.out.println("Element is Not Present");
	}

}
