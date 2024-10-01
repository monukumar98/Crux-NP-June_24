package Arrays_Assignment_Doubt;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int x = sc.nextInt();
			int[] b = new int[n];
			for (int i = 0; i < b.length; i++) {
				int idx = i - x;
				if (idx < 0) {
					idx += n;
				}
				b[i] = arr[i] + arr[idx];
			}
			arr = b;

		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum % (100000009));
	}

}
