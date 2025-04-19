package StringClass;

public class StringPalindrome {
	public static boolean isPalindrome(String str) {
		int left = 0;
	    int right = str.length() - 1;

	    while (left < right) {
	        if (str.charAt(left) != str.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }

	    return true; 
	}
public static void main(String[] args) {
	String s = "Madam";
	s = s.toLowerCase();
	if(isPalindrome(s)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
