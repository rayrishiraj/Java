package InsertionSort;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println(" ----- INSERTION SORT ----- ");
		
		int[] arr = { 5, 2, 9, 1, 5, 6 };
		
		System.out.print("Given sorted Array: ");
		System.out.print(Arrays.toString(arr));
		
		System.out.println();
		insertionSort(arr);

		System.out.print("Sorted Array: ");
		System.out.print(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = key;
		}
	}
}
