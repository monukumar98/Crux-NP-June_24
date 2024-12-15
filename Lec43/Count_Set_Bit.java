package Lec43;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(CountSetBit(n));
		System.out.println(fastCountSetBit(n));
	}

	public static int CountSetBit(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n >>= 1;// n = n>> 1;
		}
		return count;
	}

	public static int fastCountSetBit(int n) {
		int count = 0;
		while (n > 0) {
			n = (n & (n - 1));
			count++;

		}
		return count;
	}

}








