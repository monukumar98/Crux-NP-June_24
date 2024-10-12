package Lec28;

public class LinkedList {

	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addFirst(int item) {
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
	public void addLast(int item) {
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

	public void addatindex(int item, int k) {
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
	public int getfirst() {
		return head.val;
	}

	// O(1)
	public int getlast() {
		return tail.val;
	}

	// O(1)
	public int getatIndex(int k) {
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

	public int removeFirst() {
		int v = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		}
		else {
			Node n=head;
			head=head.next;
			n=null;
			size--;
			
		}
		return v;
	}
}















