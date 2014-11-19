<%@page import="org.springframework.aop.framework.ProxyFactoryBean"%>
<%@page import="vo.MJoinVO"%>
<%@page import="dao.DaoService"%>
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
				"config/config.xml");
		//일반적인 JDBC테스트
		// 		DaoService dsv = ctx.getBean("dao", DaoService.class);
		MJoinVO vo = new MJoinVO();
		vo.setId("koko");
		vo.setName("aa");
		vo.setPwd("aa");
		vo.setInfo("okok");
		// 		dsv.transactionTest(vo);
		//ProxyFactoryBean에게 트랜잭션을 처리 하도록 호출

		ProxyFactoryBean txp = (ProxyFactoryBean) ctx.getBean("&service");
		DaoService sv = (DaoService) txp.getObject();
		sv.transactionTest(vo);
	%>
</body>
</html>