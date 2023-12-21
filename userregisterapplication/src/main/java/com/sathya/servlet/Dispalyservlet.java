package com.sathya.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dispalyservlet")
public class Dispalyservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDao dao=new UserDao();
		 List<UserInfo> listofusers=dao.getAllUsers();
		 
		 
		 request.setAttribute("users", listofusers);
		 
		 RequestDispatcher dispatcher=request.getRequestDispatcher("displayusers.jsp");
		 dispatcher.forward(request, response);
	}
	

	

}
