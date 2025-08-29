package com.org;
//3. Write a program to reverse a 3-digit number. 

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the three digit number");
		int num = sc.nextInt();
		 
		int num1 = num%10;
		int Que1 = num/10;
		int num2 = Que1%10;
		int Que2 = Que1/10;
		int num3 = Que2%10;
		
		
		System.out.println("The sum of the digits of a 3-digit number are :"+num1+""+num2+""+num3);
        
        

	}

}
