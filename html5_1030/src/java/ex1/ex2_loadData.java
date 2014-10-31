/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kosta
 */
public class ex2_loadData extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 브라우저에게 보일 인코딩
        response.setContentType("text/html;charset=UTF-8");
        // 요청을 처리할 인코딩
        request.setCharacterEncoding("euc-kr");
        // 클라이언트로 부터 전송 되어온 파라미터 처리
        String n = request.getParameter("num");
        System.out.println("Num : " + n);
        // 데이터 분석 response

        try (PrintWriter out = response.getWriter()) {

            if (n.equals("Click1")) {
                String[] sub = {"Java", "Oracle", "JQuery", "Spring",
                    "SenchaTouch", "Ajax"};
                for (String e : sub) {
                    out.println("<li>");
                    out.println(e);
                    out.println("</li>");
                }
            } else {
                String[] sub = {"자바", "오라클", "제이쿼리", "스프링",
                    "센차터치", "에이젝스"};
                for (String e : sub) {
                    out.println("<li>");
                    out.println(e);
                    out.println("</li>");
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
