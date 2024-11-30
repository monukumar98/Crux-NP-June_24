package Lec38;

import java.util.ArrayList;

public class HashMap<K, V> {
	class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> buckt = new ArrayList<>();
	private int size = 0;

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < n; i++) {
			buckt.add(null);
		}
	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public void put(K key, V value) {
		int idx = hashfun(key);
		Node nn = buckt.get(idx);
		while (nn != null) {
			if (nn.key.equals(key)) {
				nn.value = value;
				return;
			}
			nn = nn.next;
		}
		Node n = new Node();
		n.key = key;
		n.value = value;
		nn = buckt.get(idx);
		n.next = nn;
		buckt.set(idx, n);
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / buckt.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> new_buckt = new ArrayList<>();
		for (int i = 0; i < 2 * buckt.size(); i++) {
			new_buckt.add(null);
		}
		ArrayList<Node> temp = buckt;
		buckt = new_buckt;
		size = 0;
		for (Node t : temp) {
			while (t != null) {
				put(t.key, t.value);
				t = t.next;
			}
		}
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node t : buckt) {
			while (t != null) {
				s = s + t.key + "=" + t.value + ", ";
				t = t.next;
			}
		}
		return s + "}";

	}

	public boolean containsKey(K key) {
		int idx = hashfun(key);
		Node nn = buckt.get(idx);
		while (nn != null) {
			if (nn.key.equals(key)) {

				return true;
			}
			nn = nn.next;
		}
		return false;
	}

	public V get(K key) {
		int idx = hashfun(key);
		Node nn = buckt.get(idx);
		while (nn != null) {
			if (nn.key.equals(key)) {

				return nn.value;
			}
			nn = nn.next;
		}
		return null;
	}

	public V remove(K key) {
		int idx = hashfun(key);
		Node curr = buckt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			buckt.set(idx, curr.next);
		} else {
			prev.next = curr.next;
		}
		curr.next = null;
		size--;
		return curr.value;

	}

	public int hashfun(K key) {
		int idx = key.hashCode();
		idx = idx % buckt.size();
		if (idx < 0) {
			idx += buckt.size();
		}
		return idx;
	}

}
