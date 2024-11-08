/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongminhhungdao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import truongminhhungbean.NhanVienBean;

/**
 *
 * @author Admin
 */
public class NhanVienDao {
    public NhanVienBean dangNhap(String manvien, String mk){
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            String sql = "select * from NhanVien \n" +
                           "where NhanVien.MaNhanVien = ? and NhanVien.MatKhau = ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, manvien);
            cmd.setString(2, mk);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                String MaNhanVien = rs.getString("MaNhanVien");
                String HoTen = rs.getString("HoTen");
                String DiaChi = rs.getString("DiaChi");
                Double Luong = rs.getDouble("Luong");
                String MatKhau = rs.getString("MatKhau");
                String MaPhongBan = rs.getString("MaPhongBan");
                return new NhanVienBean(MaNhanVien, HoTen, DiaChi, Luong, MatKhau, MaPhongBan);
            }
            rs.close();
            kn.cn.close();
        } catch (Exception e) {
            e.printStackTrace();    
        }
        return null;
    }
    
    public ArrayList<NhanVienBean> timKiemNhanVien(String key){
        ArrayList<NhanVienBean> ds = new ArrayList<>();
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            String sql = "select * from NhanVien join PhongBan\n" +
                        "on NhanVien.MaPhongBan = PhongBan.MaPhongBan\n" +
                        "where NhanVien.HoTen like ? or PhongBan.TenPhongBan like ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, "%"+key+"%");
            cmd.setString(2, "%"+key+"%");
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                String MaNhanVien = rs.getString("MaNhanVien");
                String HoTen = rs.getString("HoTen");
                String DiaChi = rs.getString("DiaChi");
                Double Luong = rs.getDouble("Luong");
                String MatKhau = rs.getString("MatKhau");
                String MaPhongBan = rs.getString("MaPhongBan");
                ds.add(new NhanVienBean(MaNhanVien, HoTen, DiaChi, Luong, MatKhau, MaPhongBan));
            }
            rs.close();
            kn.cn.close();
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<NhanVienBean> getNVByML(String ml){
        ArrayList<NhanVienBean> ds = new ArrayList<>();
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            String sql = "select * from NhanVien where MaPhongBan = ?";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, ml);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                String MaNhanVien = rs.getString("MaNhanVien");
                String HoTen = rs.getString("HoTen");
                String DiaChi = rs.getString("DiaChi");
                Double Luong = rs.getDouble("Luong");
                String MatKhau = rs.getString("MatKhau");
                String MaPhongBan = rs.getString("MaPhongBan");
                ds.add(new NhanVienBean(MaNhanVien, HoTen, DiaChi, Luong, MatKhau, MaPhongBan));
            }
            rs.close();
            kn.cn.close();
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<NhanVienBean> getNV(){
        ArrayList<NhanVienBean> ds = new ArrayList<>();
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
            String sql = "select * from NhanVien";
            PreparedStatement cmd = null;
            cmd = kn.cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                String MaNhanVien = rs.getString("MaNhanVien");
                String HoTen = rs.getString("HoTen");
                String DiaChi = rs.getString("DiaChi");
                Double Luong = rs.getDouble("Luong");
                String MatKhau = rs.getString("MatKhau");
                String MaPhongBan = rs.getString("MaPhongBan");
                ds.add(new NhanVienBean(MaNhanVien, HoTen, DiaChi, Luong, MatKhau, MaPhongBan));
            }
            rs.close();
            kn.cn.close();
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        NhanVienDao n = new NhanVienDao();
        ArrayList<NhanVienBean> ls = n.timKiemNhanVien("Biên Phòng");
        for(NhanVienBean nv : ls){
            System.out.println(nv);
        }
    }
}
