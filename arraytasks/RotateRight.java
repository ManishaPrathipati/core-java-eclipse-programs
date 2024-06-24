package arraytasks;

import java.util.Arrays;

public class RotateRight {

	public static void main(String[] args) {
		int[] i= {56,1,21,334,123,1,3,76};
		int[] res=new int[i.length];
		for (int j = 0, k=1; j < res.length-1; j++) {
			res[k++]=i[j];
		} 
		res[0]=i[i.length-1];
		for (int j = 0; j < res.length; j++) {
			System.out.print(res[j]+" ");
		} 
	}

}
