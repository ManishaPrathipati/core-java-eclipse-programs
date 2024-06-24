package arraytasks;

public class CommonElement {

	public static void main(String[] args) {
		int[] a= {12,3,5,76,12,3,7};
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j] && i>j)
					break;
				if(a[i]==a[j])
					count++;
			}
			if(count>1) {
				System.out.print(a[i]+" "); 
			}
		}
	}

}
