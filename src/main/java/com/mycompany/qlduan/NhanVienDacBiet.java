/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlduan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienDacBiet extends NhanVien{
    private PhongBan banQL1;
    private PhongBan banQL2;
    private Date ngayNhamChuc1;
    private Date ngayNhamChuc2;

    public NhanVienDacBiet() {
    }

    public NhanVienDacBiet(PhongBan banQL1, PhongBan banQL2, Date ngayNhamChuc1, Date ngayNhamChuc2) {
        this.banQL1 = banQL1;
        this.banQL2 = banQL2;
        this.ngayNhamChuc1 = ngayNhamChuc1;
        this.ngayNhamChuc2 = ngayNhamChuc2;
    }

    public NhanVienDacBiet(PhongBan banQL1, PhongBan banQL2, Date ngayNhamChuc1, Date ngayNhamChuc2, String hoTenNV, String email, String gioiTinh, PhongBan phongBan, double luongCoBan, double heSoLuong) {
        super(hoTenNV, email, gioiTinh, phongBan, luongCoBan, heSoLuong);
        this.banQL1 = banQL1;
        this.banQL2 = banQL2;
        this.ngayNhamChuc1 = ngayNhamChuc1;
        this.ngayNhamChuc2 = ngayNhamChuc2;
    }
    
    @Override
    public void nhapNv(){
        super.nhapNv();
    }
    
    @Override
    public double tinhLuong(){
        return super.tinhLuong();
    }
    public String toString(){
        return super.toString();
    }
    
    public PhongBan getBanQL1() {
        return banQL1;
    }

    public void setBanQL1(PhongBan banQL1) {
        this.banQL1 = banQL1;
    }

    public PhongBan getBanQL2() {
        return banQL2;
    }

    public void setBanQL2(PhongBan banQL2) {
        this.banQL2 = banQL2;
    }

    public Date getNgayNhamChuc1() {
        return ngayNhamChuc1;
    }

    public void setNgayNhamChuc1(Date ngayNhamChuc1) {
        this.ngayNhamChuc1 = ngayNhamChuc1;
    }

    public Date getNgayNhamChuc2() {
        return ngayNhamChuc2;
    }

    public void setNgayNhamChuc2(Date ngayNhamChuc2) {
        this.ngayNhamChuc2 = ngayNhamChuc2;
    }
}
