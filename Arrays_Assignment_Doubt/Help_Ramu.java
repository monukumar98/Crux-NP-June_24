package Arrays_Assignment_Doubt;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();// number of rickshaw
			int m = sc.nextInt();// number of cab
			int[] ride_rickshaws = new int[n];
			for (int i = 0; i < ride_rickshaws.length; i++) {
				ride_rickshaws[i] = sc.nextInt();
			}
			int[] ride_cab = new int[m];
			for (int i = 0; i < ride_cab.length; i++) {
				ride_cab[i] = sc.nextInt();
			}
			int Cost_rickshaw = 0;
			for (int i = 0; i < ride_rickshaws.length; i++) {
				Cost_rickshaw += Math.min(ride_rickshaws[i] * c1, c2);
			}
			Cost_rickshaw = Math.min(Cost_rickshaw, c3);
			int Cost_cab = 0;
			for (int i = 0; i < ride_cab.length; i++) {
				Cost_cab += Math.min(ride_cab[i] * c1, c2);
			}
			Cost_cab = Math.min(Cost_cab, c3);
			int ans = Math.min(Cost_rickshaw + Cost_cab, c4);
			System.out.println(ans);
			t--;
		}
	}

}
