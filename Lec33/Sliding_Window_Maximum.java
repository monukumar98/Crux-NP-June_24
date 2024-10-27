package Lec33;

import java.util.*;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

	}

	public static int[] Window_Maximum(int[] arr, int k) {
		int n = arr.length;
		int[] max_val = new int[n - k + 1];
		Deque<Integer> dq = new LinkedList<>();
		int j = 0;// max_val array me konse index pe data add krna hai
		// 1st window ka answer
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.add(i);
		}
		max_val[j++] = arr[dq.getFirst()];
		// 2nd steps
		for (int i = k; i < arr.length; i++) {
			// grow
			while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.add(i);
			// shrink
			if (!dq.isEmpty() && dq.getFirst() == i - k) {
				dq.remove();// remove first
			}
			// ans
			max_val[j++] = arr[dq.getFirst()];
		}
		return max_val;
	}
}
