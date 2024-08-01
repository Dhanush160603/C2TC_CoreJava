package com.dhanush.assignment2;

//2nd Assignment (ii)

import java.util.Scanner;

public class Commission {
	
	String name;
	String address;
	double number;
	double sales;
	double commission;
	
	private void acceptDetails() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name = sc.nextLine();
		
		System.out.println("Enter your address : ");
		address = sc.nextLine();
		
		System.out.println("Enter your phone number : ");
		number = sc.nextDouble();
		
		System.out.println("Enter your sales amount :");
		sales = sc.nextDouble();
		
		System.out.println("Name : "+ name);
		System.out.println("Address : "+address);
		System.out.println("Phone number :"+number);
		System.out.println("Sales Amount :"+sales);
		
	}
		private void calculateCommission() {
		
		if (sales>=100000) {
			commission = sales * 0.10;
			
		}
		
		else if (50000<=sales && sales<100000) {
			commission = sales *0.05;
			
		}
		
		else if (sales>=30000 && sales<50000) {
			commission = sales *0.03;
			
			
		}
		
		else {
			commission=0;
		}
		
		System.out.println("Commission : "+commission);
		
	}
		
		//Main Function
		
		public static void main(String[] args) {
			
			Commission c = new Commission();
			c.acceptDetails();
			c.calculateCommission();
		}

}
