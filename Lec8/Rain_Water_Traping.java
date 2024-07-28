package Lec8;

public class Rain_Water_Traping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(Rain_Water(arr));
	}

	public static int Rain_Water(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + Math.min(left[i], right[i]) - arr[i];
		}
		return sum;
	}

}







