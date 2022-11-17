//declaring package
package com.ques1;

//importing packages
import java.util.Scanner;

//declaring class
public class Hangman {
	
	//main started
	public static void main(String args[])
	{
		String arr[] = new String[]{"ARJUN","AJIT", "KAUSHIK", "PRADEEP", "SONU"};
		System.out.println("-----------WELCOME TO HANGMAN GAME----------");
		System.out.println("Select an array Index to choose words: ");
		System.out.println("Array Index should not be greater than 5");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = arr[n].length();
		System.out.println("Input your guessing: ");
		for(int i=0; i<len; i++)
		{
			System.out.print("_ ");
		}
		System.out.println();
		
		String a = sc.next().toUpperCase();
		if(a == arr[n])
		{
			System.out.println("Your Guess was correct");
		}
		else
		{
			System.out.println("You loose");
		}
		sc.close();
		
	}//end of main

}//end of class
