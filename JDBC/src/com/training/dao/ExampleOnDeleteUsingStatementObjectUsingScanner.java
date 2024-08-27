package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExampleOnDeleteUsingStatementObjectUsingScanner {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the EmpId to delete : ");
		int eid = sc.nextInt();
		
		//load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Configure the connection url,uname,password
		String url ="jdbc:mysql://localhost:3306/balusql_jfs";
		String uname ="root";
		String pwd ="Rgukt143";
		
		//Establish the connection between java program with database
	Connection con=DriverManager.getConnection(url, uname, pwd);
	
	//execute the queries using statement object
		Statement stmt=con.createStatement();
		
		String query="delete from employee where EmpId="+eid;
		
		//execute the query
		
		int i=stmt.executeUpdate(query);
		
		if(i>0) {
			System.out.println("Record is Deleted successfully");
		}else {
			System.out.println("Record Not Deleted");
		}
		
		
		//close the all resource
		stmt.close();
		con.close();
		
		
		
	}

}