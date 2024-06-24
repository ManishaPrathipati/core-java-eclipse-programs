package arraytasks;

import java.util.Scanner;

public class MatrixMultiplition_1 {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 4 }, { 3, 4, 1 } };
		int b[][] = { { 2, 3 }, { 5, 2 }, { 1, 3 } };
		int c[][] = new int[a.length][b[0].length];

		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					int sum = 0;
					for (int k = 0; k < a[0].length; k++) {
						sum += a[i][k] * b[k][j];
					}
					c[i][j] = sum;
				}
			}

			for (int i = 0; i < c.length; i++) {                          
				for (int j = 0; j < c[i].length; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		} else
			System.out.println("Multiplition is not possible");

	}

}
