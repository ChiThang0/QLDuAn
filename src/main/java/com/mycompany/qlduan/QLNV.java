/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlduan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLNV {
    private List<NhanVien> dsNV;
    
    {
        dsNV = new ArrayList<>();
    }

    public QLNV() {
    }

    public QLNV(List<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }
    
    public void themNv(NhanVien nv){
        this.dsNV.add(nv);
    }
    
    public List<DuAn> timListDuAn(String maNv){
        List<DuAn> list = new ArrayList<>();
        for (NhanVien nhanVien : dsNV) {
            if(maNv.equals(nhanVien.getMaNV())){
                list = nhanVien.getDsDA();
            }
        }
        return list;
    }
    
    // xu ly tim theo phong ban
    public List<NhanVien> timKiem(String dk){
        List<NhanVien> dsTimKiem = new ArrayList<>();
        for (NhanVien nhanVien : dsNV) {
            if(dk.contains(nhanVien.getHoTenNV()) || dk.contains(nhanVien.getPhongBan().getTenPhongBan())){
                dsTimKiem.add(nhanVien);
            }
        }
        return dsTimKiem;
    }
    
    public void tinhLuongNv(){
        for (NhanVien nhanVien : dsNV) {
            String luongNv = nhanVien.toString() + ", Luong: " + nhanVien.tinhLuong();
            System.out.println(luongNv);
        }
    }

    @Override
    public String toString() {
        String ds = "";
        for (NhanVien nhanVien : dsNV) {
            ds += nhanVien.toString();
        }
        return ds;
    }

    public List<NhanVien> getDsNV() {
        return dsNV;
    }

    public void setDsNV(List<NhanVien> dsNV) {
        this.dsNV = dsNV;
    }    
}
