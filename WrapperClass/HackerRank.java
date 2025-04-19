package WrapperClass;

public class HackerRank {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;  
        int eSum = (n * (n + 1)) / 2;
        int aSum = 0;
        for (int num : arr) {
            aSum += num;
        }
        return eSum - aSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 4, 5};
        System.out.println(findMissingNumber(arr));
    }
}
