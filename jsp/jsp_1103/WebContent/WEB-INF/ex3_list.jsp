<%@page import="dao.ImgDirDao"%>
<%@page import="vo.ImgDirVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		// Dao�κ��� �����͸� �޾ƿ��� ���� �޼��带 ȣ��
		ArrayList<ImgDirVO> list = ImgDirDao.getDao().getList();
		for (ImgDirVO e : list) {
	%>
	<p>
		<img
			src="<%=application.getContextPath()%>/upload/<%=e.getImgpath()%>">
	</p>
	<%
		}
	%>
	<a href="ex3_uploadForm.jsp"> ���ε���</a>
</body>
</html>