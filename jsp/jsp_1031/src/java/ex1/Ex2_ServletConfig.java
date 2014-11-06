/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kosta
 */
@WebServlet(name = "Ex2_ServletConfig", urlPatterns = {"/Ex2_ServletConfig"})
public class Ex2_ServletConfig extends HttpServlet {

    private String admin_id, test_id, address;
    // 핵심 : ServletContext는 모든 어플리케이션에서 사용되는 범위
    //ServletConfig 는 설정된 서블릿 에서만 유효하다

    @Override
    public void init() throws ServletException {
        // int-param으로 등록한 내용은 ServletConfig에 저장된다
        admin_id = getServletConfig().getInitParameter("admin_id");
        test_id = getServletContext().getInitParameter("admin_id");
        // context-param 으로 등록한 내용은 ServletContext 에 저장된다
        address = getServletContext().getInitParameter("address");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // PrintWriter : 브릿지 스트림이 필요없음 -> 바이트 스트림을 바로 적용
        // autoflush기능 -> 버퍼를 비워주는 기능
        // 2차 문자스트림!
        resp.setContentType("text/html;charset=euc-kr");
        PrintWriter out = resp.getWriter(); // 스트림
        out.println("Admin ServletConfig : " + admin_id + "<br/>");
        out.println("Admin Test : " + test_id + "<br/>");
        out.println("Address : " + address + "입니다.<br/>");
    }

}
