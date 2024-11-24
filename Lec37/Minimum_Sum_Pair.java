package Lec37;

import java.util.PriorityQueue;

public class Minimum_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 4, 5, 2, 3 };
		System.out.println(Minimum_Sum(arr));

	}

	public static int Minimum_Sum(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int ans = 0;
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			ans = ans + a + b;
			pq.add(a + b);

		}
		return ans;
	}
}
