//declaring package
package com.ques4;

//importing packages
import java.util.*;

//declaring class
public class Calculator {
private double a,b,sum,subs,multi,div;//declaring variables
  
//get method
  void get()
  {  
	  try //
	  {
		  Scanner sc = new Scanner(System.in);//creating scanner object
		  System.out.println("Enter two numbers");
		  a = sc.nextInt();//creating variables
		  b = sc.nextInt();//creating variables
		  sum = a + b;//operation to perform sum
		  subs = a - b;//operation to perform substraction
		  multi = a * b;//operation to perform multiplcation
		  div = a / b;//operation to perform division
		  System.out.println("sum of two no. : "+sum);//to print sum
		  System.out.println("substraction of two no. : "+subs);//to print substraction
		  System.out.println("multiplication of two no. : "+multi);//to print multiplication
		  System.out.println("division of two no. : "+div);//to print division
	  }
	  
	  catch( ArithmeticException | InputMismatchException e)
	  {
		  System.out.println(e.getMessage());
	  }
	 
  }//end of method
  
  //main started
  public static void main (String args[])
  {
	  Calculator i = new Calculator();//creating calculator object
	  i.get();
  }//end of main  
	  
}//end of class
