<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=내중에 내 app키"></script>
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {

		$('#b1').click(
				function() {
					$('#result').empty()
					$('#map').empty()
					$.ajax({
						url : "jsonResponse3",
						dataType : "json",
						data : {
							id : "apple"
						},
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							$('#result').append(
									"<table><tr><td>아이디</td><td>패스워드</td><td>이름</td><td>전화번호</td></tr>"
											+ "<tr><td>" + id + "</td><td>"
											+ pw + "</td><td>" + name
											+ "</td><td>" + tel
											+ "</td></tr></table>")
						}//success
					})//ajax
				})//b1

		$('#b2').click(
				function() {
					$('#result').empty()
					$('#map').empty()
					$.ajax({
						url : "jsonResponse4",
						dataType : "json",
						success : function(json) {
							for (var i = 0; i < json.length; i++) {
								idi = json[i].id
								pwi = json[i].pw
								namei = json[i].name
								teli = json[i].tel
								$('#result').append(
										idi + " " + pwi + " " + namei + " "
												+ teli + "<br>")

							}//for
						}//success
					})//ajax
				})//b2

		 $('#b3').click(function() {
			$('#result').empty()
			 $('#map').empty()
				$.ajax({
					url:"jsonResponse4",
					dataType:"json",
					success: function(json) {
						
						$('#result').append("<table border='1'><tr><td>아이디</td><td>패스워드</td><td>이름</td><td>전화번호</td></tr>")
						for(i = 0; i < json.length; i++){
							$('#result').append(
									"<tr>" +
									"<td>" + json[i].id + 
									"</td><td>" + json[i].pw + 
									"</td><td>" + json[i].name + 
									"</td><td>" + json[i].tel +
									"</td></tr>"
							)//d2
						}//for
						$('#result').append("</table>")
						
					}//success
				})//ajax
			})//b3   

		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "jsonResponse5",
				dataType : "json",
				success : function(json) {
					lat =json.lat
					lon =json.lon
					
					var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
				    mapOption = { 
				        center: new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
				        level: 3 // 지도의 확대 레벨
				    };

				var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

				// 마커가 표시될 위치입니다 
				var markerPosition  = new kakao.maps.LatLng(lat, lon); 

				// 마커를 생성합니다
				var marker = new kakao.maps.Marker({
				    position: markerPosition
				});

				// 마커가 지도 위에 표시되도록 설정합니다
				marker.setMap(map);

				// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
				// marker.setMap(null);      
				}//success
			})//ajax
		})//b4

	})//$
</script>
</head>
<body>
	<button id="b1" class="btn btn-outline-primary">기본예제1</button>
	<button id="b2" class="btn btn-outline-secondary">기본예제2</button>
	<button id="b3" class="btn btn-success">기본예제3</button>
	<hr color="red">
	<button id="b4" class="btn btn-outline-warning">응용예제1</button>
	<button id="b5" class="btn btn-outline-dark">응용예제2</button>
	<hr color="blue">
	<div id="result"></div>
	<div id="map" style="width: 100%; height: 350px;"></div>


</body>
</html>