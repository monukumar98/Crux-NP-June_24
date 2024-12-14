package Lec42;

import java.util.*;

public class replace_Words {

	class Solution {
		public String replaceWords(List<String> dictionary, String sentence) {
			Trie t = new Trie();
			for (String s : dictionary) {
				t.insert(s);
			}
			String[] arr = sentence.split(" ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = t.reaplcedWord(arr[i]);
			}
			String ans = "";
			for (int i = 0; i < arr.length; i++) {
				ans += arr[i] + " ";
			}
			return ans.trim();

		}
	}

	class Trie {

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

		public String reaplcedWord(String word) {
			Node curr = root;
			String reaplce = "";
			for (int i = 0; i < word.length(); i++) {
				if (curr.isterminal) {
					return reaplce;
				}
				char ch = word.charAt(i);
				if (curr.chlid.containsKey(ch)) {
					curr = curr.chlid.get(ch);
					reaplce += ch;

				} else {
					return word;
				}
			}
			return reaplce;

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
	}
}
