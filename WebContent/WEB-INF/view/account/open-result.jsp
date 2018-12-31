<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String name = request.getParameter("name");
    Random random = new Random();
    String account = random.nextInt(8999)+1001+"-"+(random.nextInt(8999)+1001);  
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>생성된 계좌는 <%= account %></h1>
</body>
</html>