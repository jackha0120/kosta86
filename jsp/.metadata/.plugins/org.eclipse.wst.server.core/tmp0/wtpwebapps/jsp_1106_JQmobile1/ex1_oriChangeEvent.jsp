<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
	$(document).ready(function() {
		$(window).bind('orientationchange', function() {
			// ��Ȳ�� ���� �ڵ鸵
			// (����) Ajax�� ����ؼ� ������� ȭ�� ���� ������ ������ �׿� �µ���
			// �ý����� �����ؼ� ���� ��� ���� �� �ִ�.
			if(window.orientation == 0){
				$('body').css('background','pink').html('<h1 style=>Hi!</h1>');
			}else{
				$('body').css('background','blue').html('<h1>GOOOOOOOOOD~~~!!</h1>');
			}
			
		});
	});
</script>
</head>
<body>

</body>
</html>