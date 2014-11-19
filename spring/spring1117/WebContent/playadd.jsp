<%@page import="ex2.Service"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="ex2.PlayMeVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	PlayMeVO v = new PlayMeVO();
	v.setPname(request.getParameter("pname"));
	v.setPrice(Integer.parseInt(request.getParameter("price")));
	v.setUsers(request.getParameter("users"));
	ApplicationContext ctx = 
			new GenericXmlApplicationContext("ex2/jdbc.xml");
	
	Service se = ctx.getBean("jdbcDao", Service.class);
	se.add(v);
	response.sendRedirect("playList.jsp");
%>