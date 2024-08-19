package Lec14;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// size
		System.out.println(ll.size());
		System.out.println(ll);
		// add
		ll.add(10);
		ll.add(5);
		ll.add(20);
		System.out.println(ll);
		ll.add(1, 9);// index ka range 0 to size
		System.out.println(ll);
		// get
		System.out.println(ll.get(2));// index ka range 0 to size-1
		// remove
		System.out.println(ll.remove(1));// index ka range 0 to size-1
		System.out.println(ll);
		//update
		ll.set(1, -11);
		System.out.println(ll);
	}

}






