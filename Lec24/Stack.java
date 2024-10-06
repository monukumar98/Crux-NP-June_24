package Lec24;

public class Stack {
	protected int[] arr;
	private int idx = -1;

	public Stack(int n) {
		arr = new int[n];
	}

	public Stack() {
		arr = new int[5];
	}

	public boolean isEmpty() {
		return idx == -1;
	}

	public boolean isfull() {
		return size() == arr.length;
	}

	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol Stack full hogya hai ");
		}
		idx++;
		arr[idx] = item;
	}

	public int size() {
		return idx + 1;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Stack Empty  hai ");
		}
		return arr[idx];
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Stack Empty  hai ");
		}
		int v = arr[idx];
		idx--;
		return v;
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
