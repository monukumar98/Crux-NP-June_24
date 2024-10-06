package Lec27;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 7));
		System.out.println(add(2, 9.0));
		System.out.println(add(2, 9, 11));
		System.out.println(add(2, 3, 2, 21, 1, 7, 1, 1, 3, 1, 2, 5, 2));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, double b) {
		return (int) (a + b);
	}

	public static int add(int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}








