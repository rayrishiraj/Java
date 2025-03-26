package Inheritance;

public class countSubStringPalindrome {
	static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
				i++;
				j--;
		}
		return true;
	}


	static int countPalindromeSubstring(String s) {
		int n = s.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i ; j < n; j++) {
				if (isPalindrome(s, i, j)) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String text = "aabbdddd";
		System.out.println(countPalindromeSubstring(text));
	}
}
