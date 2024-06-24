package stringexamples;

public class Prog50 {

	public static void main(String[] args) {
		Prog50 p50=new Prog50();
		System.out.println(p50.getGCD(123,345));
	}

	public int getGCD(int n1, int n2) {
		int gcd = 0;
		if(n1<0 || n2<0)
			return -1;
		else {
			for(int i=1, j=1; (i<=n1 && j<=n2); i++, j++) {
				if(n1%i==0 && n2%j==0)
					gcd=i;
			}
		}
		return gcd;
	}

}
