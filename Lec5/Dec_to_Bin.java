package Lec5;

public class Dec_to_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 39;
		int sum = 0;
		int mul = 1;// 10^0
		while (n > 0) {
			int rem = n % 2;
			sum = sum + rem * mul;
			n = n / 2;
			mul *= 10;// mul = mul*10;
		}
		System.out.println(sum);
	}

}
