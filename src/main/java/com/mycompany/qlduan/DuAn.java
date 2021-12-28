/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlduan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DuAn {

    public static final Scanner sc = new Scanner(System.in);
    public static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem = 0;
    private String maDA;
    private String tenDA;
    private Date thoiGianBatDau;
    private Date thoiGianKetThuc;
    private long tongKinhPhi;
    private NhanVien chuNhiemDA;
    private List<NhanVien> dsNhanVien = new ArrayList<>();

    {
        ++dem;
        this.maDA = String.format("DA%03d", dem);
    }

    public DuAn() {
    }

    public DuAn(String tenDA, Date timeBatDau, Date timeKetThuc, long tongKinhPhi, NhanVien chuNhiemDA, List<NhanVien> dsNhanVien) {
        this.tenDA = tenDA;
        this.thoiGianBatDau = timeBatDau;
        this.thoiGianKetThuc = timeKetThuc;
        this.tongKinhPhi = tongKinhPhi;
        this.chuNhiemDA = chuNhiemDA;
        this.dsNhanVien = dsNhanVien;
    }

    public DuAn(String tenDA, Date timeBatDau, Date timeKetThuc, long tongKinhPhi) {
        this.tenDA = tenDA;
        this.thoiGianBatDau = timeBatDau;
        this.thoiGianKetThuc = timeKetThuc;
        this.tongKinhPhi = tongKinhPhi;
    }

    public DuAn(String tenDA, String timeBatDau, String timeKetThuc, long tongKinhPhi) {
        this.tenDA = tenDA;
        try {
            this.thoiGianBatDau = format.parse(timeBatDau);
        } catch (ParseException ex) {
            System.out.println("Loi nhap thoi gian bat dau khong chinh xac (dd/MM/yyyy)");
        }
        try {
            this.thoiGianKetThuc = format.parse(timeKetThuc);
        } catch (ParseException ex) {
            System.out.println("Loi nhap thoi gian ket thuc khong chinh xac (dd/MM/yyyy)");
        }
        this.tongKinhPhi = tongKinhPhi;
    }

    public void themNVDuAn(NhanVien nv) {
        this.dsNhanVien.add(nv);
    }

    public void ganChuNhiemDa(NhanVien nv) {
        this.chuNhiemDA = nv;
    }

    public void nhapDA() {
        System.out.println("Ten Du An: ");
        this.tenDA = sc.nextLine();
        System.out.println("Thoi gian bat dau (dd/MM/yyyy): ");
        try {
            this.thoiGianBatDau = format.parse(sc.nextLine());
        } catch (ParseException ex) {
            System.out.println("Loi nhap thoi gian bat dau khong chinh xac (dd/MM/yyyy)");
        }
        System.out.println("Thoi gian ket thuc (dd/MM/yyyy): ");
        try {
            this.thoiGianKetThuc = format.parse(sc.nextLine());
        } catch (ParseException ex) {
            System.out.println("Loi nhap thoi gian ket thuc khong chinh xac (dd/MM/yyyy)");
        }
        System.out.println("Tong kinh phi: ");
        try {
            this.tongKinhPhi = Long.parseLong(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Loi Nhap khong dung dinh dang la so");
        }
        
        
    }

    public void suaDa() {
        System.out.println("Ten Du An: ");
        setTenDA(sc.nextLine());
        System.out.println("Thoi gian bat dau: ");
        try {
            setThoiGianBatDau(format.parse(sc.nextLine()));
        } catch (ParseException ex) {
            System.out.println("Loi nhap thoi gian bat dau khong chinh xac (dd/MM/yyyy)\n");
        }
        System.out.println("Thoi gian ket thuc: ");
        try {
            setThoiGianKetThuc(format.parse(sc.nextLine()));
        } catch (ParseException ex) {
            System.out.println("Loi nhap thoi gian ket thuc khong chinh xac (dd/MM/yyyy)\n");
        }
        System.out.println("Tong kinh phi: ");
        setTongKinhPhi(Long.parseLong(sc.nextLine()));
    }

    @Override
    public String toString() {
        String s = "ma du an = " + maDA + ", Ten du an = " + tenDA + ", Thoi gian bat dau = " + format.format(thoiGianBatDau) + ", Thoi gian ket thuc = " + format.format(thoiGianKetThuc) + ", Tong kinh phi = " + tongKinhPhi + "\n";
        if (chuNhiemDA != null) {
            s.concat("Chu nhiem DA: " + chuNhiemDA.toString() + "\n");
        }
        return s;
    }

    /**
     * @return the maDA
     */
    public String getMaDA() {
        return maDA;
    }

    /**
     * @param maDA the maDA to set
     */
    public void setMaDA(String maDA) {
        this.maDA = maDA;
    }

    /**
     * @return the tenDA
     */
    public String getTenDA() {
        return tenDA;
    }

    /**
     * @param tenDA the tenDA to set
     */
    public void setTenDA(String tenDA) {
        this.tenDA = tenDA;
    }

    /**
     * @return the thoiGianBatDau
     */
    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    /**
     * @param thoiGianBatDau the thoiGianBatDau to set
     */
    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    /**
     * @return the thoiGianKetThuc
     */
    public Date getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    /**
     * @param thoiGianKetThuc the thoiGianKetThuc to set
     */
    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    /**
     * @return the tongKinhPhi
     */
    public long getTongKinhPhi() {
        return tongKinhPhi;
    }

    /**
     * @param tongKinhPhi the tongKinhPhi to set
     */
    public void setTongKinhPhi(long tongKinhPhi) {
        this.tongKinhPhi = tongKinhPhi;
    }

    /**
     * @return the chuNhiemDA
     */
    public NhanVien getChuNhiemDA() {
        return chuNhiemDA;
    }

    /**
     * @param chuNhiemDA the chuNhiemDA to set
     */
    public void setChuNhiemDA(NhanVien chuNhiemDA) {
        this.chuNhiemDA = chuNhiemDA;
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
