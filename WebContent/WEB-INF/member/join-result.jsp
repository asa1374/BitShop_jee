<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String pass = request.getParameter("pass");
String ssn = request.getParameter("ssn");
String gender = "";
char ch = ssn.charAt(7);
if(ch=='1' || ch=='3'){  
	gender = "남자";
}else if(ch=='2' || ch=='4'){
	gender = "여자";
}else if(ch=='5' || ch=='6'){
	gender = "외국인";
}else{
	gender = "잘못입력하셨습니다.";
}
String height = request.getParameter("height");
String weight = request.getParameter("weight");
String year ="";
year = ssn.substring(0,2);
String month = "";
month = ssn.substring(2,4);
String day = "";
day = ssn.substring(4,6);

String bmi = "";
double w = Double.parseDouble(weight);
double t = Double.parseDouble(height);
double b = w/(t*t)*10000;
if(b>=40){
	bmi = "고도비만";
}else if(b>=35){
	bmi = "중등도비만";
}else if(b>=30){
	bmi = "경도비만";
}else if(b>=25){
	bmi = "과체중";
}else if(b>=18.5){
	bmi = "정상";
}else{
	bmi = "저체중";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>가입한 ID : <%= id %> </h3><br />
	<h3>이 름 : <%= name %></h3><br />
	<h3>가입한 비밀번호 : ***** </h3><br />
	<h3>생년월일 : <%= year %>년 <%= month %> 월 <%= day %> 일생 </h3><br />
	<h3>성별 : <%= gender %></h3><br />
	<h3>BMI : <%= bmi %></h3><br />
	<a href="login-form.jsp">로그인 이동</a><br />
	<a href="../index.jsp">홈으로 이동</a>
</body>
</html>