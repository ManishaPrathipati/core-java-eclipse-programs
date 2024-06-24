package exam;

public class Pattern_fib {

	public static void main(String[] args) {
		int input=6;
		for(int i=1; i<=input; i++) {
			for (int j = 1; j <=i; j++) {
				fib(j-1);
			}
			System.out.println();
		}

	}
	
	public static void fib(int i) {
		int a=0, b=1, c=0;
		if(i==0) {
			System.out.print(c);
		}
		else if(i==1) {
			System.out.print(a);
			System.out.print(b);
		}
		while (c<=i) {
			c=a+b;
				System.out.print(c);
				a=b;
				b=c;
				c=a+b;
				
		}
	}

}
