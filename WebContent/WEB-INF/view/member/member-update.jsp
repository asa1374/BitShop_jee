<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.MemberBean" %>
<div id="member-update">
<h1>비밀번호 수정</h1>
<%
MemberBean user = (MemberBean)session.getAttribute("member");
%>
	<table>
		<tr>
			<th></th>
			<th>내용</th>
		</tr>
		<tr>
			<td>ID</td>
			<td><%=user.getId() %></td>
		</tr>
		<tr>
			<td>NAME</td>
			<td><%=user.getName() %></td>
		</tr>
		<tr>
			<td>PASS</td>
			<td>
			현재 비밀번호 <input type="text" name="currpass" />
			변경할 비밀번호 <input type="text" name="changepass" />
			</td>
		</tr>
		<tr>
			<td>SSN</td>
			<td><%=user.getSsn() %></td>
		</tr>
	</table>	
</div>