package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);
		ll.add(5);
		ll.add(3);
		ll.add(6);
		ll.add(78);
		ll.add(789);
		ll.add(56);
		ll.add(12);
		ll.add(67);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		int[] arr = { 19, 23, 56, 78, 90 };
		for (int v : ll) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : arr) {
			System.out.print(v + " ");
		}
	}

}
