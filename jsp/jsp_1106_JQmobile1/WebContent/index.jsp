<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- viewport : ����� ȭ��� ���õ� ������ �����ϱ� ���� ��Ÿ�±�
	content : ȭ�� ���� �Ӽ�
	width = "ȭ���� �ʺ�" , device-width : ��ġ�� �ʺ�
	height = "ȭ���� ����"
	initial-scale : �ʱ� ȭ���� Ȯ�� ����
	user-scalable : ����� ���� Ȯ�� no �̸� ����ڴ� Ȯ�� ����
	
	 -->
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
	$(document).ready(function() {
		$('#btn1').click(function() {
			//navigator ��ü�� userAgent �ۼ��� ����ؼ�
			// Ŭ���̾�Ʈ(��������)�� ������ �������
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