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
<a href="https://www.amc.seoul.kr/asan/healthinfo/druginfo/drugInfoDetail.do?odcd=UDCA100&searchKeyword=">
공동구매할 물건입니다.
</a>
<% 
	String id = (String)session.getAttribute("id");
	if(id != null){
	 %>
<a href="bbb"><button>공동구매 참여</button></a>
<%} else{ %>
<form action="login.jsp">
 <button>로그인페이지로 돌아가기</button>
</form>	
<%} %>
</body>
</html>