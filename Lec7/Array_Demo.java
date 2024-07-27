package Lec7;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
		int[] arr = new int[5];
		int arr1[] = new int[5];
		System.out.println(arr);
		System.out.println(arr[1]);//
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = -6;
		arr[3] = 11;
		arr[4] = 5;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr);
		System.out.println(arr.length);
		int[] other = arr;
		System.out.println(other[0]);

	}

}
