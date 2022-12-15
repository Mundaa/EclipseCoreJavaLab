package com.ques1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File{

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product ID:");
        String id = sc.next();
        System.out.println("Enter the product name:");
        String name = sc.next();
        System.out.println("Enter the product price:");
        String price = sc.next();
        String result = id + "," + name + "," + price;
        try {
        	FileWriter writer = new FileWriter("D:\\Details\\ProductDetails.txt", true);
                       
            writer.close();
         
        } catch (IOException e) {
            System.out.println("Error while writing to file");
            e.printStackTrace();
        }
    }
}