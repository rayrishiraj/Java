package StringClass;

import java.util.Arrays;

public class HackerRank {
    public static int[] newSumedArray(int arr[], int n) {
        int[] newArr = new int[n]; 
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];       
            newArr[i] = sum;      
        }
        return newArr;  
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7}; 
        int n = arr.length;
        System.out.println("Array: " + Arrays.toString(arr));
        int[] newArr = newSumedArray(arr, n);
        System.out.println("Cummulative summed Array: " + Arrays.toString(newArr));
    }
}
