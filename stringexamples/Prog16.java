package stringexamples;

public class Prog16 {

	String res = "";
	int count =0;
	public String getFourPerLine(int a) {
		if (a < 0)
			return "-1";
		else if (a == 0)
			return "-2";
		else if (a > 99)
			return "-3";
		else {
			
				for(int i=1; i<=a ; i++) {
					res+=i+" ";
					count++;
					if(count==4) {
						System.out.println(res);
						count=0;
						res="";
					}
				}
				
			return res;
		}
	}

	public static void main(String[] args) {
		Prog16 p16 = new Prog16();
		System.out.println(p16.getFourPerLine(98));
	}

}
