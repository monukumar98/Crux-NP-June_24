package Lec14;

public class CB_Number {
	public static void main(String[] args) {
		String s = "81615";
		System.out.println(Count_Cb_Number(s));
	}

	public static int Count_Cb_Number(String s) {
		int count = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String str = s.substring(i, j);
				if (IsCbNumber(Long.parseLong(str)) && Is_visited(visited, i, j - 1)) {
					count++;

					for (int k = i; k <= j - 1; k++) {
						visited[k] = true;
					}
				}
			}
		}
		return count;
	}

	public static boolean Is_visited(boolean[] visited, int i, int j) {
		for (int k = i; k <= j; k++) {
			if (visited[k]) {
				return false;
			}
		}
		return true;

	}

	public static boolean IsCbNumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
