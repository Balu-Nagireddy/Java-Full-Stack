package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnUpdateUsingStatementObject {

	public static void main(String[] args) {
		
		try {
			//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//define the connection url for mysql database;
			String url="jdbc:mysql://localhost:3306/balusql_jfs";
			String userName="root";
			String password="Rgukt143";
			
			//establish the connection between the java class and database
			Connection con =DriverManager.getConnection(url,userName,password);
	
			//creating statment object using con
			Statement stmtObj=con.createStatement();
			
			//Execute the Queries
			String query="insert into employee values(1,'Ramu',5000)";
			
			int iobj=stmtObj.executeUpdate(query);
			
			if(iobj>0) {
				System.out.println("Record is inserted Successfully");
			}else {
				System.out.println("Record is Not Inserted ");
			}
						
			//close the objects
			stmtObj.close();
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
