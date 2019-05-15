<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>English to Tamil</title>
<!-- Add icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

.input-container {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  width: 100%;
  margin-bottom: 15px;
}

.icon {
  padding: 10px;
  background: dodgerblue;
  color: white;
  min-width: 50px;
  text-align: center;
}

.input-field {
  width: 100%;
  padding: 10px;
  outline: none;
}

.input-field:focus {
  border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
  background-color: dodgerblue;
  color: white;
  padding: 15px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>

<style type="text/css">
body
 {
     background-image: url("https://1.bp.blogspot.com/-W92TMqkQXrQ/XD-6gF3moMI/AAAAAAAABr4/6Ul9E2kNyEUuojL0e2hXL1besEOEOzGGACLcBGAs/s1600/login.jpg");
     background-repeat: no-repeat;
     width: 100%;
     height: 100%;
     background-size: cover;

 }
 </style>

</head>
<body>

<form action="Register"  method="post"  style="max-width:500px;margin:auto">
  <h2><font color="white">Create account</font></h2>
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Username" name="uname">
  </div>

  <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="Email" name="mail">
  </div>
  
  <div class="input-container">
    <i class="fa fa-key icon"></i>
    <input class="input-field" type="password" placeholder="Password" name="pword">
  </div>

  <button type="submit" class="btn">Signup</button>
</form>

<div align="center">

 <%if(request.getAttribute("Unable")!=null){ %>
 <p><h2><font color="white"><%=request.getAttribute("Unable")%></font></h2></p>
 <% } %>
 
</div>


</body>
</html>