package com.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	          resp.setContentType("text/html");
		
		//getting the form details  using req object with help of getParameter()
		String fname=   req.getParameter("fn");
		String lname=   req.getParameter("ln");
		String gnd=   req.getParameter("rd");
		String hbs[]= req.getParameterValues("ck");
	  PrintWriter out=	resp.getWriter();
	  out.println("Registration Details Are: <br>");
	  out.println("FirstName : "+fname +"<br>");
	  out.println("LastName : "+lname+"<br>");
	  out.println("Gender : "+gnd+"<br>");
	  out.println("Hobbies : "+hbs +"<br>");
	for (String s: hbs) {
		  out.println(s+"<br>");
	  }
	  out.println("LastName : "+lname+"<br>");
	  out.println("Gender : "+gnd+"<br>");
	  out.println("<a href='Register.jsp'>");
	  out.println("Click Here To Register");
	  out.println("</a>");
		
	}
	

}
