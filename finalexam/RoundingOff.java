package finalexam;

public class RoundingOff {

	public static void main(String[] args) {
		RoundingOff ro=new RoundingOff();
		System.out.println(ro.sumOfMultiples(11, 34, 79));
	}

	public int sumOfMultiples(int a, int b, int c) {
		int[] aArr= {a,b,c};
		int x=0;
		for (int j = 0; j < aArr.length; j++) {
			while(!(aArr[j]%10==0)) {
				aArr[j]++;
			}
			x+=aArr[j];
		}
		return x;
	}

}
