package Lec43;

public class Print_SubSequnce_Using_Bitmasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		Print(str);

	}

	public static void Print(String str) {
		// TODO Auto-generated method stub
		int n = str.length();
		for (int i = 0; i < (1 << n); i++) {
			pattern(str, i);

		}

	}

	public static void pattern(String str, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			i = i >> 1;
			pos++;
		}
		System.out.println();
	}

}





