/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlduan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<DuAn> listDa = new ArrayList<>();
        QLDA qlda = new QLDA();
        List<NhanVien> listNv = new ArrayList<>();
        QLNV qlnv = new QLNV();

        PhongBan pb1 = new PhongBan("Phong DTL");

        DuAn da1 = new DuAn();
        System.out.println("nhap DA");
        da1.nhapDA();
        System.out.println("xuat");
        System.out.println(da1.toString());

//        NhanVien nv1 = new LapTrinhVien("Nguyen van A", "A@gmail.com", "Nam", pb1, 100000, 1.5, 500000);
//        NhanVien nv2 = new KiemThuVien("Nguyen Thi B", "B@mail.com", "Nu", pb1, 100000, 1.2, 10);
//        NhanVien nv3 = new ThietKeVien("Nguyen Thi C", "C@mail.com", "Nu", pb1, 100000, 1.3, 1500);
//
//        DuAn da1 = new DuAn("MoMo", "12/12/2021", "12/12/2022", 1000000000);
//        DuAn da2 = new DuAn("MiNi", "21/05/2022", "21/08/2022", 500000000);
//        DuAn da3 = new DuAn("MeMe", "10/10/2022", "22/12/2022", 1500000000);
//        qlda.themDuAn(da1);
//        qlda.themDuAn(da2);
//        qlda.themDuAn(da3);
//        //qlda.xoaDuAn(da3);
//        qlnv.themNv(nv1);
//        qlnv.themNv(nv2);
//        qlnv.themNv(nv3);
//
//        da1.themNVDuAn(nv1);
//        da1.themNVDuAn(nv2);
//        da2.themNVDuAn(nv3);
//
//        nv1.themDAThamGia(da1);
//        nv1.themDAThamGia(da2);
//        nv2.themDAThamGia(da1);
//        nv3.themDAThamGia(da1);
//        nv3.themDAThamGia(da2);
//        nv3.themDAThamGia(da3);
//        
//        System.out.println(qlda.toString());
//        System.out.println("tim kiem du an theo ten hoac thoi gian bat dau du an: ");
//        for (DuAn duAn : qlda.timKiem(sc.nextLine())) {
//            System.out.println(duAn.toString());
//        }
//        System.out.println(qlda.toString());
//        qlda.suaDa(da2);
//        System.out.println(da2.toString());
//        System.out.println(qlnv.toString());
//        System.out.println("Nhap ma Nv de tim danh sach du an tham gia");
//        
//        for (DuAn duAn : qlnv.timListDuAn(sc.nextLine())) {
//            System.out.println(duAn.toString());
//        }
//        
//        System.out.println(qlda.toString());
//        System.out.println("Nhap ma Du An de tim danh sach Nhan Vien tham gia");
//        for (NhanVien nhanVien : qlda.xemListNV(sc.nextLine())) {
//            System.out.println(nhanVien.toString());
    }

}
