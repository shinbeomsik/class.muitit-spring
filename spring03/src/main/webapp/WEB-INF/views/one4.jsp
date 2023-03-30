<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 검색</title>
<style type="text/css">
	body{
	 background: blue;
	}
</style>
</head>
<body>
<!--표현식(expression)  -->
성적 검색 처리 요청이 완료되었습니다.<br>
${bag.id}, <!-- 출력용 (expression language -EL)-->
${bag.subject},
${bag.score},
${bag.name},
<img src="resources/img/${bag.img}"><br>


<!-- <button type="submit">서버로 전송</button> -->
<!-- int result = dao.login(bag); // 0, 1
		if (result ==1) {
			return "ok"; //views아래 파일이름 jsp를 찾는다
		}else {
			//views 아래가 아니고, webapp아래
			//member.jsp로 가고싶은 경우!
			return "redirect:Member.jsp";
		}
 -->
</body>
</html>