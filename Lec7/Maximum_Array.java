package Lec7;

public class Maximum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		System.out.println(Max_Value(arr));
	}

	public static int Max_Value(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		return max;

	}

}
