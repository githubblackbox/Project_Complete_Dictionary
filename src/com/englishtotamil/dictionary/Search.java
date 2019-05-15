package com.englishtotamil.dictionary;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Search")
public class Search extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}					

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String userinput= req.getParameter("uinput");
		
		
		DBConnection db = new DBConnection();
		ArrayList<Bean> al = db.Search(userinput);
	//	String usearch = db.Search(userinput);
		if(al != null){
		//	if(usearch != null){
			req.setAttribute("EtoT", al);
		//	req.setAttribute("EtoT", usearch);
			RequestDispatcher rd= req.getRequestDispatcher("EnglishToTamil.jsp");
			
	
			rd.forward(req, res);

	
		
		}else{  
			req.setAttribute("Error", "- did not match any data.");
			RequestDispatcher rd = req.getRequestDispatcher("Error.jsp");
			rd.forward(req, res);
		}
	
        		
		
	}

}
