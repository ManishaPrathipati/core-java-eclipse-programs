package stringexamples;

public class Prog17 {

	String res="";
	int count=0;
	public String createBoxPattern(int r, int c){
		if (r < 0 || c < 0)
			return "-1";
		else if ((r == 0) || (c == 0))
			return "-2";
		else {
			for(int i=1; i<=r; i++) {
				for(int j=1; j<=c; j++) {
					if(i==1 || i==r || j==1 || j==c) {
						res+="*"+" ";
						count++;
					}
					else {
						res+="  ";
						count++;
					}
					if(count==c) {
						System.out.println(res);
						count=0;
						res="";
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Prog17 p17=new Prog17();
		String res=p17.createBoxPattern(4, 5);
		System.out.println(res);
	}

}
