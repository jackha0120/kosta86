<%-- 
    Document   : ex3_aJaxData
    Created on : 2014. 9. 19, ���� 4:44:20
    Author     : kosta
--%>

<%@page import="ex1.Ex3_Girl"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    String code = request.getParameter("groupName");
    // ��ü���� 
    Ex3_Girl girl = new Ex3_Girl();
    // �޼��� ȣ���� �ش� code�� ���� �����͸� ���ڿ��� ��ȯ ����
    String[] gg = girl.getGirlGroup(code);
    System.out.println(gg.length);
%><option>����</option>
<% for (String e : gg) {%>
<option><%=e%></option>
<%}%>
