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
			<img src="<%= application.getContextPath() %>/resources/img/2019.jpg" alt="" /><br />	
		</p>
	</div>
		<h1 style="text-align: center"> 메뉴 </h1>
		<a href="member.do">회원관리</a><br />
		<a href="account.do">계좌관리</a><br />
		<a href="article.do">게시판</a><br />
		<a href="admin.do">관리자</a>
</body>
</html>