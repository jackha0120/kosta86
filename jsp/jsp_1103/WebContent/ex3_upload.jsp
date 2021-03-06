<%@page import="dao.ImgDirDao"%>
<%@page import="vo.ImgDirVO"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	// 파일 업로드를 위해서 현재 프로젝트의 upload위치를 가져온다
	String path = application.getRealPath("/upload");
	System.out.println(path);
	// enctype="multipart/form-data" 일경우 일반적인 request로는 파일이 첨부되지 못함
	// cos.jar에서 MultipartRequest객체를 사용해서 처리한다.
	// MultipartRequest(request, path, 파일 전송량, 인코딩, 파일리네임정책)
	MultipartRequest mr = new MultipartRequest(request, path,
			1024 * 1024 * 5, "euc-kr", new DefaultFileRenamePolicy());

	System.out.println("writer :" + mr.getParameter("writer"));
	// 넘어온 파일을 File객체로 생성
	File s_file = mr.getFile("s_file");
	System.out.println("file :" + s_file.getName());
	String fileUrl = application.getContextPath() + "/upload/"
			+ s_file.getName();

	// 모든 파라미터를 vo객체에 저장
	ImgDirVO v = new ImgDirVO();
	v.setWriter(mr.getParameter("writer"));
	v.setImgpath(s_file.getName());
	//Dao를 생성 - DB와 JSP의 사이에서 작업을 처리해줌
	ImgDirDao.getDao().addImg(v);
	// 이동할 페이지 이동
	response.sendRedirect("ex3_list.jsp");
%><img src="<%=fileUrl%>">
/
<%=mr.getParameter("writer")%><br />
<img src="<%=application.getContextPath()%>/upload/unjung.jpg">
