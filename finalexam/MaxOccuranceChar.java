package finalexam;

public class MaxOccuranceChar {

	public static void main(String[] args) {
		MaxOccuranceChar moc=new MaxOccuranceChar();
		System.out.println(moc.maxOccurranceCharacters("rrregisssstration"));
	}

	public String maxOccurranceCharacters(String string) {
		String res="";
		int max=0;
		for (int i = 0; i < string.length(); i++) {
			int count=0;
			for (int j = 0; j < string.length(); j++) {
				char c1=string.charAt(i), c2=string.charAt(j);
				if(c1==c2 && i>j) {
					break;
				}
				if(c1==c2) {
					count++;
				}
			}
			if(count>=max) {
				max=count;
				res+=string.charAt(i)+ " Occured " + count + " times, ";
			}
		}
		return res;
	}

}
