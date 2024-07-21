package Lec6;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Is_Armstrong(n));

	}

	public static boolean Is_Armstrong(int n) {
		int c = Countofdigit(n);
		int sum = 0;
		int temp=n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, c));
			n = n / 10;
		}
		if (sum == temp) {
			return true;
		} else {
			return false;
		}

	}

	public static int Countofdigit(int n) {
		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;
	}

}
