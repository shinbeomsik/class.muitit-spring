<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
	 background: gray;
	}
</style>
</head>
<body>
<!--표현식(expression)  -->
<!--EL:속성으로 지정한 값을 꺼내서 출력해주세요 라는 의미 -->
자기소개 검색 처리 요청이 완료되었습니다.<br>
${bag.id}<br> <!-- 출력용 (expression language -EL)-->
${bag.name}<br>
${bag.age}<br>
${bag.location}<br>
${bag.img}<br>
</body>
</html>