package Lec45;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		System.out.println(Count_Subsequences(s, t, 0, 0));

	}

// s--> coin -->i
// t-->amount -->j	
	public static int Count_Subsequences(String s, String t, int i, int j) {
		if (j == t.length()) {// amount 0
			return 1;
		}
		if (i == s.length()) {// coin khatam
			return 0;
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Count_Subsequences(s, t, i + 1, j + 1);
		}
		exc = Count_Subsequences(s, t, i + 1, j);
		return inc + exc;
	}

}
