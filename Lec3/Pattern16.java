package Lec3;
import java.util.*;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int space = n - 1;
		int row = 1;
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star

			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// Mirror
			if (row < n) {
				space--;
				star--;
			} else {
				space++;
				star++;
			}
			// nexr Row
			System.out.println();
			row++;
		}

	}

}
