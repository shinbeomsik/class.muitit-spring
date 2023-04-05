<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  content delivery network  : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "json.jsp",
				success: function(json) {
					$('#result').append(json)
				}//success
			})//ajax
		})//b1
		
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "json2.jsp",
				success: function(json) {
					$('#result').append(json)
				}//success
			})//ajax
		})//b2
		
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json3.jsp",
				dataType : "json",
				success: function(json) {
					today = json.today
					temp = json.temp
					hu = json.hu
					$('#result').append(today + " " + temp + " " + hu + "<br>")
					if(today == 'rain') {
						$('#result').append("<img src=resources/img/rain.png><br>")
					}else if(today == 'sun'){
						$('#result').append("<img src=resources/img/sun.jpg><br>")
					}
				} //success
			}) //ajax
		})//b3
		
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "json4.jsp",
				dataType : "json",
				success: function(json) {
					high = json[0].high
					low = json[0].low
					end = json[0].end
					
					high2 = json[1].high
					low2 = json[1].low
					end2 = json[1].end 
					$('#result').append("어제 주가: " + high +" " +low + " " + end +"<br>" )
					$('#result').append("오늘 주가: " + high2 +" " +low2 + " " + end2 +"<br>")
				}//success
			})//ajax
		})//b4
		
		
		
		/* 
		이놈은 데이터타입을 json으로 받아와서 추출해보기
		$('#b1').click(function() {
			$.ajax({
				url: "json.jsp",
				dataType : "json",
				success: function(json) {
					$('#result').append(json.id)
				} //success
			}) //ajax
		})//b1
		$('#b2').click(function() {
			$.ajax({
				url: "json2.jsp",
				dataType : "json",  <===== 이거를 사용해서 json으로 받아올수 있다 추출할수 있도록 만들어줌
				success: function(json) {
					$('#result').append(json[0].age)
				} //success
			}) //ajax
		})//b2 */
		
		
		
	})//$

	</script>
</head>
<body>
<button id="b1" >JSON을 받아오자</button>
<button id="b2" >JSONarray을 받아오자</button>
<button id="b3" >JSON3을 받아오자</button>
<button id="b4" >JSONarray4을 받아오자</button>
<hr color="red">
<div id="result"></div>
</body>
</html>