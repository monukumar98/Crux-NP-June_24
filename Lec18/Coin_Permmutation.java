package Lec18;

public class Coin_Permmutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = { 1, 2, 3 };
		int amount = 4;
		Permmutation(coin, amount, "");

	}

	public static void Permmutation(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				Permmutation(coin, amount - coin[i], ans + coin[i]);
			}
		}

	}

}
