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
public class ThongKeBean implements Serializable{
    private String MaPhongBan;
    private String TenPhongBan;
    private Double TrungBinhLuong;

    public ThongKeBean() {
    }

    public ThongKeBean(String MaPhongBan, String TenPhongBan, Double TrungBinhLuong) {
        this.MaPhongBan = MaPhongBan;
        this.TenPhongBan = TenPhongBan;
        this.TrungBinhLuong = TrungBinhLuong;
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

    public Double getTrungBinhLuong() {
        return TrungBinhLuong;
    }

    public void setTrungBinhLuong(Double TrungBinhLuong) {
        this.TrungBinhLuong = TrungBinhLuong;
    }

    @Override
    public String toString() {
        return "ThongKeBean{" + "MaPhongBan=" + MaPhongBan + ", TenPhongBan=" + TenPhongBan + ", TrungBinhLuong=" + TrungBinhLuong + '}';
    }
    
}
