/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongminhhungdao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import truongminhhungbean.ThongKeBean;

/**
 *
 * @author Admin
 */
public class ThongKeDao {
    public ArrayList<ThongKeBean> thongKeTrungBinhLuong() throws Exception{
        ArrayList<ThongKeBean> ds = new ArrayList<>();
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            String sql = "select PhongBan.MaPhongBan, PhongBan.TenPhongBan , AVG(NhanVien.Luong) as TrungBinhLuong\n" +
                "from PhongBan left join NhanVien\n" +
                "on PhongBan.MaPhongBan = NhanVien.MaPhongBan\n" +
                "group by PhongBan.MaPhongBan, PhongBan.TenPhongBan";
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                String MaPhongBan = rs.getString("MaPhongBan");
                String TenPhongBan = rs.getString("TenPhongBan");
                Double TrungBinhLuong = rs.getDouble("TrungBinhLuong");
                ds.add(new ThongKeBean(MaPhongBan, TenPhongBan, TrungBinhLuong));
            }
            rs.close();
            kn.cn.close();
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
}
