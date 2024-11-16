package Lec34;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 2, 3, 5, 6 };
		Display(arr);
		String[] arr1 = { "raj", "rajesh", "Ankita", "Kaju" };
		Display(arr1);
		System.out.println(get(arr));
		System.out.println(get(arr1));

	}

	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static <T> T get(T[] arr) {
		return arr[0];
	}
}
