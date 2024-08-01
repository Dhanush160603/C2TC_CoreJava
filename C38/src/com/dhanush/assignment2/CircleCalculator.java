package com.dhanush.assignment2;

//Assignment 2 (iii)

import java.util.Scanner;

public class CircleCalculator {
	
	double radius;
	String colour;
	double area;
	
	private void getInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Circle Radius : ");
		radius = sc.nextDouble();
		
		System.out.println("Enter the Colour of the Circle :");
		colour = sc.next();
		
		System.out.println("The Circle Radius is :"+radius);
		System.out.println("The Colour of the Circle is : "+colour);
		
	}
	
	private void calcArea() {
		
		area = 3.14 * radius * radius ;
		System.out.println("The Area of the circle is : "+area);
	
	}
	
	//Main Function
	
	public static void main(String[] args) {
		
		CircleCalculator c = new CircleCalculator();
		c.getInput();
		c.calcArea();
	}

}
