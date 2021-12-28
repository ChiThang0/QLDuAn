/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qlduan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLDA {
    public static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private List<DuAn> dsDuAn = new ArrayList<>();

    public QLDA() {
    }

    public QLDA(List<DuAn> dsDuAn) {
        this.dsDuAn = dsDuAn;
    }

    public void themDuAn(DuAn da) {
        this.dsDuAn.add(da);
    }

    public void xoaDuAn(DuAn da) {
        this.dsDuAn.remove(da);
    }

    public void suaDa(DuAn da) {
        try {
            for (DuAn duAn : dsDuAn) {
                if (da.equals(duAn)) {
                    duAn.suaDa();
                }
            }
        } catch (Exception e) {
            System.out.println("Khong tim thay du an can sua");
        }

    }

    public List<NhanVien> xemListNV(String maDa) {
        List<NhanVien> dsTim = new ArrayList<>();
        for (DuAn duAn : dsDuAn) {
            if (maDa.equals(duAn.getMaDA())) {
                dsTim = duAn.getDsNhanVien();
            }
        }
        return dsTim;
    }

    public void sapXepTangKinhPhi() {
        this.dsDuAn.sort((da1, da2) -> {
            return da1.getTongKinhPhi() > da2.getTongKinhPhi() ? 1 : (da1.getTongKinhPhi() < da2.getTongKinhPhi() ? -1 : 0);
        });

    }

    public void sapXepGiamKinhPhi() {
        this.dsDuAn.sort((da1, da2) -> {
            return -(da1.getTongKinhPhi() > da2.getTongKinhPhi() ? 1 : (da1.getTongKinhPhi() < da2.getTongKinhPhi() ? -1 : 0));
        });

    }

    public List<DuAn> timKiem(String name, String date) {
        List<DuAn> dsTimKiem = new ArrayList<>();
        for (DuAn duAn : dsDuAn) {
            if (duAn.getTenDA().contains(name) && date.equalsIgnoreCase(format.format(duAn.getThoiGianBatDau()))) {
                dsTimKiem.add(duAn);
            }
        }
        return dsTimKiem;
    }

    @Override
    public String toString() {
        String ds = "";
        for (DuAn duAn : dsDuAn) {
            ds += duAn.toString();
        }
        return ds;
    }

    public List<DuAn> getDsDuAn() {
        return dsDuAn;
    }

    public void setDsDuAn(List<DuAn> dsDuAn) {
        this.dsDuAn = dsDuAn;
    }
}
