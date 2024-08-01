package com.dhanush.assignment2;

//Assignment 2 (i)

import java.util.Scanner;

public class CollegeDetails {
	
	//Main Function
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter your roll no :");
			int rollno = sc.nextInt();
			
			System.out.println("Enter your grade : ");
			String grade = sc.next();
			
			System.out.println("Enter your percentage : ");
			int p = sc.nextInt();
			
			System.out.println("College Details");
			
			System.out.println("Name : " +name);
			System.out.println("Roll no : "+rollno );
			System.out.println("Grade : " +grade);
			System.out.println("Percentage : " +p);
			
				
		}

}
