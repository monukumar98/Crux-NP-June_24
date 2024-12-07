package Lec40;

import java.util.*;

public class Prims_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public int prims() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		int sum = 0;
		while (!pq.isEmpty()) {
			PrimsPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			sum += rp.cost;
			for (int nbrs : map.get(rp.vtx).keySet()) {
				int cost = map.get(rp.vtx).get(nbrs);
				if (!visited.contains(nbrs)) {
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}
			}
		}
		return sum;
	}

	class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.acqvtx = acqvtx;
			this.cost = cost;
			this.vtx = vtx;
		}

		@Override
		public String toString() {
			return vtx + " " + acqvtx + " @ " + cost;
		}

	}

	public static void main(String[] args) {
		Prims_Algorithm pa = new Prims_Algorithm(7);
		pa.AddEdge(1, 2, 2);
		pa.AddEdge(2, 3, 3);
		pa.AddEdge(1, 4, 10);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 1);
		pa.AddEdge(5, 6, 5);
		pa.AddEdge(5, 7, 6);
		pa.AddEdge(6, 7, 4);
		System.out.println(pa.prims());
	}

}
