package com.englishtotamil.dictionary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnection {
	 Connection con = null;
	public Connection getDBconnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni?useUnicode=true&characterEncoding=UTF-8","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public Connection getDconnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/etotcust","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
		
//    try
//    {
//       Class.forName("com.mysql.jdbc.Driver");
//      //  String url = "jdbc:mysql://localhost:3306/englishtotamil?useUnicode=true&characterEncoding=UTF-8";
//       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/englishtotamil?useUnicode=true&characterEncoding=UTF-8","root","");
//   
//	} catch (Exception e) {
//	e.printStackTrace();
//}
//
//return con;
//}
//	
	
    public String login(String username,String password){
    	String getlogin=null;
    	
    	try {
			Statement stmt = getDconnection().createStatement();
			String query = "select username from etotm where username='"+username+"' and password ='"+password+"'";
			 ResultSet rs = stmt.executeQuery(query);
			 while (rs.next()){
		
				 getlogin = rs.getString("username"); 
				 
			 }
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return getlogin;
    }
	
	
	
    public ArrayList<Bean> Search(String userinput){
		ArrayList<Bean> al = new ArrayList<Bean>();
    
  //  public String Search(String userinput){
    	
		
		//String getSearch=null;
    	
    	try {
			Statement stmt = getDBconnection().createStatement();
			
			String query = "select tamil,english from unicode where english='"+userinput+"'";
			// String query = "select tamil from unicode where english='"+userinput+"'";
			
			 ResultSet rs = stmt.executeQuery(query);
			 while (rs.next()){
				 
				 
					String tam = rs.getString("tamil");
					String eng = rs.getString("english");
					Bean be = new Bean();
					
					be.setTamil(tam);
					be.setEnglish(eng);
					al.add(be);
					
		
//				 getSearch = rs.getString("tamil"); 
				 
			 }
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return al;
    	// return getSearch;
    }
    
    
    
    
     public int deleteName(String a, String b){
    	 int rs=0;
    	 try {
			Statement stmt = getDconnection().createStatement();
			String query1 = "Delete from etotm where name='"+a+"' and password='"+b+"'";
			 rs = stmt.executeUpdate(query1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
    	
     }
     public int updateName(String a,String b,String c){
    	 Statement stmt;
    	 int rs=0;
		try {
			 stmt = getDconnection().createStatement();
			 String query2 = "update etotm set fullname='"+c+"' where name='"+a+"' and password='"+b+"'";
	    	  rs = stmt.executeUpdate(query2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
    	   
     }
     public int Register(String username,String password,String email){
    	 int rs=0;
    	 try {
			Statement stmt = getDconnection().createStatement();
			String query3 = "Insert into etotm(username,password,email)values('"+username+"','"+password+"','"+email+"')";
			rs= stmt.executeUpdate(query3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	 return rs;
     }
     }
    