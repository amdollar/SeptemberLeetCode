package test.challange.Week2;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		String s = "Test1ng-Leet=code-Q!";
		String output = reverseOnlyLetters(s);
		System.out.println(output);
	}

	public static String reverseOnlyLetters(String s) {
		int left = 0;
		int right = s.length() - 1;
		char[] charArr = s.toCharArray();

		while (left < right) {
			if (Character.isLetter(charArr[left]) && Character.isLetter(charArr[right])) {
				// reverse the letters;
				char temp = charArr[right];
				charArr[right] = charArr[left];
				charArr[left] = temp;
				left++;
				right--;
			} else if (Character.isLetter(charArr[left]) && !Character.isLetter(charArr[right])) {
				right--;
			} else {
				left++;
			}
		}
		return String.valueOf(charArr);
	}

}
