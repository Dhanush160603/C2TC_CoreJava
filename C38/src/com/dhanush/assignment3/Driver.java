package com.dhanush.assignment3;

import java.util.Scanner;

public class Driver {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Air India \n 2.King Fisher \n 3.Indigo ");
		
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		System.out.println("Enter hours : ");
		int hours = sc.nextInt();
		
		System.out.println("Enter Per Hour Cost : ");
		double costPerHour = sc.nextDouble();
		
		AirFare af = null;
		
		if (choice == 1) {
			
			af = new AirIndia(hours, costPerHour);
			
		}
		
		else if (choice ==2) {
			 
			af = new KingFisher(hours, costPerHour);
		
		}
		
		else if (choice == 3) {
			
			af = new Indigo(hours, costPerHour);
		
		}
		
		else {
			System.out.println("Invalid Choice");
			
			sc.close();
			
			return;
		
		}
		
		af.calculate();
		
		
	}

}
