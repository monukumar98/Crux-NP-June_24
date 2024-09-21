package Lec22;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 3, 4, 1 };
		int[] a = Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static int[] Sort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] b = new int[1];
			b[0] = arr[lo];
			return b;
		}
		int mid = (lo + hi) / 2;
		int[] fs = Sort(arr, lo, mid);
		int[] ss = Sort(arr, mid + 1, hi);
		return Merge(fs, ss);

	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}
}
