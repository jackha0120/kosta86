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
        // PrintWriter : �긴�� ��Ʈ���� �ʿ���� -> ����Ʈ ��Ʈ���� �ٷ� ����
        // autoflush��� -> ���۸� ����ִ� ���
        // 2�� ���ڽ�Ʈ��!
        PrintWriter out = resp.getWriter(); // ��Ʈ��
        out.println("Admin ServletConfig : " + admin_id);
        out.println("Admin Test : " + test_id);

    }
}
