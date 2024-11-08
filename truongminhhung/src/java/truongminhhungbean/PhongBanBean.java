/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongminhhungbean;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class PhongBanBean implements Serializable{
    private String MaPhongBan;
    private String TenPhongBan;

    public PhongBanBean() {
    }

    public PhongBanBean(String MaPhongBan, String TenPhongBan) {
        this.MaPhongBan = MaPhongBan;
        this.TenPhongBan = TenPhongBan;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getTenPhongBan() {
        return TenPhongBan;
    }

    public void setTenPhongBan(String TenPhongBan) {
        this.TenPhongBan = TenPhongBan;
    }

    @Override
    public String toString() {
        return "PhongBanBean{" + "MaPhongBan=" + MaPhongBan + ", TenPhongBan=" + TenPhongBan + '}';
    }
    
}
