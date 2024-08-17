package Lec13;

public class String_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello" + 10 + 20 + "Bye");
		System.out.println("Hello" + (10 + 20) + "Bye");
		System.out.println(10 + 20 + "Hello" + "Bye");
		String s = "codingblocks";
		System.out.println(s.substring(2, 6));// 2 to 5 index tk char milega
		System.out.println(s.substring(3));// 3 index se puri String dega

	}

}
