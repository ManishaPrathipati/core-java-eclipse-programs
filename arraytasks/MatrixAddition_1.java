package arraytasks;

import java.util.Scanner;

public class MatrixAddition_1 {

	public static void main(String[] args) {

		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 2, 3 }, { 5, 2 } };
		int c[][] = new int[a.length][a[0].length];

		if (a.length == b.length && a[0].length == b[0].length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}

			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Addition is not possible");

	}

}
