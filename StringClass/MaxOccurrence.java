package StringClass;

public class MaxOccurrence {

	public static char maxOccurrenceChar(String str) {
		int maxCount = 0;
		char maxChar = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				maxChar = str.charAt(i);
			}
		}

		return maxChar;
	}

	public static void main(String[] args) {
		String s = "Rishiraj";
		char result = maxOccurrenceChar(s);
		System.out.println("Character with maximum occurrences: " + result);
	}
}
