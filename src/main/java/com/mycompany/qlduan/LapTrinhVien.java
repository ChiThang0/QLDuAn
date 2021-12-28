/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlduan;

import static com.mycompany.qlduan.DuAn.sc;

/**
 *
 * @author Admin
 */
public class LapTrinhVien extends NhanVien{
    private double luongOT;
    
    public LapTrinhVien() {
        super();
    }
    
    public LapTrinhVien(String hoTenNV, String Email, String gioiTinh, PhongBan phongBan, double luongCoBan, double heSoLuong, double luongOT) {
        super(hoTenNV, Email, gioiTinh, phongBan, luongCoBan, heSoLuong);
        this.luongOT = luongOT;
    }
    
    @Override
    public double tinhLuong(){
        return super.tinhLuong() + this.luongOT;
    }

    @Override
    public void nhapNv() {
        super.nhapNv();
        System.out.print("Luong OT:");
        luongOT = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public String toString() {
        String n = super.toString().concat(", Luong OT: " + luongOT);
        return n;
    }

    public double getLuongOT() {
        return luongOT;
    }

    public void setLuongOT(double luongOT) {
        this.luongOT = luongOT;
    }
}
