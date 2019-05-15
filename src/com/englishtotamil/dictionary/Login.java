package com.englishtotamil.dictionary;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}					

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username= req.getParameter("uname");
		String password= req.getParameter("pword");
		DBConnection db = new DBConnection();
		String nme = db.login(username,password);
		if(nme != null){
			req.setAttribute("success", nme);
			RequestDispatcher rd= req.getRequestDispatcher("Search.jsp");
			rd.forward(req, res);
		}else{  
			
			req.setAttribute("incorrect", "The password that you've entered is incorrect.");
			RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
			rd.forward(req, res);
		}
	
        		
		
	}

}
