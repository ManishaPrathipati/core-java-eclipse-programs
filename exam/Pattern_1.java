package exam;

public class Pattern_1 {

	public static void main(String[] args) {
		int input=6;
		for(int i=1; i<=input; i++) {
			for(int j=1; j<=i; j++) {
				fib(j-1);
			}
			System.out.println();
		}

	}
	
	public static void fib(int n) {
		int a=0, b=1, c=a+b;
		if(n==a || n==b) {
			System.out.print(n);
		}
		while(c<=n) {
			if(c==n) {
				System.out.print(c);
			}
			a=b;
			b=c;
			c=a+b;
		}
	}

}
