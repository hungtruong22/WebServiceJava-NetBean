/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dichvu.NhanVienBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "dangnhapController", urlPatterns = {"/dangnhapController"})
public class dangnhapController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8"); // client gửi data lên server bằng utf-8
            response.setCharacterEncoding("utf-8");
            try{
                 
                String manv = request.getParameter("mavn");
                String mk = request.getParameter("matkhau");
                if(manv != null && mk != null){
                    NhanVienBean tk = dangNhap(manv, mk);
                    if(tk != null){
                        HttpSession session=request.getSession();
			  session.setAttribute("dn", tk);
                        RequestDispatcher rd = request.getRequestDispatcher("hienthicontroller");
                        rd.forward(request, response);
                    }
                    else{
                        request.setAttribute("thongbaoloi", "Sai tên đăng nhập hoặc mật khẩu!");
			 RequestDispatcher rd = request.getRequestDispatcher("dangnhap.jsp");
                         rd.forward(request, response);
                    }
                }else{
                    RequestDispatcher rd = request.getRequestDispatcher("dangnhap.jsp");
            rd.forward(request, response);
                }
            }catch(Exception e){
                e.printStackTrace();
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

    private static NhanVienBean dangNhap(java.lang.String arg0, java.lang.String arg1) {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.dangNhap(arg0, arg1);
    }

}
