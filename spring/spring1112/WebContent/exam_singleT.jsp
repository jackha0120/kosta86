<%@page
	import="com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single"%>
<%@page import="exam.Singleton"%>
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
				"exam/exam_Singleton.xml");
		Singleton st = ctx.getBean("single", Singleton.class);
		Singleton st1 = ctx.getBean("single", Singleton.class);
		// spring con에 있는 싱글톤 레지스터리 때문에 같다
		if(st == st1){
			System.out.println("주소가 같다");
		}else{
			System.out.println("주소가 다름");
		}
	%>
</body>
</html>