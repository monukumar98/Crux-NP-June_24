package Lec13;

public class Print_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		Print(s);
	}

	public static void Print(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}
}
