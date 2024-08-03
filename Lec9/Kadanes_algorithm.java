package Lec9;

public class Kadanes_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -7, 5, -1, 8 };
		System.out.println(MaximumSum(arr));

	}

	public static int MaximumSum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];// sum = sum + arr[j];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;

	}

}
