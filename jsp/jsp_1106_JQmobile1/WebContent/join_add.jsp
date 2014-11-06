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
	});
</script>
</head>
<body>
	<h1>회원정보</h1>
	<br /> 아이디 :
	<%=request.getParameter("id")%><br /> 비밀번호 :
	<%=request.getParameter("pass")%><br /> 이메일 :
	<%=request.getParameter("email")%><br /> 전화번호 :
	<%=request.getParameter("tel")%>

</body>
</html>