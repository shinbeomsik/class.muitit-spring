<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인한 사람의 ID : <%= session.getAttribute("user") %><br>
오늘 방문 횟수 : <%= session.getAttribute("count") %>
<hr color="red">

</body>
</html>