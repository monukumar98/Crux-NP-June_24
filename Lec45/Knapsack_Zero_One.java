package Lec45;

public class Knapsack_Zero_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 4;
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] value = { 8, 4, 0, 5, 3 };
		System.out.println(Knapsack(wt, value, cap, 0));

	}

	public static int Knapsack(int[] wt, int[] value, int cap, int i) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (cap >= wt[i]) {
			inc = value[i] + Knapsack(wt, value, cap - wt[i], i + 1);
		}
		exc = Knapsack(wt, value, cap, i + 1);
		return Math.max(inc, exc);
	}

}
