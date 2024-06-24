package stringexamples;

public class WorldOccurance {

	public static void main(String[] args) {
		String s1="hello world, world world is Beautiful,world,word world";
		String s2="world";
		int count=0;
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)=='w') {
				if(s1.indexOf(s2, i)!=-1) {
					int ind=s1.indexOf(s2,i);
					if(i>=ind)
						count++;
				}
			}
		}
//		System.out.println(count);
		
	}

}
