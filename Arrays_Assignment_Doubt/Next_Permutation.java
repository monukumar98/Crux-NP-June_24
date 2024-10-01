package Arrays_Assignment_Doubt;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1 };
		Permutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Permutation(int[] arr) {
		// step number 1 p kya hoga
		int p = -1;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		// next Permutation possible hai {3,2,1};
		if (p == -1 ) {
			Reverse(arr, 0, arr.length - 1);
			return;
		}
		// step number 2 q kya hoga
		int q = -1;
		for (int i = arr.length - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
	

		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;

		// reverse krna tha p+1 se complete array
		Reverse(arr, p + 1, arr.length - 1);
	}

	public static void Reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
