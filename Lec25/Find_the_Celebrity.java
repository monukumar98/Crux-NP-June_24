package Lec25;

import java.util.*;

public class Find_the_Celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		System.out.println(Celebrity(arr));
	}

	private static int Celebrity(int[][] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 1) {
				st.push(b);
			} else {
				st.push(a);
			}
		}
		int candidate = st.pop();// 2
		for (int i = 0; i < arr[0].length; i++) {
			if (i == candidate) {
				continue;
			}
			if (arr[candidate][i] == 1 || arr[i][candidate] == 0) {
				return -1;
			}
		}
		return candidate;

	}

}
