package com.org;

import java.util.Scanner;

//4. Write a program to check whether the number is positive or negative
public class Question4 {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number");
        int num = sc.nextInt();
    
       
       if (num >0) {
    	   System.out.println("The number is positive!");
       }
       else {
    	   System.out.println("The number is negative");  
       }
		

	}

}
