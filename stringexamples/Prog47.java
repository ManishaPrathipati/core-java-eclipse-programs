package stringexamples;

public class Prog47 {

	public int sumOfProperDivisors(int n){
		if(n<0)
			return -2;
		else if(n==0)
			return -3;
		else {
			int sum=0;
			for(int i=1; i<n; i++) {
				if(n%i==0)
					sum+=i;
			}
			
			if(sum>n)
				return 1;
			else if(sum<n)
				return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Prog47 p47=new Prog47();
		System.out.println(p47.sumOfProperDivisors(0));
		System.out.println(297*297);
	}

}
