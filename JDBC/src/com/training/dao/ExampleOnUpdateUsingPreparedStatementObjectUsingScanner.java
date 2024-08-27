package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExampleOnUpdateUsingPreparedStatementObjectUsingScanner {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the empno : ");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the ename : ");
		String ename=sc.nextLine();
		
		System.out.println("Enter the sal : ");
		double esal = sc.nextDouble();
		
		//load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Configure the connection url,uname,password
		String url ="jdbc:mysql://localhost:3306/balusql_jfs";
		String uname ="root";
		String pwd ="Rgukt143";
		
		//Establish the connection between java program with database
	Connection con=DriverManager.getConnection(url, uname, pwd);
	
	//execute the queries using preparedstatement object
	// Correct SQL query for updating employee details
	String query = "UPDATE employee SET EmpName = ?, EmpSal = ? WHERE EmpId = ?"; // Moved EmpId to WHERE clause

	// Create PreparedStatement object
	PreparedStatement pstmt = con.prepareStatement(query);

	// Set parameter values
	pstmt.setString(1, ename);  // Set EmpName
	pstmt.setDouble(2, esal);   // Set EmpSal
	pstmt.setInt(3, eid);       // Set EmpId for WHERE clause

	// Execute the update
	int i = pstmt.executeUpdate();

        if(i>0) {
        	System.out.println("Record is Updated successfully");
        }else {
        	System.out.println("Record not Updated");
        }
		
		
		//close the all resource
		pstmt.close();
		con.close();
		
		
		
	}

}