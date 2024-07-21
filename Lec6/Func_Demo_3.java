package Lec6;

public class Func_Demo_3 {
	static int val = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 9;
		int b = 7;
//		int ans = Add(a, b);
//		System.out.println(ans);
		System.out.println(val);
		System.out.println(Add(a, b));
		System.out.println("bye");
		System.out.println(val);

	}

	public static int Add(int a, int b) {
		int c = a + b;
		int val=60;
		Func_Demo_3.val = Func_Demo_3.val - 5;
		return c + sub(c, b);
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
