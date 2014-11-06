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
    // �ٽ� : ServletContext�� ��� ���ø����̼ǿ��� ���Ǵ� ����
    //ServletConfig �� ������ ���� ������ ��ȿ�ϴ�

    @Override
    public void init() throws ServletException {
        // int-param���� ����� ������ ServletConfig�� ����ȴ�
        admin_id = getServletConfig().getInitParameter("admin_id");
        test_id = getServletContext().getInitParameter("admin_id");
        // context-param ���� ����� ������ ServletContext �� ����ȴ�
        address = getServletContext().getInitParameter("address");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // PrintWriter : �긴�� ��Ʈ���� �ʿ���� -> ����Ʈ ��Ʈ���� �ٷ� ����
        // autoflush��� -> ���۸� ����ִ� ���
        // 2�� ���ڽ�Ʈ��!
        resp.setContentType("text/html;charset=euc-kr");
        PrintWriter out = resp.getWriter(); // ��Ʈ��
        out.println("Admin ServletConfig : " + admin_id + "<br/>");
        out.println("Admin Test : " + test_id + "<br/>");
        out.println("Address : " + address + "�Դϴ�.<br/>");
    }

}
