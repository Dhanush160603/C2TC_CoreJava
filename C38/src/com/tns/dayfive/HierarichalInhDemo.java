package com.tns.dayfive;

//Program to demonstrate Hierarchical Inheritance

public class HierarichalInhDemo {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);
		Person p;
		p = new Person("Dhruv", "Mumbai");
		
		if (p instanceof Person)
		System.out.println("Person Details "+p);
		p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		p = new Student01("Pankaj", "Pune", "FE", 88);
		
		if (p instanceof Student01)
		System.out.println("Student Details "+p);
		}


}
