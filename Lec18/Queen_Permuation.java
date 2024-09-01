package Lec18;

public class Queen_Permuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;// total queen
		Permuation(board, tq, 0, "");

	}

	public static void Permuation(boolean[] board, int tq, int qpsf, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;

		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Permuation(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
				board[i] = false;
			}
		}

	}

}
