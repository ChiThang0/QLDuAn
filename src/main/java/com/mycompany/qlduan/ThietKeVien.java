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
public class ThietKeVien extends NhanVien{
    private double bounus;

    
    public ThietKeVien() {
        super();
    }
    
    public ThietKeVien(String hoTenNV, String Email, String gioiTinh, PhongBan phongBan, double luongCoBan, double heSoLuong, double bounus) {
        super(hoTenNV, Email, gioiTinh, phongBan, luongCoBan, heSoLuong);
        this.bounus = bounus;
    }
    
    @Override
    public void nhapNv() {
        super.nhapNv(); 
        System.out.print(", Bounus: ");
        bounus = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public double tinhLuong(){
        return super.tinhLuong()+ this.bounus;
    }
    
    @Override
    public String toString() {
        String n = super.toString().concat(", Bounus: "+ bounus);
        return n;
    }
    
    public double getBounus() {
        return bounus;
    }

    public void setBounus(double bounus) {
        this.bounus = bounus;
    }
}
