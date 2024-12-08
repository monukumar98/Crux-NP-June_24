package Lec41;

import java.util.*;

public class Topological_Sort {

	HashMap<Integer, List<Integer>> map;

	public Topological_Sort(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 0; i < v; i++) {
			map.put(i, new ArrayList<>());
		}
	}

	public void AddEdge(int v1, int v2) {
		map.get(v1).add(v2);

	}

	public int[] indgree() {
		int[] in = new int[map.size()];
		for (int v1 : map.keySet()) {
			for (int nbrs : map.get(v1)) {
				in[nbrs]++;// in[nbrs] = in[nbrs] +1;
			}
		}
		return in;
	}

	public void topological() {
		int[] in = indgree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int r = q.poll();
			System.out.print(r + " ");
			for (int nbrs : map.get(r)) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		System.out.println();
	}

	public boolean Iscycle() {
		int[] in = indgree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int c = 0;
		while (!q.isEmpty()) {
			int r = q.poll();
			c++;
			for (int nbrs : map.get(r)) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		return c != map.size();
	}

	public static void main(String[] args) {
		Topological_Sort ts = new Topological_Sort(8);
		ts.AddEdge(1, 2);
		ts.AddEdge(1, 0);
		ts.AddEdge(1, 4);
		ts.AddEdge(4, 3);
		ts.AddEdge(3, 2);
		ts.AddEdge(4, 5);
		ts.AddEdge(5, 7);
		ts.AddEdge(6, 3);
		ts.AddEdge(6, 7);
		ts.topological();
		System.out.println(ts.Iscycle());
	}

}
