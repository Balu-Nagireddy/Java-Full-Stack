package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExampleOnUpdateUsingStatementObjectUsingScanner {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the empno to update: ");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the new ename : ");
		String ename=sc.nextLine();
		
		System.out.println("Enter the new sal : ");
		double esal = sc.nextDouble();
		
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
		
		String query="update employee set EmpName='"+ename+"',EmpSal="+esal+"where EmpId="+eid;
		
		//execute the query
		
		int i=stmt.executeUpdate(query);
		
		if(i>0) {
			System.out.println("Record is updated successfully");
		}else {
			System.out.println("Record Not updated");
		}
		
		
		//close the all resource
		stmt.close();
		con.close();
		
		
		
	}

}