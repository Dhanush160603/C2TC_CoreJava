//Employee Package
package com.dhanush.assignment1.employee;

public class Manager extends Employee{
	
	private String managerName;
	private int managerId;
	private int managerSalary;
	
	//Getter of the ManagerName
	public String getManagerName() {
		return managerName;
	}
	
	//Setter of the ManagerName
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	
	}
	
	//Getter of the ManagerId
	public int getManagerId() {
		return managerId;
	
	}
	
	//Setter of the ManagerId
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	
	}
	
	//Getter of the ManagerSalary
	public int getManagerSalary() {
		return managerSalary;
	
	}
	
	//Setter of the ManagerSalary
	public void setManagerSalary(int managerSalary) {
		this.managerSalary = managerSalary;
	
	}

}
