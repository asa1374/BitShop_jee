<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= application.getContextPath() %>/resources/css/style.css" />
</head>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<%@ include file="../home/header.jsp" %>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="../home/navi-bar.jsp" %>
		</td>
	</tr>
	<tr style="height : 300px">
		<td width="30%">
			<%@ include file="side-menu.jsp" %>
		</td>
		<td>
			<% 
				switch(String.valueOf(request.getAttribute(("dest")))){
				case "NONE" :
					%>
					<%@ include file="mypage.jsp" %>
					<%
					break;
				case "join-form" :
					%>
					<%@ include file="join-form.jsp" %>
					<%
					break;
				}
			%>
		</td>
	</tr>
</table>
</body>
</html>