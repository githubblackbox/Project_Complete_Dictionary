 package com.englishtotamil.dictionary;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pword");
		String email = request.getParameter("mail");
	
		DBConnection db = new DBConnection();
		int count=db.Register(username, password, email);
		if(count>0){
			request.setAttribute("Registered", "You have successfully registered");
			RequestDispatcher rd =request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("Unable","Unable to register. please check the connection and try again");
			RequestDispatcher rd =request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
			
		}

			
		}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
