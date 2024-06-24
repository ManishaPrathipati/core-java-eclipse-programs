package arraytasks;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a= {1,2,3,3,4,3,6,4,1,0,10,2,13};
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j] && i>j)
					break;
				if(a[i]==a[j])
					count++;
			}
			if(count>=1)
				System.out.print(a[i]+" ");
		}

	}

}
