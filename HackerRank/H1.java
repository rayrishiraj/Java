package HackerRank;
import java.util.*;
public class H1 {

    static boolean isValidArrangement(int[] a, int[] b) {
        int n = a.length;
        int[] merged1 = new int[2 * n];
        int[] merged2 = new int[2 * n];
        for (int i = 0; i < n; i++) {
            merged1[2 * i] = a[i];
            merged1[2 * i + 1] = b[i];
        }
        for (int i = 0; i < n; i++) {
            merged2[2 * i] = b[i];
            merged2[2 * i + 1] = a[i];
        }

        return isNonDecreasing(merged1) || isNonDecreasing(merged2);
    }

    static boolean isNonDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // number of boys and girls

            int[] boys = new int[n];
            int[] girls = new int[n];

            for (int i = 0; i < n; i++)
                boys[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                girls[i] = sc.nextInt();

            Arrays.sort(boys);
            Arrays.sort(girls);

            if (isValidArrangement(boys, girls))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

