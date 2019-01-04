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
			<h1 id="title">게시판</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<ul id="navi-bar">
				<li id="active"><a href="home.do">홈</a></li>
				<li><a href="member.do">회원관리</a></li>
				<li><a href="account.do">계좌관리</a></li>
				<li style="background-color: orange;"><a href="article.do">게시판</a></li>
				<li><a href="admin.do">관리자</a></li>
			</ul>
		</td>
	</tr>
	<tr style="height : 300px">
		<td id="side-menu">
			<table>
				<tr>
					<td style="background-color: aqua;">글쓰기</td>
				</tr>
				<tr>
					<td>계좌 목록</td>
				</tr>
				<tr>
					<td>글검색(글쓴이)</td>
				</tr>
				<tr>
					<td style="background-color: green;">글검색(글번호)</td>
				</tr>
				<tr>
					<td style="background-color:lime;">글수정</td>
				</tr>
				<tr>
					<td >글삭제</td>
				</tr>
			</table>
		</td>
		<td></td>
	</tr>
</table>
</body>
</html>