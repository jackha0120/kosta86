<%@page import="ex2.PlayMeVO"%>
<%@page import="java.util.List"%>
<%@page import="ex2.Service"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
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
	<div id="wrap">
		<%
		int num = Integer.parseInt(request.getParameter("num"));
		ApplicationContext ctx =
		new GenericXmlApplicationContext("ex2/jdbc.xml");
		Service se = ctx.getBean("jdbcDao", Service.class);
		PlayMeVO e = se.getView(num);
		%>
		<table>
		
			<tr>
				<td><a href="playDetail.jsp?num=<%=e.getNum()%>">
				<%=e.getPname() %></a></td>
				<td><%=e.getPrice() %></td>
				<td><%=e.getUsers()%></td>
				<td><%=e.getRdate() %></td>
				<td><a href="playList.jsp">
				List</a></td>
			</tr>
			
		</table>
	</div>
</body>
</html>