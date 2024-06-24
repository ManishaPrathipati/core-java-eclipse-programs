package stringexamples;

public class Prog48 {

	public static void main(String[] args) {
		Prog48 p48=new Prog48();
		System.out.println(p48.sumOfAmicablePairs());
		System.out.println(220+284+1184+1210);
	}

	public int sumOfAmicablePairs(){
		int sum = 0;
		for (int i = 1; i <=1000000; i++) {
			int n1=getSumOfProperDivisors(i);
			int n2=getSumOfProperDivisors(n1);
				if(n2==i && i!=n1) {
//					System.out.println(i);
					sum+=i;
				}
		}
		return sum;
	}
	
	public int getSumOfProperDivisors(int n){
		int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
}
