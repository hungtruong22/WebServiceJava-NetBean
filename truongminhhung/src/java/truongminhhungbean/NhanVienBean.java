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
public class NhanVienBean implements Serializable{
    private String MaNhanVien;
    private String HoTen;
    private String DiaChi;
    private Double Luong;
    private String MatKhau;
    private String MaPhongBan;

    public NhanVienBean() {
    }

    public NhanVienBean(String MaNhanVien, String HoTen, String DiaChi, Double Luong, String MatKhau, String MaPhongBan) {
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.Luong = Luong;
        this.MatKhau = MatKhau;
        this.MaPhongBan = MaPhongBan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public Double getLuong() {
        return Luong;
    }

    public void setLuong(Double Luong) {
        this.Luong = Luong;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    @Override
    public String toString() {
        return "NhanVienBean{" + "MaNhanVien=" + MaNhanVien + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", Luong=" + Luong + ", MatKhau=" + MatKhau + ", MaPhongBan=" + MaPhongBan + '}';
    }
}
