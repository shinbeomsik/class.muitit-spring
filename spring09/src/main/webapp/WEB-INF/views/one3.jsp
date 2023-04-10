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
북마크 검색 처리 요청이 완료되었습니다.<br>
${bag.id}, <!-- 출력용 (expression language -EL)-->
${bag.name},
${bag.url},
<img src="resources/img/${bag.img}"><br>
</body>
</html>