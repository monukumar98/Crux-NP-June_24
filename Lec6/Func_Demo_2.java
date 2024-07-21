package Lec6;

public class Func_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 9;
		int b = 7;
		Add(a, b);
		System.out.println("bye");

	}

	public static void Add(int a, int b) {
		int c = a + b;
		sub(c, a);
		System.out.println(c);
	}

	public static void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

}
