/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "hienthicontroller", urlPatterns = {"/hienthicontroller"})
public class hienthicontroller extends HttpServlet {

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
        request.setCharacterEncoding("utf-8"); // client gửi data lên server bằng utf-8
            response.setCharacterEncoding("utf-8");
            try {
            String key = request.getParameter("txttk");
            String mpb = request.getParameter("mpb");
            List<dichvu.NhanVienBean> dsnv = getNV();
            List<dichvu.PhongBanBean> dspb = getPB();
            if(key != null){
                dsnv = (List<dichvu.NhanVienBean>) timKiemNhanVien(key);
            }
            if(mpb != null){
                dsnv = (List<dichvu.NhanVienBean>) getNVByML(mpb);
            }
            System.out.println(dsnv.size());
            request.setAttribute("dsnv", dsnv);
            request.setAttribute("dspb", dspb);
            
            RequestDispatcher rd = request.getRequestDispatcher("hienthi.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
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

    private static java.util.List<dichvu.NhanVienBean> getNVByML(java.lang.String arg0) {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.getNVByML(arg0);
    }

    private static java.util.List<dichvu.PhongBanBean> getPB() {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.getPB();
    }

    private static java.util.List<dichvu.NhanVienBean> timKiemNhanVien(java.lang.String key) {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.timKiemNhanVien(key);
    }

    private static java.util.List<dichvu.NhanVienBean> getNV() {
        dichvu.DichVu_Service service = new dichvu.DichVu_Service();
        dichvu.DichVu port = service.getDichVuPort();
        return port.getNV();
    }

    

}
