<%-- 
    Document   : ex3_ajaxImgData
    Created on : 2014. 9. 19, ���� 5:08:09
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    request.setCharacterEncoding("euc-kr");
    String gname = request.getParameter("gname");
    gname = gname.trim();
    System.out.println("GName : " + gname);
    //"����","�츮","����","�̶�"
    String imgName = "";
    if (gname.equals("����")) {
        imgName = "Images/girlImg/ura.jpg";
    } else if (gname.equals("����")) {
        imgName = "Images/girlImg/heri.jpg";
    } else if (gname.equals("����")) {
        imgName = "Images/girlImg/sojin.jpg";
    } else if (gname.equals("�̶�")) {
        imgName = "Images/girlImg/mina.jpg";
        //"����","����","ȿ��","����"","ť��,"�ҿ�"
    } else if (gname.equals("����")) {
        imgName = "Images/taraImg/boram.jpg";
    } else if (gname.equals("����")) {
        imgName = "Images/taraImg/jiyun.jpg";
    } else if (gname.equals("ȿ��")) {
        imgName = "Images/taraImg/hymin.jpg";
    } else if (gname.equals("����")) {
        imgName = "Images/taraImg/unjung.jpg";
    } else if (gname.equals("�ҿ�")) {
        imgName = "Images/taraImg/soyun.jpg";
    }
%><%=imgName%>
