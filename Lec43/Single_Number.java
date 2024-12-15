package Lec43;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 1, 2, 1, 2 };
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans= ans^nums[i];
		}
		System.out.println(ans);
	}

}
