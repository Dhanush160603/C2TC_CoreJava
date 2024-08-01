package com.dhanush.assignment1;

import com.dhanush.assignment1.employee.Developer;
import com.dhanush.assignment1.employee.Manager;

public class AssignmentMain {
	
	//Main Function
		public static void main(String[] args) {
			
			Manager m = new Manager();
			
			//set of the manager details
			m.setManagerName("Dhanush");
			m.setManagerId(121);
			m.setManagerSalary(50000);
			
			//set of the developer details
			System.out.println(m.getManagerName());
			System.out.println(m.getManagerId());
			System.out.println(m.getManagerSalary());
			
			Developer d = new Developer();
			
			//set of the developer details
			d.setDeveloperName("Sarfan");
			d.setDeveloperId(154);
			d.setDeveloperSalary(30000);
			
			//set of the developer details
			System.out.println(d.getDeveloperName());
			System.out.println(d.getDeveloperId());
			System.out.println(d.getDeveloperSalary());
		}

}
