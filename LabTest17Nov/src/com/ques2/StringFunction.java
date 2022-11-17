//declaring package
package com.ques2;

//importing packages
import java.util.Scanner;

//declaring class
public class StringFunction {
	    
		//main started
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);//creating scanner object
			System.out.println("Enter String");
			String s = sc.next();//creating string variables
			System.out.println(s.toUpperCase());//to print uppercase    
			System.out.println(s.toLowerCase());//to print lowercase
			System.out.println(s.charAt(2)); //to print charcter at 0
			System.out.println(s.trim());//to trim the stats and end  space
			System.out.println(s.length());//to find the length
			
		}//end of main

	}//end of class
