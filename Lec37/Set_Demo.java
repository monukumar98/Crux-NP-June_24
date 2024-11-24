package Lec37;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(21);
		set.add(19);
		set.add(19);
		set.add(56);
		set.add(-26);
		set.add(3);
		set.add(-13);
		System.out.println(set);
//		System.out.println(set.contains(19));
//		System.out.println(set.remove(3));
//		System.out.println(set.remove(30));
//		System.out.println(set);
//		System.out.println(set.size());
//		for(int v:set) {
//			System.out.print(v+" ");
//		}
//		System.out.println();
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(21);
		set1.add(19);
		set1.add(19);
		set1.add(56);
		set1.add(-26);
		set1.add(3);
		set1.add(-13);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(1);
		set2.add(21);
		set2.add(19);
		set2.add(19);
		set2.add(56);
		set2.add(-26);
		set2.add(3);
		set2.add(-13);
		System.out.println(set2);

	}

}
