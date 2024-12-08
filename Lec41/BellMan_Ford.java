package Lec41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellMan_Ford {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellMan_Ford(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);

	}

	public List<EdgePair> getallEdge() {
		List<EdgePair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1, e2, cost));
			}
		}
		return ll;
	}

	public void BellManford() {
		List<EdgePair> ll = getallEdge();
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 8798797;
		}
		for (int i = 1; i <= v; i++) {
			for (EdgePair e : ll) {

				if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("-ve wt ka Cycle hai ");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}

			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
	}

	class EdgePair {
		int e1;
		int e2;
		int cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.cost = cost;
			this.e1 = e1;
			this.e2 = e2;
		}
	}

}
