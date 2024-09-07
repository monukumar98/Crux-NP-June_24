package Lec19;

import java.util.ArrayList;
import java.util.List;

public class Two_2D_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll = new ArrayList<>();
		System.out.println(ll);
		ll.add(new ArrayList<>());
		ll.add(new ArrayList<>());
		ll.add(new ArrayList<>());
		ll.get(1).add(10);
		ll.get(1).add(20);
		ll.get(1).add(30);
		System.out.println(ll);
		System.out.println(ll.get(1).get(2));
		System.out.println(ll.size());
		System.out.println(ll.get(0).size());
		System.out.println(ll.get(1).size());
		System.out.println(ll.get(2).size());

	}

}
