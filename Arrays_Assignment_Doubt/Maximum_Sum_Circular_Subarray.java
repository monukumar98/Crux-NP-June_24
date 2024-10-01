package Arrays_Assignment_Doubt;

public class Maximum_Sum_Circular_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -10, 2 - 7, 11, -1, 4 };
		System.out.println(Maximum_Sum(arr));

	}

	public static int Maximum_Sum(int[] arr) {
		// linear array me maximum sum lelo using kadanes algo
		int linear_sum = kadanes(arr);
		int total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			total_sum += arr[i];
			arr[i] = arr[i] * -1;
		}
		int mid_sum = kadanes(arr);
		int Circular_sum = total_sum + mid_sum;
		if (Circular_sum == 0) {
			return linear_sum;
		}
		return Math.max(linear_sum, Circular_sum);
	}

	public static int kadanes(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];// sum = sum + arr[j];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}
}
