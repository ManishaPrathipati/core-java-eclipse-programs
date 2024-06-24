package arraytasks;

import java.util.Scanner;

public class MaxAndMinEle_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the Size of the Array");
		int size=scanner.nextInt();
		int[] i=new int[size];
		
		for (int j = 0; j < i.length; j++) {
			System.out.println("Enter the Element for index " + (j));
			i[j]=scanner.nextInt();
		}
		int min=i[0], max=i[0];
		for (int j = 0; j < i.length; j++) {
			if(i[j]<min)
				min=i[j];
			if(i[j]>max)
				max=i[j];
		}
		System.out.println("Minimum Element in the Given Array is: " + min);
		System.out.println("Maximum element in the given Array is: " + max); 
	}

}
