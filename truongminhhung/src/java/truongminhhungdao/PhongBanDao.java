/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongminhhungdao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import truongminhhungbean.PhongBanBean;

/**
 *
 * @author Admin
 */
public class PhongBanDao {
    public ArrayList<PhongBanBean> getPB(){
        ArrayList<PhongBanBean> ds = new ArrayList<>();
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            String sql = "select * from PhongBan";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                String MaPhongBan = rs.getString("MaPhongBan");
                String TenPhongBan = rs.getString("TenPhongBan");
                ds.add(new PhongBanBean(MaPhongBan, TenPhongBan));
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
