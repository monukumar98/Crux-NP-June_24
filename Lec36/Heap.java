package Lec36;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> ll = new ArrayList<>();

	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int pi, int ci) {
		int p = ll.get(pi);
		int c = ll.get(ci);
		ll.set(pi, c);
		ll.set(ci, p);

	}

	public void Display() {
		System.out.println(ll);
	}

	public int get() {
		return ll.get(0);
	}

	public int size() {
		return ll.size();
	}

	public int remove() {
		int v = ll.get(0);
		swap(0, ll.size() - 1);
		ll.remove(ll.size() - 1);
		downheapify(0);
		return v;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
			mini = lci;
		}
		if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}

}










