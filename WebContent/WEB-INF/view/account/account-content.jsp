<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="account-content.jsp">
	<form action="account.do">
		<h1>계좌 개설</h1>
		입금액 : <input type="text" name="money"/>
		<input type="hidden" name="cmd" value="open-account" />
		<input type="hidden" name="dest" value="open-result" />
		<input type="submit" id="btn" value="확인" />
	</form>
</div>