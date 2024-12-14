package Lec42;

import java.util.*;

public class Trie {

	class Node {
		char ch;
		HashMap<Character, Node> chlid = new HashMap<>();
		boolean isterminal = false;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
		}
	}

	private Node root;

	public Trie() {
		root = new Node('*');
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				Node nn = new Node(ch);
				curr.chlid.put(ch, nn);
				curr = nn;
			}
		}
		curr.isterminal = true;

	}

	public boolean search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return false;
			}
		}
		return curr.isterminal;
	}

	public boolean startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return false;
			}
		}
		return true;
	}

}
