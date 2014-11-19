<%-- 
    Document   : ex3_ajaxImgData
    Created on : 2014. 9. 19, 오후 5:08:09
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    request.setCharacterEncoding("euc-kr");
    String gname = request.getParameter("gname");
    gname = gname.trim();
    System.out.println("GName : " + gname);
    //"유라","헤리","소진","미라"
    String imgName = "";
    if (gname.equals("유라")) {
        imgName = "Images/girlImg/ura.jpg";
    } else if (gname.equals("혜리")) {
        imgName = "Images/girlImg/heri.jpg";
    } else if (gname.equals("소진")) {
        imgName = "Images/girlImg/sojin.jpg";
    } else if (gname.equals("미라")) {
        imgName = "Images/girlImg/mina.jpg";
        //"보람","지연","효민","은정"","큐리,"소연"
    } else if (gname.equals("보람")) {
        imgName = "Images/taraImg/boram.jpg";
    } else if (gname.equals("지연")) {
        imgName = "Images/taraImg/jiyun.jpg";
    } else if (gname.equals("효민")) {
        imgName = "Images/taraImg/hymin.jpg";
    } else if (gname.equals("은정")) {
        imgName = "Images/taraImg/unjung.jpg";
    } else if (gname.equals("소연")) {
        imgName = "Images/taraImg/soyun.jpg";
    }
%><%=imgName%>
