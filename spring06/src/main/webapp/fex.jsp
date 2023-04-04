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
			$.ajax({
				url: "update2",
				data:{
					no : $("#no").val(),
					content : $("#content").val()
				},
				success: function() {
					 location.href= "fex.jsp"
				}//success
			})//ajax
		})//b1
		
		$("#b2").click(function() {
			$.ajax({
				url: "delete2",
				data:{
					no : $("#no2").val(),
				},
				success: function() {
					alert("삭제성공")
					 location.href= "fex.jsp"
				}//success
			})//ajax
		})//b1
		
		$.ajax({
			url : "list5",
			success : function(x) {
				$('#result').append(x)
			} //success
		}) //ajax
		
	
	})//$
	
</script>
</head>
<body>
no : <input id="no" value="1">
content : <input id="content" value="싫어">
<button id="b1" >서버로 전송</button><br>
<hr color="blue">
삭제할 no: <input id="no2">
<button id="b2" >서버로 전송</button>


<hr color="red">
<div id="result"></div>
</body>
</html>