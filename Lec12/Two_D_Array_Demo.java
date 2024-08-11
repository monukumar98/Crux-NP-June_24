package Lec12;

public class Two_D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][2]);
		// row lenght
		System.out.println(arr.length);
		// col length
		System.out.println(arr[0].length);
		int[][] other = arr;
		int[][] arr1 = new int[3][];
		System.out.println(arr1);
		System.out.println(arr1[1]);
		//System.out.println(arr1[1][2]);

	}

}
