package Lec13;

import java.util.Scanner;

public class Playing_with_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(GoodString(s));
	}

	public static int GoodString(String s) {
		int ans = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (isvowels(ch) == true) {
				count++;
			} else {
				ans = Math.max(ans, count);
				count = 0;
			}

		}
		ans = Math.max(ans, count);
		return ans;
	}

	public static boolean isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}
