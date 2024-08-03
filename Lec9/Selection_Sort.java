package Lec9;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, -1, 5, 7, 3, -2, 1 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
//		System.out.println(min_form_ith_index(arr, 2));
	}

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int mini = min_form_ith_index(arr, i);
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
	}

	public static int min_form_ith_index(int[] arr, int i) {
		int mini = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[mini]) {
				mini = j;
			}
		}
		return mini;
	}

}
