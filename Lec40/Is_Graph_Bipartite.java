package Lec40;

import java.util.*;

public class Is_Graph_Bipartite {
	class Solution {
		public boolean isBipartite(int[][] graph) {
			// bft
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int i = 0; i < graph.length; i++) {
				if (visited.containsKey(i)) {
					continue;
				}
				q.add(new BipartitePair(i, 0));

				while (!q.isEmpty()) {
					// remove
					BipartitePair rp = q.poll();

					// ignore
					if (visited.containsKey(rp.vtx)) {
						if (visited.get(rp.vtx) != rp.dis) {
							return false;
						}
						continue;
					}

					// visited
					visited.put(rp.vtx, rp.dis);

					// self work

					// add unvisited nbrs
					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rp.dis + 1));
						}
					}
				}
			}
			return true;
		}
	}

	class BipartitePair {
		int vtx, dis;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.dis = dis;
		}
	}

}
