package Lec34;

public class LinkedList<T> {

	class Node {
		T val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addFirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;

		}

	}

	// O(1)
	public void addLast(T item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	public void addatindex(T item, int k) {
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	// O(1)
	public T getfirst() {
		return head.val;
	}

	// O(1)
	public T getlast() {
		return tail.val;
	}

	// O(1)
	public T getatIndex(int k) {
		return getNode(k).val;
	}

	// O(N)
	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	// O(1)
	public T removeFirst() {
		T v = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node n = head;
			head = head.next;
			n.next = null;
			size--;

		}
		return v;
	}

	//
	public T removeLast() {
		if (size == 1) {
			return removeFirst();
		} else {
			Node prev = getNode(size - 2);
			T v = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return v;
		}
	}

	public T removeatindex(int k) {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {
			Node prev = getNode(k - 1);
			Node curr = getNode(k);
			prev.next = curr.next;
			size--;
			return curr.val;
		}

	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("Raj");
		ll.addLast("Rajesh");
		ll.addLast("Kaju");
		ll.addLast("ankita");
		ll.addLast("ankit");
		ll.Display();
	}
}














