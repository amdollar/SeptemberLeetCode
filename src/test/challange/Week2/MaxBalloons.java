package test.challange.Week2;

import java.util.HashMap;
import java.util.Map;

public class MaxBalloons {

	public static void main(String[] args) {
		String random = new String("nlaebolko");
		int count = maxNumberOfBalloons(random);
		System.out.println(count);
	}

	public static int maxNumberOfBalloons(String text) {
		int bCount = 0, aCount = 0, lCount = 0, oCount = 0, nCount = 0;

		// Count the frequencey of all the five characters
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'b') {
				bCount++;
			} else if (text.charAt(i) == 'a') {
				aCount++;
			} else if (text.charAt(i) == 'l') {
				lCount++;
			} else if (text.charAt(i) == 'o') {
				oCount++;
			} else if (text.charAt(i) == 'n') {
				nCount++;
			}
		}

		// Find the potential of each character.
		// Except for 'l' and 'o' the potential is equal to the frequency.
		lCount = lCount / 2;
		oCount = oCount / 2;

		// Find the bottleneck.
		return Math.min(bCount, Math.min(aCount, Math.min(lCount, Math.min(oCount, nCount))));
	}

}
