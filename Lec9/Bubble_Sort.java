package Lec9;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 3, 2, 1 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		for (int trun = 1; trun < arr.length; trun++) {
			for (int i = 0; i <arr.length-trun ; i++) {
	           if(arr[i]>arr[i+1]) {
	          	int temp =arr[i];
	            arr[i]=arr[i+1];
		         arr[i+1]=temp;
	       }
          }
		}
	}
}
