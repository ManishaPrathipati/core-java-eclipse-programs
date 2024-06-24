package arraytasks;

import java.util.Arrays;

public class FindMissingNum {

	public static void main(String[] args) {
		int[] a= {5,2,12,60,3,6};	//2,3,5,6,12
		int[] sArr=sort(a);
		//System.out.println(Arrays.toString(sArr));
		System.out.print("Missing Elements in the Array are: ");
		for (int i = 0; i < sArr.length-1; i++) {
			if((sArr[i+1]-sArr[i])>1) {
				for (int j = sArr[i]+1; j < sArr[i+1]; j++) {
					System.out.print(j+" ");
				}
			}
		}
	}

	public static int[] sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}

}
