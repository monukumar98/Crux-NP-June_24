package Lec17;

public class Permutation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		String ans = "";
		Print(ques, ans);

	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (!Ispresent(ques, ch, i + 1)) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				Print(s1 + s2, ans + ch);
			}

		}
	}

	public static boolean Ispresent(String str, char ch, int i) {
		for (; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return true;
			}
		}
		return false;

	}

}
