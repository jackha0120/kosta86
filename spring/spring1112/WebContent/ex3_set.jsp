<%@page import="java.util.Set"%>
<%@page import="ex1.SetType"%>
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
				"ex1/set.xml");
		SetType st = ctx.getBean("s1", SetType.class);
		Set<Integer> set = st.getSet();
		for (Integer e : set) {
			out.println(e + "<br/>");
		}
	%>
</body>
</html>