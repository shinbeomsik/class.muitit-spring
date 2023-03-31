<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.setAttribute("count", null);
//세션의 값으로는 아무 타입이나 다 넣어도 됨.
//==> 주차장 생각! Car면 다 됨
//==> Car(크다) <-- 트럭, 승용차, 버스,.....(작다)
//      ㄴ 이 안에 포함될수있다
//==> 타입변환(형변환),자동형변환(업캐스팅)
%>
<a href="page04.jsp">세션확인하러가기</a>
</body>
</html>