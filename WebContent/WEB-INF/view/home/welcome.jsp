<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.MemberBean" %>
<%MemberBean member = (MemberBean)session.getAttribute("member");%>
	<%=member.getName() %> 님 환영합니다.
	<a href="member.do?cmd=logout">로그아웃</a>
