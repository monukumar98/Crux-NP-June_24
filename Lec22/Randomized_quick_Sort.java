package Lec22;

import java.util.Random;

public class Randomized_quick_Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 3, 2, 4, 1 };
		Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int idx = Partition(arr, si, ei);
		Sort(arr, si, idx - 1);
		Sort(arr, idx + 1, ei);

	}

	public static int Partition(int[] arr, int si, int ei) {
// randon index ki swaping last se krenge
		Random rn = new Random();
		int ii= rn.nextInt(ei-si)+si;
		int t =arr[ei];
		arr[ei]=arr[ii];
		arr[ii]=t;
		int item = arr[ei];// sahi krna hai
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] < item) {
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
				idx++;
			}
		}
		int temp = arr[idx];
		arr[idx] = arr[ei];
		arr[ei] = temp;
		return idx;

	}
}
