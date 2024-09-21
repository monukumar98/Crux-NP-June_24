package Lec21;

public class Partition_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		int idx = Partition(arr, 0, arr.length - 1);
		System.out.println(idx);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int Partition(int[] arr, int si, int ei) {

		int item = arr[ei];//sahi krna hai 
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] < item) {
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
				idx++;
			}
		}
		int temp = arr[idx];
		arr[idx] = arr[ei];
		arr[ei] = temp;
		return idx;

	}
}
