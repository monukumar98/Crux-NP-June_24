package Lec6;

import java.util.Scanner;

public class Inverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Inverse(n));
	}

	public static int Inverse(int n) {
		int sum = 0;
		int pos = 1;
		while (n > 0) {
			int rem = n % 10;
			// sum = (int) (sum + pos * Math.pow(10, rem - 1));
			sum += pos * Math.pow(10, rem - 1);//sum= (int) (sum + pos * Math.pow(10, rem - 1));
			pos++;
			n = n / 10;
		}
		return sum;
	}

}
