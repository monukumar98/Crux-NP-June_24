package Lec38;

public class Stringbuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();// 16
		System.out.println(sb.capacity());
		sb.append("jghjghhghkhj");
		sb.append('a');
		// sb.append(true);
		sb.append(1011);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.hashCode());
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.substring(1));
		System.out.println(sb.reverse());
		String s = sb.toString();// bulider to string
		StringBuilder sb1 = new StringBuilder(s);

	}

}
