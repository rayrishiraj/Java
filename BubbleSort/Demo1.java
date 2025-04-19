package BubbleSort;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println(" ----- BUBBLE SORT ----- ");
		int[] arr = { 5, 2, 9, 1, 5, 6 };
		System.out.print("Given sorted Array: ");
		System.out.print(Arrays.toString(arr));

		bubbleSort(arr);
		System.out.println();

		System.out.print("Sorted Array: ");
		System.out.print(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}
}
