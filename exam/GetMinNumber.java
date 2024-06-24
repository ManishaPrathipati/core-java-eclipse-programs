package exam;

public class GetMinNumber {

	public static void main(String[] args) {
		int[] a= {10, 3, 54, 63, 2, 66, 73};
		System.out.println(getMinValue(a));
	}
	
	public static int getMinValue(int[] a) {
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}

}
