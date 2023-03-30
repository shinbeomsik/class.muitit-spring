<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적</title>
</head>
<body>

<h3>성적 추가 화면입니다. </h3>
<hr color="red">
<form action="insert4" method="get">
	subject : <input name="subject" value="영어"><br>
	score : <input name="score" value="80"><br>
	name : <input name="name" value="park"><br>
	img : <input name="img"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>성적 수정 화면입니다. </h3>
<hr color="red">
<form action="update4" method="get">
	id : <input name="id" value="1"><br>
	score : <input name="score" value="80"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>성적 삭제 화면입니다. </h3>
<hr color="red">
<form action="delete4" method="get">
	id : <input name="id" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>성적 검색 화면입니다. </h3>
<a href="list4">모든성적정보 가지고 오기</a>

<hr color="red">
<form action="one4" method="get">
	id : <input name="id" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
</body>
</html>