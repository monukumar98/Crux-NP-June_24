package Arrays_Assignment_Doubt;

public class Get_the_Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 4, 5, 8, 10 };
		int[] arr2 = { 4, 6, 8, 9 };
		System.out.println(Maximum_Score(arr1, arr2));
	}

	public static int Maximum_Score(int[] arr1, int[] arr2) {
		long sum1 = 0, sum2 = 0, ans = 0;
		int i = 0, j = 0, p = 0, q = 0;
		int mod = 1000000007;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				sum1 = sum_array(arr1, p, i);
				sum2 = sum_array(arr2, q, j);
				ans = (ans + (Math.max(sum2, sum1)) % mod) % mod;
				i++;
				j++;
				p = i;
				q = j;
			}

		}
		sum1 = sum_array(arr1, p, arr1.length - 1);
		sum2 = sum_array(arr2, q, arr2.length - 1);
		ans = (ans + (Math.max(sum2, sum1)) % mod) % mod;
		return (int) (ans);
	}

	public static long sum_array(int[] arr, int i, int j) {
		long sum = 0;
		for (int k = i; k <= j; k++) {
			sum += arr[k];
		}
		return sum;
	}
}
