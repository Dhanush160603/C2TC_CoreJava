package com.tns.daythree;

public class RCB_Teams {
	
	private String name;
	private int age;
	private int jerseyNo;
	
	//get in the Name
	
	public String getName() {
		return name;
	}
	
	//set in the name
	public void setName(String name) {
		this.name = name;
	}
	
	//get in the age
	public int getage() {
		return age;
	}
	
	//set in the age
	public void setAge(int age) {
		this.age = age;
	}
	
	//get in the jerseyNo
	public int getjerseyNo() {
		return jerseyNo;
	}
	
	//set in the jerseyNo
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	
	//Main Function
	public static void main(String[] args) {
		
		RCB_Teams obj = new RCB_Teams();
		obj.setName("Dhanush");
		obj.setAge(20);
		obj.setJerseyNo(16);
		
		System.out.println(obj.getName());
		System.out.println(obj.getage());
		System.out.println(obj.getjerseyNo());
	}
}

