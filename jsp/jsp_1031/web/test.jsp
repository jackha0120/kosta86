<%-- 
    Document   : test
    Created on : 2014. 10. 31, ¿ÀÈÄ 3:23:00
    Author     : kosta
--%>

<%@page import="java.sql.Connection"%>
<%@page import="conn.ConnUtils"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    Connection con = ConnUtils.getConn();
    System.out.println("Log : " + con);
%>