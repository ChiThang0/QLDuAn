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
public class PhongBan {
    private String tenPhongBan;
    private List<NhanVien> dsNhanVien;
    
    {
        this.dsNhanVien = new ArrayList<>();
    }

    public PhongBan() {
    }

    public PhongBan(String tenPhongBan, List<NhanVien> dsNhanVien) {
        this.tenPhongBan = tenPhongBan;
        this.dsNhanVien = dsNhanVien;
    }
    
    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }
    
    public void NhapPb(){
        System.out.println("Ten Phong Ban:");
        this.tenPhongBan = sc.nextLine();
    }
    
    public void themNVPhongBan(NhanVien nv){
        this.dsNhanVien.add(nv);
    }

    /**
     * @return the tenPhongBan
     */
    public String getTenPhongBan() {
        return tenPhongBan; 
    }

    /**
     * @param tenPhongBan the tenPhongBan to set
     */
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    /**
     * @return the dsNhanVien
     */
    public List<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    /**
     * @param dsNhanVien the dsNhanVien to set
     */
    public void setDsNhanVien(List<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }
    
    
    
}
