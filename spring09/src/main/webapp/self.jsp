<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>자기소개 화면입니다. </h3>
<hr color="red">
<form action="insert10" method="get">
	id : <input name="id" ><br>
	name : <input name="name" ><br>
	age : <input name="age" ><br>
	location : <input name="location"><br>
	img : <input name="img"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>자기소개수정 화면입니다. </h3>
<hr color="red">
<form action="update10" method="get">
	id : <input name="id"><br>
	name : <input name="name"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>탈퇴 화면입니다. </h3>
<hr color="red">
<form action="delete10" method="get">
	id : <input name="id" ><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원검색 화면입니다. </h3>
<a href="list10">모든회원정보 가지고 오기</a>

<hr color="red">
<form action="one10" method="get">
	id : <input name="id"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

</body>
</html>