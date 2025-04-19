package Exception;

public class AraysOutOfBoundException {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(arr[1]);

        try {
            //System.out.println(arr[6]);
            String str = null;
            System.out.println(str.length());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } 
        catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer exception: " + e.getMessage());
        }
        System.out.println(arr[4]);
    }
}
