package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		// calling the dao layer by passing email
		UserDao dao=new UserDao();
		UserInfo userinfo=dao.findByEmail(email) ;
		
		//set the data to request object 
		
		request.setAttribute("userinfo", userinfo);
		
		//forward the request to Jsp
		RequestDispatcher dispatcher= request.getRequestDispatcher("searchservlet.jsp");
		
			dispatcher.forward(request, response);
			
	
	}

}
