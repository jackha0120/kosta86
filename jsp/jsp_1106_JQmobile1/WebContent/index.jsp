<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- viewport : 모바일 화면과 관련된 정보를 제공하기 위한 메타태그
	content : 화면 설정 속성
	width = "화면의 너비" , device-width : 장치의 너비값
	height = "화면의 높이"
	initial-scale : 초기 화면의 확대 비율
	user-scalable : 사용자 정의 확대 no 이면 사용자는 확대 없음
	
	 -->
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
	$(document).ready(function() {
		$('#btn1').click(function() {
			//navigator 객체의 userAgent 송성을 사용해서
			// 클라이언트(웹브라우저)의 정보를 출력해줌
			var userAgent = navigator.userAgent;
			console.log("Client Device : " + userAgent);
			alert(userAgent);
		});

	});
</script>
</head>
<body>
	<input type="button" value="click" id="btn1">
</body>
</html>