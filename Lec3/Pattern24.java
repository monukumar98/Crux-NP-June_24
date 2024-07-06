package Lec3;

public class Pattern24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			int val=row;
			while (j <= star) {
				System.out.print(val+" ");
				j++;
			}
			// next row prep
			row++;
			System.out.println();
			space--;
			star += 2;
		}
	}
}
