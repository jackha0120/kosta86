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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kosta
 */
public class Ex2_ServletContext extends HttpServlet {

    private String admin_id, test_id;

    @Override
    public void init() throws ServletException {
        admin_id = getServletConfig().getInitParameter("admin_id");
        test_id = getServletContext().getInitParameter("admin_id");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // PrintWriter : 브릿지 스트림이 필요없음 -> 바이트 스트림을 바로 적용
        // autoflush기능 -> 버퍼를 비워주는 기능
        // 2차 문자스트림!
        PrintWriter out = resp.getWriter(); // 스트림
        out.println("Admin ServletConfig : " + admin_id);
        out.println("Admin Test : " + test_id);

    }
}
