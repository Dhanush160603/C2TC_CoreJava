package com.miniproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDeteailsDB {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/dhanush";
		
		String username = "root";
		
		String password = "nobita16";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("1.Create Operation");
		System.out.println("2.Read Operation");
		System.out.println("3.Update Operation");
		System.out.println("4.Delete Opearation");
		System.out.println("5.Exit");
		System.out.println("Enter the choice : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		
		case 1:
			System.out.println("Enter your Id : ");
			int a = sc.nextInt();
			System.out.println("Enter your Name : ");
			String b = sc.next();
			System.out.println("Enter your Salary : ");
			double c = sc.nextDouble();
			createEmployee(con, a, b, c); 
			break;
		
			
		case 2 :
			readEmployee(con);
			break;
		
		case 3:
			System.out.println("Enter your Id : ");
			int d = sc.nextInt();
			System.out.println("Enter the Name :");
			String e = sc.next();
			System.out.println("Enter the salary :");
			double f = sc.nextDouble();
			updateEmployee(con,d,e,f);
			break;
			
		case 4:
			System.out.println("Enter the employee Id to Delete:");
		    int j = sc.nextInt();
			deleteEmployee(con,j);
			break;
			
		case 5:
			System.out.println("Successfully Exited");
			return;
	
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
		
		
	}
		
		//Insertion Query
		public static void createEmployee(Connection con,int emp_id, String emp_name, double salary ) throws SQLException{
		
		String query1 = "insert into employee (emp_id, emp_name, salary) values (?, ?, ?)";
		
		PreparedStatement pst = con.prepareStatement(query1);
		
		pst.setInt(1, emp_id);
		pst.setString(2, emp_name);
		pst.setDouble(3, salary);
		pst.executeUpdate();
		
		System.out.println("Insertion Successfully");
		}
		
		//Selection Query
		public static void readEmployee(Connection con) throws SQLException{
		
		String query = "select * from employee";
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
		
		System.out.println("Id is "+rs.getInt(1));
		System.out.println("Name is "+rs.getString(2));
		System.out.println("Salary is "+rs.getInt(3));
		
		}
	}
		
		//Update Query
		public static void updateEmployee(Connection con, int emp_id, String emp_name, double salary) throws SQLException{
		
		
		String query2 = "update employee set emp_name = ?, salary = ? where emp_id = ? ";		
		
		PreparedStatement pst = con.prepareStatement(query2);
		pst.setString(1, emp_name);
		pst.setDouble(2, salary);
		pst.setInt(3, emp_id);
		pst.executeUpdate();
		
		System.out.println("Updation Successfully");
	}

		
		//Delete Query
		public static void deleteEmployee(Connection con, int emp_id) throws SQLException{
		
		String query3 = "delete from employee where emp_id = ?";
		
		PreparedStatement pst = con.prepareStatement(query3);
		
		pst.setInt(1, emp_id);
		pst.executeUpdate();
		
		System.out.println("Deletion Successfully");
		
		}
		
}
		
	
	

   

