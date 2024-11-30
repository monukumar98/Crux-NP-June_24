package Lec38;

public class Stringbuilder_vs_String {
	public static void main(String[] args) {
		//String_pow();
		Stringbulider_pow();

	}

	public static void String_pow() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + i;
		}

	}

	public static void Stringbulider_pow() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}

	}
}
