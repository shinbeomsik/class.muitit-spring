<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "one22",
				dataType : "json",
				data : {
					no:1
				},
				success: function(json) {
					no = json.no
					content = json.content
					$('#result').append(no + " " + content +"<br>")
				} //success
			}) //ajax
		})//b1
		
		$('#b11').click(function() {
			$.ajax({
				url: "json1",
				dataType : "json",
				success: function(json) {
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel //json에서 tel키로 값을 추출해라 
					table = "<table><tr><td>항목명</td><td>값</td></tr>" + 
							"<tr><td>아이디</td><td>" + id + "</td></tr>" +
							"<tr><td>패스워드</td><td>" + pw + "</td></tr>" +
							"<tr><td>이름</td><td>" + name + "</td></tr>" +
							"<tr><td>전화번호</td><td>" + tel + "</td></tr></table>"
					$('#result').append(table)
				} //success
			}) //ajax
		})//b11
		
		
		
		$('#b2').click(function() {
			$.ajax({
				url: "list55",
				dataType : "json",
				success: function(json) {
					no1 = json[1].no
					content1 = json[1].content
					$('#result').append("json 배열중 2번째 것 >> " +no1 + " " + content1 + "<br>")
				} //success
			}) //ajax
		})//b2
		
		$('#b3').click(function() {
			$.ajax({
				url: "json3",
				dataType : "json",
				success: function(json) {
					
	
					
					no = json.no
					title = json.title
					content = json.content
					writer = json.writer
					$('#result').append(no + " " + title + " " + content + " "  + writer  + "<br>")
				} //success
			}) //ajax
		})//b3
		
		$('#b4').click(function() {
			$.ajax({
				url: "json4",
				dataType : "json",
				success: function(json) {
					no1 = json[0].no
					title1 = json[0].title
					content1 = json[0].content
					writer1 = json[0].writer
					
					no2 = json[1].no
					title2 = json[1].title
					content2 = json[1].content
					writer2 = json[1].writer
					$('#result').append(no1 + " " + title1 + " " + content1 + " "+ writer1 + "<br>")
					$('#result').append(no2 + " " + title2 + " " + content2 + " "+ writer2 + "<br>")
					
				} //success
			}) //ajax
		})//b4
		
		
	})//$
</script>

</head>
<body>
<button id="b1" class="btn btn-outline-primary">컨트롤러에서 bbs JSON(TEXT)을 받아오자.!</button>
<button id="b11" class="btn btn-outline-secondary">컨트롤러에서   bbs JSON(TABLE)을 받아오자.!</button>
<button id="b2"  class="btn btn-outline-info">컨트롤러에서 bbs JSONArray를 받아오자.!</button>
<hr color="bule">
<button id="b3" class="btn btn-outline-danger">컨트롤러에서 JSON3을 받아오자.!</button>
<!--json3 ,bbsvo 에 값을 넣어서 json으로 출력  -->
<button id="b4" class="btn btn-outline-light text-dark">컨트롤러에서 JSONArray4를 받아오자.!</button>
<!--json4 ,bbsvo 에 값을 2번  넣어서 arraylist으로 json으로 출력  -->
<hr color="red">
<div id="result"></div>
</body>
</html>