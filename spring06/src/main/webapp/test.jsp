<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.js" integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function() {
		
		$("#b1").click(function() {
			$('#result').empty()
			$.ajax({
				url: "test1",
				data:{
					id : "101"
				},
				success: function(x) {
					$('#result').append(x)
				}//success
			})//ajax
		})//b1
		
		$("#b2").click(function() {
			$('#result').empty()
			$.ajax({
				url: "test2",
				success: function(x) {
					$('#result').append(x)
				}//success
			})//ajax
		})//b2
	})//$

</script>
</head>
<body>
<button id="b1">프로덕트 아이디 입력해서 결과값 가져오기</button>
<button id="b2">프로덕트 전체 결과값 가져오기</button>
<hr color="red"> 
<div id="result"></div>
</body>
</html>