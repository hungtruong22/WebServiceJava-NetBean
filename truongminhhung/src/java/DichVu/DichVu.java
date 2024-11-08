/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DichVu;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import truongminhhungbean.NhanVienBean;
import truongminhhungbean.PhongBanBean;
import truongminhhungbean.ThongKeBean;
import truongminhhungbo.NhanVienBo;
import truongminhhungbo.PhongBanBo;
import truongminhhungbo.ThongKeBo;
import truongminhhungdao.NhanVienDao;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "DichVu")
public class DichVu {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dangNhap")
    public NhanVienBean dangNhap(String manv, String mk) {
        NhanVienBo nvbo = new NhanVienBo();
        try {
            return nvbo.dangNhap(manv, mk);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNVByML")
    public ArrayList<NhanVienBean> getNVByML(String ml) {
       NhanVienBo nvbo = new NhanVienBo();
        try {
            return nvbo.getNVByML(ml);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "timKiemNhanVien")
    public ArrayList<NhanVienBean> timKiemNhanVien(@WebParam(name = "key") String key) {
        NhanVienBo nvbo = new NhanVienBo();
        try {
            return nvbo.timKiemNhanVien(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPB")
    public ArrayList<PhongBanBean> getPB() {
        PhongBanBo pbo = new PhongBanBo();
        try {
            return pbo.getPB();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "thongKeTrungBinhLuong")
    public ArrayList<ThongKeBean> thongKeTrungBinhLuong() {
        ThongKeBo tbo = new ThongKeBo();
        try {
            return tbo.thongKeTrungBinhLuong();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNV")
    public ArrayList<NhanVienBean> getNV() {
        NhanVienBo nvbo = new NhanVienBo();
        try {
            return nvbo.getNV();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
