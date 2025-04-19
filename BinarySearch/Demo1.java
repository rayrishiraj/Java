package BinarySearch;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int target = 7;

		int first = findFirst(arr, target);
		int last = findLast(arr, target);

		if (first == -1 || last == -1) {
			System.out.println("-1,-1");
		} else {
			System.out.println(first + "," + last);
		}
	}

	public static int findFirst(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				result = mid;
				high = mid - 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return result;
	}

	public static int findLast(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				result = mid;
				low = mid + 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return result;
	}
}