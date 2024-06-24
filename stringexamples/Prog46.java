package stringexamples;

public class Prog46 {

	public String isKaprekarNumber(int n) {
		int temp = n, base = 0;
		while (temp != 0) {
			temp /= 10;
			base++;
		}
		int nSquare = n * n, ns=nSquare, sBase=0;
		while (ns != 0) {
			ns /= 10;
			sBase++;
		}
		
		int res = 0, count=0, sum=0;
		while (nSquare != 0) {
			int rem = nSquare % 10;
			count++;
			int pow=1;
			for (int i = 1; i < count; i++) {
				pow=pow*10;
			}
			res=(rem*pow)+res;
			if(count==base) {
				sum+=res;
				res=0;
			}
			else if((sBase-count)<base) {
				sum+=nSquare;
				return "True";
			} 
			nSquare /= 10;
		}
		return "False";
	}

	public static void main(String[] args) {
		Prog46 p46 = new Prog46();
		System.out.println(p46.isKaprekarNumber(97));
	}

}
