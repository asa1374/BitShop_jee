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
			String dest = String.valueOf(request.getAttribute(("dest")));
			System.out.print("dest==================++++++"+dest);
			switch(dest){
			case "NONE" : 
				%>
				<%@ include file="account-content.jsp" %>
				<%
			break;
			case "open-result" :
				%>
				<%@ include file="open-result.jsp" %>
				<%
				break;
			}
			%>
		</td>
	</tr>
</table>
</body>
</html>