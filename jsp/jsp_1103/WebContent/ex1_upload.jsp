<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	// ���� ���ε带 ���ؼ� ���� ������Ʈ�� upload��ġ�� �����´�
	String path = application.getRealPath("/upload");
	System.out.println(path);
	// enctype="multipart/form-data" �ϰ�� �Ϲ����� request�δ� ������ ÷�ε��� ����
	// cos.jar���� MultipartRequest��ü�� ����ؼ� ó���Ѵ�.
	// MultipartRequest(reequest, path, ���� ���۷�, ���ڵ�, ���ϸ�������å)
	MultipartRequest mr = new MultipartRequest(request, path,
			1024 * 1024 * 5, "euc-kr", new DefaultFileRenamePolicy());

	System.out.println("writer :" + mr.getParameter("writer"));
	// �Ѿ�� ������ File��ü�� ����
	File s_file = mr.getFile("s_file");
	System.out.println("file :" + mr.getFile("s_file"));
	String fileUrl = application.getContextPath() + "/upload/"
			+ s_file.getName();
%><img src="<%=fileUrl%>"> / <%=mr.getParameter("writer")%>