<%@page import="ex1.PropertiesType"%>
<%@page
	import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"ex1/prop.xml");
		PropertiesType pt = ctx.getBean("myProp", PropertiesType.class);
	%>
	<!-- 값을 받아오기 위해서 key값을 사용해야한다. -->
	관리자 Email :
	<%=pt.getProp().getProperty("admin_email")%><br />
	<a href="<%=pt.getProp().getProperty("jobSite")%>">WebSite</a>
</body>
</html>