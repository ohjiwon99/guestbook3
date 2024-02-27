<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/guestbook3/gbc/delete">
		<input type="text" name="no" value="${param.no }">
		<table>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
				<td><button type="submit">삭제</button></td>
			</tr>
		</table>
	</form>
	
	<br><br>
	<a href="">메인으로 돌아가기</a>
</body>
</html>
