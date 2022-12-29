package com.ques2;

public class Sum {

	public static void main(String[] args) {
		// declare the variable
		int myNumber = 123456;
		int sum = 0;

		// loop through the string and add the digits
		while (myNumber > 0) {
			int digit = myNumber % 10;
			sum += digit;
			myNumber /= 10;
		}

		// print the result
		System.out.println("The sum of the digits of the number is: " + sum);
	}
}
