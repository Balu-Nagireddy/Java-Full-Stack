package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnRetrieveRecordsUsingSelect {
	
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs =null;
		
	   try {
		 //load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Configure ur1,username and password
		String url="jdbc:mysql://localhost:3306/balusql_jfs";
		String uname="root";
		String pwd="Rgukt143";
		
		//Establish the connection between java class with database
		con=DriverManager.getConnection(url, uname, pwd);
		
		String query="select * from employee";
		
		//Creating statement object
		stmt = con.createStatement();
		rs =stmt.executeQuery(query);
		System.out.println("Employee Records from Database ");
		while(rs.next()) {
		  //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			//System.out.println(rs.getInt("EmpId")+" "+rs.getString("EmpName")+" "+rs.getDouble("EmpSal"));
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		
		}
		
		/*
		 * rs.close(); stmt.close(); con.close();
		 */
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
			try {
				if(rs!=null) {
				rs.close();
				}
				
				if(stmt!=null) {
					stmt.close();
				}
				
				if(con!=null) {
					con.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		
		
		
		
		
		
		
	}

