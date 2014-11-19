<%@page import="ex2.PlayMeVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div id="wrap">
	
		<table>
		
			<tr>
				<td><a href="pdetail.kosta?query=detail&num=${e.num }">
				${e.pname }</a></td>
				<td>${e.price }</td>
				<td>${e.users }</td>
				<td>${e.rdate }</td>
				<td><a href="play.kosta?query=list">
				List</a></td>
			</tr>
			
		</table>
	</div>
</body>
</html>