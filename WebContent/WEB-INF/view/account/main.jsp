<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#wrapper{
	width: 100%;
	height : 100%;
	border : 3px solid gray;
}
#wrapper tr{
	border : 1px solid gray;
}
#wrapper tr td{
	border : 1px solid gray;
}
#side-menu{
	width :30%;
}
#side-menu-table tr{
	border: 2px solid black;
}
#navi-bar {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}
li {
  float: left;
}
li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}
#title {width : 180px; height :60px; 
				margin: 0 auto; color: #555; margin-top: 20px; margin-bottom: 20px}
</style>
</head>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<h1 id="title">계좌 관리</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<ul id="navi-bar">
				<li id="active"><a href="home.do">홈</a></li>
				<li><a href="member.do">회원관리</a></li>
				<li style="background-color: green;"><a href="account.do">계좌관리</a></li>
				<li><a href="article.do">게시판</a></li>
				<li><a href="admin.do">관리자</a></li>
			</ul>
		</td>
	</tr>
	<tr style="height : 300px">
		<td id="side-menu">
			<table>
				<tr>
					<td>계좌 생성</td>
				</tr>
				<tr>
					<td>계좌 목록</td>
				</tr>
				<tr>
					<td>계좌검색(이름)</td>
				</tr>
				<tr>
					<td>계좌검색(계좌번호)</td>
				</tr>
				<tr>
					<td>총계좌수</td>
				</tr>
				<tr>
					<td>계좌번호채크</td>
				</tr>
				<tr>
					<td>입금</td>
				</tr>
				<tr>
					<td>출금</td>
				</tr>
				<tr>
					<td>계좌삭제</td>
				</tr>
			</table>
		</td>
		<td></td>
	</tr>
</table>
</body>
</html>