package Lec25;

import java.util.Stack;

public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		System.out.println(Parentheses(s));
	}

	public static boolean Parentheses(String s) {
		Stack<Character> st = new Stack<>();
		// System.out.println(st.capacity());
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else {
				if (st.isEmpty()) {
					return false;
				} else if (ch == ')' && st.peek() != '(') {
					return false;
				} else if (ch == ']' && st.peek() != '[') {
					return false;
				} else if (ch == '}' && st.peek() != '{') {
					return false;
				}
				st.pop();

			}
		}
		return st.isEmpty();

	}
}
