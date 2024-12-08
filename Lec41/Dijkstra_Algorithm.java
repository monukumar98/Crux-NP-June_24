package Lec41;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;



public class Dijkstra_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algorithm(int v) {
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

	public void Dijkstra() {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {
			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(1, "1", 0));

		while (!pq.isEmpty()) {
			DijkstraPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);

			for (int nbrs : map.get(rp.vtx).keySet()) {
				int cost = map.get(rp.vtx).get(nbrs);
				if (!visited.contains(nbrs)) {
					pq.add(new DijkstraPair(nbrs, rp.acqpath + nbrs, rp.cost + cost));
				}
			}
		}

	}

	class DijkstraPair {
		int vtx;
		String acqpath;
		int cost;

		public DijkstraPair(int vtx, String acqpath, int cost) {
			// TODO Auto-generated constructor stub
			this.acqpath = acqpath;
			this.cost = cost;
			this.vtx = vtx;
		}

		@Override
		public String toString() {
			return vtx + " " + acqpath + " @ " + cost;
		}

	}
}
