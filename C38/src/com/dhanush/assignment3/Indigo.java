package com.dhanush.assignment3;

public class Indigo implements AirFare {
	
	private int hours;
	private double costPerHour;
	
	Indigo() {
		
	}
	
	Indigo(int hours,double costPerHour) {
		
	}
	
	//Getter of the Hours
	public int getHours() {
		return hours;
	}
	
	//Setter of the Hours
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	//Getter of the CostPerHour
	public double getCostPerHour() {
		return costPerHour;
	}
	
	//Setter of the CostPerHour
	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	@Override
	public void calculate() {
		
		double amount;
		amount = hours*costPerHour*8;
		System.out.println("Indigo Total Amount : "
				+ String.format("%.2f", amount));
	}

	

}
