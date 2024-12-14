package Lec42;

import java.io.*;

import java.util.*;

public class Tries_Contacts {

	class Node {
		char ch;
		HashMap<Character, Node> chlid = new HashMap<>();
		boolean isterminal = false;
		int count = 1;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
		}
	}

	private Node root;

	public Tries_Contacts() {
		root = new Node('*');
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
				curr.count++;
			} else {
				Node nn = new Node(ch);
				curr.chlid.put(ch, nn);
				curr = nn;
			}
		}
		curr.isterminal = true;

	}

	public int startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Tries_Contacts t = new Tries_Contacts();
		for (int nItr = 0; nItr < n; nItr++) {
			String op = sc.next();
			String contact = sc.next();
			if (op.equals("add")) {
				t.insert(contact);
			} else {
				System.out.println(t.startsWith(contact));
			}

		}

	}
}
