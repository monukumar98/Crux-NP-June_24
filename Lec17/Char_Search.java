package Lec17;

public class Char_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcbvabavacf";
		System.out.println(Ispresent(s, 'c', 2));

	}

	public static boolean Ispresent(String str, char ch, int i) {
		for (; i < str.length(); i++) {
			if(str.charAt(i)==ch) {
				return true;
			}
		}
		return false;

	}

}
