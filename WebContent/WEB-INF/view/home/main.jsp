<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p style="text-align: center;">
			<img src="<%= request.getContextPath() %>/resources/img/2019.jpg" alt="" /><br />	
		</p>
	</div>
		<h1 style="text-align: center"> 메뉴 </h1>
		<a href="member/main.jsp" style="text-align: center" >회원관리</a><br />
		<a href="account/main.jsp" style="text-align: center" >계좌관리</a><br />
		<a href="" style="text-align: center" >게시판</a><br />
		<a href="" style="text-align: center" >관리자</a>
</body>
</html>