package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex3_005fajaxImgData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

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
    } else if (gname.equals("ť��")) {
        imgName = "Images/taraImg/jiyun.jpg";
    } else if (gname.equals("�ҿ�")) {
        imgName = "Images/taraImg/soyun.jpg";
    }

      out.print(imgName);
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
