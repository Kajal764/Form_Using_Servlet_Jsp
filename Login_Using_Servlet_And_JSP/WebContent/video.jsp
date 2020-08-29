<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");  //HTTP 1.1
	//for back button prevention
	
	//response.setHeader("Pragma", "no-cache") //for old version HTTP 1.0
	
	//response.setHeader("Expires","0")    //for proxies
	
	//for security 
		if (session.getAttribute("uname") == null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	<iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>