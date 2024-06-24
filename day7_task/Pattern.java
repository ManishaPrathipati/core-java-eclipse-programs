package day7_task;

public class Pattern {

	public static void main(String[] args) {
		int n=4, num=0;
		for (int i = 1; i <= n; i++) {
			num+=i;
			int a=num;
			for(int j=1; j<=i; j++) {
				System.out.print(a--);
			}
			System.out.println();
		}

	}

}
