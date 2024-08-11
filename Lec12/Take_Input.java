package Lec12;

import java.util.Scanner;

public class Take_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// row
		int m = sc.nextInt();// col
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {// row
			for (int j = 0; j < arr[0].length; j++) {// col
				arr[i][j] = sc.nextInt();

			}
		}
		Display(arr);

	}

	public static void Display(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {// row
			for (int j = 0; j < arr[0].length; j++) {// col
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

}
