package InsertionSort;

public class Demo2 {
	public class ArrayIntersection {
	    public static void main(String[] args) {
	        int[] num1 = {1, 2, 2, 1};
	        int[] num2 = {2, 2};

	        int[] result = intersect(num1, num2);

	        System.out.print("[");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i]);
	            if (i != result.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }

	    public static int[] intersect(int[] num1, int[] num2) {
	        int[] tempResult = new int[Math.min(num1.length, num2.length)];
	        int index = 0;

	        for (int i = 0; i < num1.length; i++) {
	            for (int j = 0; j < num2.length; j++) {
	                if (num1[i] == num2[j]) {
	                    tempResult[index] = num1[i];
	                    index++;
	                    num2[j] = -1; 
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
}
