package com.ques1;

public class Member {

	String name;

	int age;

	long phone;

	String address;

	float salary;

	void printSalary()

	{

		System.out.println("SALARY OF " + name + ": Rs. " + salary);

	}

}

class Employee extends Member

{

	String specialization;

}

class Manager extends Member

{

	String department;

}

class Main

{

	public static void main(String[] args)

	{

		System.out.println("---WELCOME TO OUR CITY ZOO---");

		Employee e1 = new Employee();

		e1.name = "Jhon Sinha";

		e1.age = 25;

		e1.phone = 83534123;

		e1.address = "Chennai";

		e1.salary = 456.87f;

		e1.specialization = "Tour Guide";

		System.out.println("EMPLOYEE DETAILS:");

		e1.printSalary();

		Manager m1 = new Manager();

		m1.name = "Willson Smith";

		m1.age = 23;

		m1.phone = 965341123;

		m1.address = "Puducherry";

		m1.salary = 5568.54f;

		m1.department = "Accounts";

		System.out.println("MANAGER DETAILS:");

		m1.printSalary();

	}

}
