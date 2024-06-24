package stringexamples;

public class Prog12 {

	String res = "";

	public String getNaturalNumbers(int a, int b) {
		if (a < 0 || b < 0)
			return "-1";
		else if ((a == 0) || (b == 0))
			return "-2";
		else {
			if (a < b) {
				res += a + " ";
				a++;
				if (a == b)
					res += b;
				else
					getNaturalNumbers(a, b);
			}
			return res;
		}
	}

	public static void main(String[] args) {
		Prog12 p12 = new Prog12();
		System.out.println(p12.getNaturalNumbers(6, 14));
	}

}
