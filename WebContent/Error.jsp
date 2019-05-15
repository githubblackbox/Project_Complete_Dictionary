<%@page pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String Display=request.getParameter("uinput");%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>404</title>

<style type="text/css">
body
 {
     background-image: url("https://1.bp.blogspot.com/-0AmMH40kHHg/XD-3kv-MWKI/AAAAAAAABrk/5TFvOh74Qf0f7Vk_B2emFv7WHVw5C47jgCLcBGAs/s1600/404.jpeg");
     background-repeat: no-repeat;
     width: 100%;
     height: 100%;
     background-size: cover;

 }
 </style>

</head>
<body>

<div align="center">

<h1><font color="white"><%=Display%></font></h1>  <h2><font color="white"><%=request.getAttribute("Error") %> </font> </h2>

<h3>
<font color="white">Suggestions:<br></font>
<font color="white">Make sure that all words are spelled correctly.<br></font>
<font color="white">Try different keywords.<br></font>
<font color="white">Try more general keywords.<br></font>
</h3>
<button type="button" name="back" onclick="history.back()">Search Again</button>


</div>

</body>
</html>