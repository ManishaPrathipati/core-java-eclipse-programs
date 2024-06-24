package collections;

import java.util.Stack;

public class StringReverseWithStack {

	public static void main(String[] args) {
		String s="Massil Technologies";
		
		char[] strChar=new char[s.length()];
		
		Stack<Character> stk=new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			stk.push(s.charAt(i));
		}
		
//		int i=0;
//		while (!(stk.isEmpty())) {
////			strChar[i]=stk.pop();
////			i++;
//			
//			strChar[i++]=stk.pop();
//		}
		
		for (int i = 0, j=strChar.length-1; i < stk.size(); i++ /* , j-- */) {
//			strChar[j]=stk.get(i);
			
			strChar[j--]=stk.get(i);
		}
		
		System.out.println(strChar);
	}

}
