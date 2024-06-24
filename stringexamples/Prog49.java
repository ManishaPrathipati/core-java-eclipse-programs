package stringexamples;

public class Prog49 {

	public static void main(String[] args) {
		Prog49 p49 = new Prog49();
//		System.out.println(p49.convertMMMtoMM("NoVenbEr"));
		System.out.println(p49.getSumOfDigits(p49.getLuckyNumber("13-noVemBer-1997")));
//		System.out.println(p49.getLuckyNumber("15-MaRch-2016"));
	}

	public int convertMMMtoMM(String s) {
		String month = "janfebmaraprmayjunjulaugsepoctnovdec";
		String mon = s.toLowerCase(), m = "";
		int monNum = 0;
		for (int i = 0; i < 3; i++) {
			m += mon.charAt(i);
		}

		if (month.indexOf(m) != -1) {
			int ind = month.indexOf(m);
			monNum = (ind / 3) +1;
		}
		return monNum;
	}
	
	public  int getSumOfDigits(int n) {
		int sum=0;
		while (n != 0) {
			int rem = n % 10;
			n /= 10;
			sum += rem;
		}
		if (sum >= 10) {
			return getSumOfDigits(sum);
		} 
		return sum;
	}

	public int getLuckyNumber(String s) {
		int sum = 0;
		String sArr[] = s.split("-"), res = "";
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].charAt(0) >= '0' && sArr[i].charAt(0) <= '9') {
				for (int j = 0; j < sArr[i].length(); j++) {
					res += sArr[i].charAt(j);
				}
			}
			else
				res += convertMMMtoMM(sArr[i]);
		}
		sum = Integer.parseInt(res);
		return sum;
	}
}
