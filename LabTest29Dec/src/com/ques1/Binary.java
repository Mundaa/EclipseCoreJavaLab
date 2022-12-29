package com.ques1;

import java.util.Scanner;

public class Binary {
	public class DecimalToBinary {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Input a Decimal Number: ");
			int num = input.nextInt();
			String binary = Integer.toBinaryString(num);
			System.out.println("Binary number is: " + binary);
		}
	}
}
