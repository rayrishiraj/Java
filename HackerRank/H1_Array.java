package HackerRank;

import java.util.Arrays;

public class H1_Array {
	public static void main(String[] args) {
		int[] num1 = { 4, 9, 5 };
		int[] num2 = { 9, 4, 9, 8, 4 };
		int[] result = intersect(num1, num2);

		System.out.println(Arrays.toString(result));
	}
	public static int[] intersect(int[] num1, int[] num2) {
		int[] tempResult = new int[Math.min(num1.length, num2.length)];
		int index = 0;
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num1[i] == num2[j]) {
					tempResult[index] = num1[i];
					index++;
					//num2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}
		int[] result = new int[index];
		for (int i = 0; i < index; i++) {
			result[i] = tempResult[i];
		}
		return result;
	}
}
