<%-- 
    Document   : ex5_postData
    Created on : 2014. 10. 30, ���� 3:18:27
    Author     : kosta
--%>

<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    String idv = request.getParameter("id");
    DriverManager = "Oracle.j"
    String msg = "";
    if (idv.equals("bigdaddy")) {
        msg = idv + "�� �̹� �����ϴ� ���̵� �Դϴ�.";
    } else {
        msg = idv + "�� ����� ������ ���̵� �Դϴ�.";
    }
%><%=msg%>