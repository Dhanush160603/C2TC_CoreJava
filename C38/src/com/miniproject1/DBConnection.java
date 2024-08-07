package com.miniproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	//url link in database
	private static final String url = "jdbc:mysql://localhost:3306/dhanush";
	
	//database username
	private static final String username = "root";
	
	//database password
	private static final String password = "nobita16";
	
	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(url, username, password);
	}

}
