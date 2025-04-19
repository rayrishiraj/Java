package LinearSearch;

public class Demo2 {
    public static void main(String[] args) {
        //int arr[] = {12, 346, 2, 6, 7896};
        int arr[] = {555, 190, 482, 1771};
        int count = 0;
        for (int num : arr) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++; 
            }
        }

        System.out.println("Count of numbers with even digits: " + count);
    }
}
