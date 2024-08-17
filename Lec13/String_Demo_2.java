package Lec13;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";// 1
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1 == s2);// Address compare krega
		System.out.println(s1 == s3);
		System.out.println(s4 == s3);
		System.out.println(s1.equals(s3));// content compare krega
	}

	public static boolean equals(String s1, String s2) {
		if (s1 == s2) {
			return true;
		}
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}



