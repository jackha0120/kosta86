<%@page import="exam.OrderSystem"%>
<%@page
	import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
%>
<jsp:useBean id="vo" class="exam.OrderVO" />
<jsp:setProperty property="*" name="vo" />
<%
	ApplicationContext ctx = new GenericXmlApplicationContext(
			"exam/menu.xml");
	OrderSystem os = ctx.getBean("menuPrint", OrderSystem.class);
	String res = os.printMenu(vo);
%>
<%=res%>