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
			<h1 id="title">관리자 관리</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<ul id="navi-bar">
				<li id="active"><a href="home.do">홈</a></li>
				<li><a href="member.do">회원관리</a></li>
				<li><a href="account.do">계좌관리</a></li>
				<li><a href="article.do">게시판</a></li>
				<li style="background-color: purple;;"><a href="admin.do">관리자</a></li>
			</ul>
		</td>
	</tr>
	<tr style="height : 300px">
		<td id="side-menu">
			<table>
				<tr>
					<td>관리자 등록</td>
				</tr>
				<tr>
					<td>관리자 목록</td>
				</tr>
				<tr>
					<td>관리자검색(직급)</td>
				</tr>
				<tr>
					<td>관리자검색(번호)</td>
				</tr>
				<tr>
					<td>관리자 직급변경</td>
				</tr>
				<tr>
					<td>해고</td>
				</tr>
			</table>
		</td>
		<td></td>
	</tr>
</table>
</body>
</html>