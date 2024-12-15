package Lec43;

public class Check_ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i = 3;
		System.out.println(isSet(n, i));

	}

	public static boolean isSet(int n, int i) {
		int mask = (1<<i);
		if((n&mask)!=0) {
			return true;
		}
		else {
			return false;
		}
	}
}
