package Lec36;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		System.out.println(Largest_Element(arr, k));
	}

	public static int Largest_Element(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (pq.peek() < arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();

	}
}
