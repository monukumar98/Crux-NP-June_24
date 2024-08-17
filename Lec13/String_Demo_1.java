package Lec13;

public class String_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";//1
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		s1 = s1 + "Bye";
		s1 = s1 + s3;
		s1 = s1.concat(s3);//s1 + s3;
		String s5 = "Hey" + "Bye";//2
		System.out.println(s1.length());
//		System.out.println(s1.hashCode());
//		System.out.println(s3.hashCode());
		System.out.println(s5);
		System.out.println(s5.charAt(2));
		

	}

}
