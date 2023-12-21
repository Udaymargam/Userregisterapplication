package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.standard.RequestingUserName;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserRegister")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	//Get the requested data 
   			String username=request.getParameter("username");
   			String password=request.getParameter("password");
   			String email=request.getParameter("email");
   			String mobileno=request.getParameter("mobileno");
   		//Give the Data to DAO layer 
   			UserDao dao = new UserDao();
   		int	result=dao.saveUser(username, password, email, mobileno);
   		
   		
   		//to send the result to JSP file store into request
   		
   		request.setAttribute("result", result);
   		// send the result to JSP  file
   		
   		RequestDispatcher dispatcher= request.getRequestDispatcher("registerstatus.jsp");
   		dispatcher.forward(request, response);
   		
   		

   			
   			
		
	}

}
