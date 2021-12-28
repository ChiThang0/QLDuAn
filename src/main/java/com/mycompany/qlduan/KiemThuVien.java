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
public class KiemThuVien extends NhanVien{
    private int error;
    public static final int ERROR_PRICE = 200000;

    public KiemThuVien() {
        super();
    }

    public KiemThuVien(String hoTenNV, String Email, String gioiTinh, PhongBan phongBan, double luongCoBan, double heSoLuong, int error) {
        super(hoTenNV, Email, gioiTinh, phongBan, luongCoBan, heSoLuong);
        this.error = error;
    }
    
    @Override
    public void nhapNv(){
        super.nhapNv();
        System.out.print(", So luong Error: ");
        this.error = Integer.parseInt(sc.nextLine());
    }

    @Override
    public double tinhLuong(){
        return super.tinhLuong() + this.error * ERROR_PRICE;
    }
    
    @Override
    public String toString() {
        String n = super.toString().concat(", So luong Error: " + error);
        return n;
    }
    
    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
}
