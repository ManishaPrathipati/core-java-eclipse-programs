package finalexam;

import java.util.Stack;

class Stack1{
	public boolean checkBalance(String s) {
		String balancedStrings[]= {"{}()", "[{()}]", "({()})"};
		for (int i = 0; i < balancedStrings.length; i++) {
			if(s.indexOf(balancedStrings[i])!=-1) {
				return true;
			}
		}
		
		return false;
	}
}

public class Testing {
	
	public static void main(String[] args) {
		Stack1 s1=new Stack1();
		
		Stack<String> ss=new Stack<String>();
					ss.push("{}()");
					ss.push("[{()}]");
					ss.push(" ");
					ss.push("({()})");
					ss.push("{}(");
					ss.push("({)}");
					ss.push("[[");
					ss.push("}{");
					ss.push("Massil");
					ss.push("Technologies");
				
		for (String string : ss) {
			if(s1.checkBalance(string)) {
				System.out.println(string + " is a Correctly Balanced String");
			}
			else {
				System.out.println(string + " is a UnBalanced String");
			}
		}

	}

}
