package com.ques4;

public class DuplicateChar {

	public static void main(String[] args) {
		String string = "Programming";

		int count;

		// Converts given string into character array
		char[] stringArray = string.toCharArray();

		System.out.println("Duplicate characters in a given string: ");

		// Counts each character present in the string
		for (int i = 0; i < stringArray.length; i++) {
			count = 1;
			for (int j = i + 1; j < stringArray.length; j++) {
				if (stringArray[i] == stringArray[j] && stringArray[i] != ' ') {
					count++;
					// Set stringArray[j] to 0 to avoid printing visited character
					stringArray[j] = '0';
				}
			}

			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && stringArray[i] != '0')
				System.out.println(stringArray[i]);
		}
	}

}
