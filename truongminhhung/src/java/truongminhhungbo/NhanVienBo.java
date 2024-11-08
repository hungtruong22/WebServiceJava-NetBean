/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongminhhungbo;

import java.util.ArrayList;
import truongminhhungbean.NhanVienBean;
import truongminhhungdao.NhanVienDao;

/**
 *
 * @author Admin
 */
public class NhanVienBo {
   NhanVienDao nvdao = new NhanVienDao();
   public NhanVienBean dangNhap(String manv, String mk){
       return nvdao.dangNhap(manv, mk);
   }
   public ArrayList<NhanVienBean> timKiemNhanVien(String key){
       return nvdao.timKiemNhanVien(key);
   }
   public ArrayList<NhanVienBean> getNVByML(String ml){
       return nvdao.getNVByML(ml);
   }
   public ArrayList<NhanVienBean> getNV(){
       return nvdao.getNV();
   }
}
