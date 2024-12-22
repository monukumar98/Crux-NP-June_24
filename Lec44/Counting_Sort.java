package Lec44;

import java.util.Arrays;

public class Counting_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
		System.out.println(Arrays.toString(Sort(arr)));
	}

	public static int[] Sort(int[] arr) {
		int key = Arrays.stream(arr).max().getAsInt();
		int[] freq = new int[key + 1];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;// freq[arr[i]]= freq[arr[i]]+1;
		}
		for (int i = 1; i < freq.length; i++) {
			freq[i] = freq[i - 1] + freq[i];
		}
		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			int x = arr[i];// 9
			int c = freq[x];// 17
			ans[c - 1] = x;
			freq[x]--;
		}
		return ans;
	}
}
