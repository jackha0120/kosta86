package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex2_005fdatalist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html> <!-- 무슨 버전인지 명시해주는 것 html5를 명시-->\n");
      out.write("<!-- html을 먼저 연다 -->\n");
      out.write("<!-- head는 사용자에게 보여지지 않는 정보를 넣어두는 공간-->\n");
      out.write("<!-- body부분이 사용자에게 보여지는 부분-->\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>datalist연습</legend>\n");
      out.write("                <label for=\"ss\">Homepage:</label>\n");
      out.write("                <input type=\"url\" id=\"ss\"\n");
      out.write("                       list=\"s_data\" required>\n");
      out.write("                <datalist id=\"s_data\">\n");
      out.write("                    <!---데이터 루프 영역--->\n");
      out.write("                    <option value=\"http://www.shinhan.com\"\n");
      out.write("                            label=\"신한\"/>\n");
      out.write("                    <option value=\"http://www.naver.com\"\n");
      out.write("                            label=\"네이버\"/>\n");
      out.write("                    <option value=\"http://www.kosta.or.kr\"\n");
      out.write("                            label=\"kosta\"/>\n");
      out.write("                </datalist>\n");
      out.write("                <p><button type=\"submit\">SEND</button></p>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
