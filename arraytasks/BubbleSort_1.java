package arraytasks;

import java.util.Scanner;

public class BubbleSort_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the size of the Array");
		int size=scanner.nextInt();
		int[] b=new int[size];
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter the Element " + (i+1));
			b[i]=scanner.nextInt();
		}
		
		for (int i = 0; i < b.length-1; i++) {
			for (int j = 1; j < b.length-i; j++) {
				if(b[j-1]>b[j]) {
					int temp=b[j];
					b[j]=b[j-1];
					b[j-1]=temp;
				}
			}
		}
		for (int i : b) {
			System.out.print(i + " ");
		}
	}

}
