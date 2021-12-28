/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlduan;

import static com.mycompany.qlduan.DuAn.sc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private static int dem = 0;
    private String maNV;
    private String hoTenNV;
    private String email;
    private String gioiTinh;
    private PhongBan phongBan;
    private double luongCoBan;
    private double heSoLuong;
    private List<DuAn> dsDA;
    
    {
        ++dem;
        this.maNV = String.format("NV%03d", dem);
        dsDA = new ArrayList<>();
    }

    public NhanVien() {
    }

    public NhanVien(String hoTenNV, String email, String gioiTinh, PhongBan phongBan, double luongCoBan, double heSoLuong, List<DuAn> dsDA) {
        this.hoTenNV = hoTenNV;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.phongBan = phongBan;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.dsDA = dsDA;
    }
    
    public NhanVien(String hoTenNV, String email, String gioiTinh, PhongBan phongBan, double luongCoBan, double heSoLuong) {        
        this.hoTenNV = hoTenNV;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.phongBan = phongBan;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }
    
    public void nhapNv(){
        System.out.println("Ho Ten Nhan Vien: ");
        this.hoTenNV = sc.nextLine();
        System.out.println("Email: ");
        this.email = sc.nextLine();
        System.out.println("Gioi Tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.println("Luong Co Ban: ");
        this.luongCoBan = Double.parseDouble(sc.nextLine());
        System.out.println("He so Luong: ");
        this.heSoLuong = Double.parseDouble(sc.nextLine());
    }
    
    public void themDAThamGia(DuAn da){
        this.dsDA.add(da);
    }
    
    public void ganPhongBan(PhongBan pb){
        this.phongBan = pb;
    }
    
    public double tinhLuong(){
        return luongCoBan * heSoLuong;
    }

    @Override
    public String toString() {
        
        String n = "\nma NV = " + maNV + ", hoTen NV = " + hoTenNV + ", email = " + email + ", gioiTinh = " + gioiTinh + ", Phong Ban = " + phongBan.getTenPhongBan() + ", luongCoBan = " + luongCoBan + ", heSoLuong = " + heSoLuong;
        return n;
    }
    
    public static int getDem() {
        return dem;
    }
    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public List<DuAn> getDsDA() {
        return dsDA;
    }

    public void setDsDA(List<DuAn> dsDA) {
        this.dsDA = dsDA;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }
    
    
    
}
