package Lec43;

public class magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(nthnumber(n));

	}

	public static int nthnumber(int n) {
		int mul = 5;
		int sum = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				sum += mul;
			}
			n >>= 1;
			mul = mul * 5;
		}
		return sum;
	}

}
