<%-- 
    Document   : ex4_Data
    Created on : 2014. 10. 30, ���� 2:36:31
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    request.setCharacterEncoding("euc-kr");
    String name = request.getParameter("name");
%>
Hello~~!! <%=name%>�� �ݰ����ϴ�.^^!

