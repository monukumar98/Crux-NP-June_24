package Lec19;

public class Key_Paid {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		print(ques, "");

	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String press = key[ch - 48];// key[ch-'0'];
		for (int i = 0; i < press.length(); i++) {
			print(ques.substring(1), ans + press.charAt(i));
		}

	}
}
