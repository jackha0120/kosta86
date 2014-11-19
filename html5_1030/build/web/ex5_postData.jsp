<%-- 
    Document   : ex5_postData
    Created on : 2014. 10. 30, 오후 3:18:27
    Author     : kosta
--%>

<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    String idv = request.getParameter("id");
    DriverManager = "Oracle.j"
    String msg = "";
    if (idv.equals("bigdaddy")) {
        msg = idv + "는 이미 존재하는 아이디 입니다.";
    } else {
        msg = idv + "는 사용이 가능한 아이디 입니다.";
    }
%><%=msg%>