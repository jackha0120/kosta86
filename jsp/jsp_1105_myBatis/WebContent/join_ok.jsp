<%@page import="dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<%-- JSP UserBean 액션태그를 사용하면 beans에 파라미터와 같은 데이터를 넣기가 편해진다. --%>
<%
	request.setCharacterEncoding("euc-kr");
%>
<%-- MjoinVO vo = new MjoinVO() 와 같다. --%>
<jsp:useBean id="vo" class="vo.MjoinVO"></jsp:useBean>
<%-- 폼에서 넘어오는 파라미터의 이름이 vo객체의 property와 동일할 때 축약형을 사용해서 빠른 작업으로 구현할 수 있다. --%>
<jsp:setProperty property="*" name="vo" />
<%-- setter : vo.setId(request.getParameter("id");--%>
<%--
<jsp:setProperty property="id" name="vo" param="id" />
<jsp:setProperty property="pwd" name="vo" param="pwd" />
<jsp:setProperty property="name" name="vo" param="name" />
<jsp:setProperty property="info" name="vo" param="info" />
 --%>
<script>
	$(document).ready(function() {
<%
	//Dao에 addJoin메서드를 호출할 때 저장된 vo의 주소를 인자로 전달
	boolean flag = JoinDao.getDao().addJoin(vo);
	if (flag) {
%>
			$('#welcomeID').val('<%=vo.getId()%>');
			$('#status').val('ok');
			
<%
	} else {
%>
			$('#welcomeID').val('none');
			$('#status').val('no');
<%
	}
%>
	$('form').submit();
	});
</script>
<form method="post" action="welcome.jsp">
	<input type="hidden" name="welcomeID" id="welcomeID"> 
	<input type="hidden" name="status" id="status">
</form>