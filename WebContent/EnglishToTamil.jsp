<%@page pageEncoding="UTF-8" %>
<%@page import="com.englishtotamil.dictionary.Bean"%>
<%@page import="java.util.ArrayList"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%String Display=request.getParameter("uinput");%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>English to Tamil</title>

</head>
<body>



<div align="center">


<h2> Search On Internet</h2><a href="http://www.google.com/#hl=en&tbo=d&site=&source=hp&q=<%=Display%>"target="_blank"><h1> <%=Display%></h1></a>

<%

out.println("<table id=\"tbl\" border=1>");
out.println("<tr>");
out.println("<td>English</td>");
out.println("<td>Tamil</td>");  

out.println("</tr>");
ArrayList<Bean> al =(ArrayList<Bean>)request.getAttribute("EtoT");
for(int i=0;i<al.size();i++){
	Bean be =(Bean) al.get(i);
	out.println("<tr>");
	out.println("<td><label id=\"English\">"+be.getEnglish()+"</label></td>");
	out.println("<td><label id=\"Tamil\">"+be.getTamil()+"</label></td>");
	out.println("</tr>");
}

out.println("</table>");


%>
<br>
<button type="button" name="back" onclick="history.back()">Search Again</button>

</div>

</body>
</html>