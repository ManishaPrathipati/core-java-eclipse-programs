package exam;

public class LargeNumWithoutDigit {

	public static void main(String[] args) {
		int num=545, digit=5;
		for(int i=num; i>=1; i--) {
			int n=i, count=0;
			while(n!=0) {
				int rem=n%10;
					if(rem==digit) {
						count++;
					}
				n/=10;		
			}
			if(count==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
