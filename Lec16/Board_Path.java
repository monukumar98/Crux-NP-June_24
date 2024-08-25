package Lec16;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(PrintPath(0, n, ""));

	}

	public static int PrintPath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int c = 0;
		for (int dice = 1; dice <= 3; dice++) {
			c += PrintPath(curr + dice, end, ans + dice);
		}
		return c;
//		PrintPath(curr + 1, end, ans + 1);
//		PrintPath(curr + 2, end, ans + 2);
//		PrintPath(curr + 3, end, ans + 3);

	}
}
