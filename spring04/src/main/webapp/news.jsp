<%@page import="com.multi.mvc04.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="https://news.kbs.co.kr/news/view.do?ncd=7638864">
간단한 뉴스입니다.
</a>
<% 
	String id = (String)session.getAttribute("id");
	if(id != null){
	 %>
<form action="aaa">
	댓글:<input name="reply"><button>댓글달기</button>
</form>
<%} %>
</body>
</html>