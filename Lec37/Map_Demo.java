package Lec37;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add O(1)
		map.put("Raj", 87);
		map.put("Ankit", 57);
		map.put("Kunal", 78);
		map.put("Amit", 89);
		map.put("Mohan", 75);
		map.put("Shiva", 56);
		map.put("Pooja", 78);
		map.put("Hardik", 58);
		map.put("Ankit", 67);
		map.put("Ankita", 67);
		// map.put(null, 77);
		System.out.println(map);
//		//get 
//		System.out.println(map.get("Ankitaa"));
//		System.out.println(map.get("Ankita"));
//		// remove
//		System.out.println(map.remove("Ankitaa"));
//		System.out.println(map.remove("Ankita"));
//		System.out.println(map);
//		//containsKey
//		System.out.println(map.containsKey("Anku"));
//		
//		System.out.println(map.containsKey("Kunal"));
//		System.out.println(map.size());
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add O(1)
		map1.put("Raj", 87);
		map1.put("Ankit", 57);
		map1.put("Kunal", 78);
		map1.put("Amit", 89);
		map1.put("Mohan", 75);
		map1.put("Shiva", 56);
		map1.put("Pooja", 78);
		map1.put("Hardik", 58);
		map1.put("Ankit", 67);
		map1.put("Ankita", 67);
		// map.put(null, 77);
		System.out.println(map1);

		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add O(1)
		map2.put("Raj", 87);
		map2.put("Ankit", 57);
		map2.put("Kunal", 78);
		map2.put("Amit", 89);
		map2.put("Mohan", 75);
		map2.put("Shiva", 56);
		map2.put("Pooja", 78);
		map2.put("Hardik", 58);
		map2.put("Ankit", 67);
		map2.put("Ankita", 67);
		map2.put(null, 77);
		System.out.println(map2);
//		Set<String> keyset = map.keySet();
//		System.out.println(keyset);
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		System.out.println();

	}

}









