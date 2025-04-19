package LinearSearch;

public class Demo1 {
    
    public static String linearSearch(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {  
            for (int j = 0; j < arr[i].length; j++) {  
                if (arr[i][j] == target) {
                    return "Found at: (" + i + ", " + j + ")";  
                }
            }
        }
        return "Not found"; 
    }

    public static void main(String[] args) {
        int arr[][] = {
            {2, 4, 6},
            {7, 8, 9},
            {10, 12, 14}
        };
        int target = 9;  
        System.out.println(linearSearch(arr, target));  
    }
}
