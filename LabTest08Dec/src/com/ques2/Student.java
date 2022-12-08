package com.ques2;

import java.util.*;

public class Student {
  
  //declaring instance variable
  private int id;
  private String name;
  
  //constructor to set id and name
  public Student(int id,String name){
    this.id = id;
    this.name = name;
  }
  
  //getter methods to get student id and name
  public int getId(){
    return this.id;
  }
  
  public String getName(){
    return this.name;
  }
  
  //main method
  public static void main(String[] args) {
    //creating list of student objects
    List<Student> studentList = new ArrayList<>();
    //adding student objects
    studentList.add(new Student(1,"John"));
    studentList.add(new Student(2,"Alex"));
    studentList.add(new Student(3,"Dave"));
    studentList.add(new Student(4,"Martin"));
    
    //input student id
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student id :");
    int id = sc.nextInt();
    
    //search student by id
    for(Student student : studentList){
      if(student.getId() == id){
        System.out.println("Student name : "+student.getName());
        break;
      }
    }
  }
  
}
