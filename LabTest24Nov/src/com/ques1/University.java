//declaring package
package com.ques1;

//importing packages
import java.util.*;


interface Student
		{
			void studentDetails();	
		}
interface Employee{
	void employeeDetails();	
	}

//declaring class
 class University implements Student,Employee {
		
		public void employeeDetails() {
			Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the employee name");
		   String name=sc.next();
		   System.out.println("Enter the employee department");
		   String department=sc.next();
		   System.out.println("Enter the employee id");
		   int eId=sc.nextInt();
		   System.out.println("Enter the employee salary");
		   double Salary=sc.nextDouble();
		   System.out.println("Employee name: "+name);
		   System.out.println("Employee department: "+department);
		   System.out.println("Employee id: "+eId);
		   System.out.println("Employee salary: "+Salary);
		   sc.close();
		}

		
		public void studentDetails() {
			Scanner sc=new Scanner(System.in);
			   System.out.println("Enter the student name");
			   String name=sc.next();
			   System.out.println("Enter the Student course");
			   String course=sc.next();
			   System.out.println("Enter the Student id");
			   int sId=sc.nextInt();
			   System.out.println("Enter the student age");
			   int age=sc.nextInt();
			   System.out.println("Student name: "+name);
			   System.out.println("Student course: "+course);
			   System.out.println("Student id: "+sId);
			   System.out.println("Student age: "+age);
			   sc.close();
			
		}
		
		//main Started
		public static void main(String[] args) {
			University un=new University();
			Scanner sc=new Scanner(System.in);
        	System.out.println("Enter st for student and em for Employee");
        	char ch=sc.next().charAt(0);
        	if(ch=='s') {
        		un.studentDetails();
        	}
        	else
        		un.employeeDetails();
        	sc.close();
	}//end of main
}//end of class