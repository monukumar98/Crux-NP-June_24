package Lec5;

public class Bin_To_Dec {
public static void main(String[] args) {
	int n = 100111;
	int sum = 0;
	int mul = 1;// 10^0
	while (n > 0) {
		int rem = n % 10;
		sum = sum + rem * mul;
		n = n / 10;
		mul *= 2;// mul = mul*10;
	}
	System.out.println(sum);
}
}
