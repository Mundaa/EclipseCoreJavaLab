package com.ques2;

class ParentClass{
	  public void print(){
	    System.out.println("This is parent class");
	  }
	}

	class ChildClass extends ParentClass{
	  public void print(){
	    System.out.println("This is child class");
	  }
	}

	public class ParentChild{
	  public static void main(String[] args){
	    ParentClass obj1 = new ParentClass();
	    obj1.print();
	    
	    ChildClass obj2 = new ChildClass();
	    obj2.print();
	  
	  }
	}