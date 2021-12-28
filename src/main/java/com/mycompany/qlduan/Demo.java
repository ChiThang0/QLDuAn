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
public class Demo {

    public static void main(String[] args) {
        int choiceNumber;
        Scanner scanner = new Scanner(System.in);
        QLDA qlda = new QLDA();
        QLNV qlnv = new QLNV();
        List<PhongBan> listPb = new ArrayList<PhongBan>();
        for(;;) {
            System.out.println("--------------------------------------");
            System.out.println("1. Them Phong Ban");
            System.out.println("2. Them Nhan Vien");
            System.out.println("3. Them Du An");
            System.out.println("4. Sua Du An");
            System.out.println("5. Xoa Du An");
            System.out.println("6. Xem Luong Nhan Vien");
            System.out.println("7. Gan Nhan Vien Cho Du An");
            System.out.println("8. Gan Nguoi Quan Ly Cho Du An");
            System.out.println("9. Tim Kiem Du An");
            System.out.println("10. Tim Kiem Nhan Vien");
            System.out.println("11. Xem Danh Sach Nhan Vien Cua Du An");
            System.out.println("12. Gan Du An Cho Nhan Vien");
            System.out.println("13. Xem Danh Sach Du An Cua Nhan Vien");
            System.out.println("0. Thoat");
            System.out.println("--------------------------------------");
            do {
                System.out.println("Moi Ban Chon Chuc Nang");
                choiceNumber = Integer.parseInt(scanner.nextLine());
            } while ((choiceNumber < 0) || (choiceNumber > 13));

            switch (choiceNumber) {
                case 1:
                    System.out.println("Them Phong Ban");
                    PhongBan pb1 = new PhongBan();
                    pb1.NhapPb();
                    listPb.add(pb1);
                    break;
                case 2:
                    System.out.println("Them Nhan Vien");
                    NhanVien nv1 = new NhanVien();
                    nv1.nhapNv();
                    System.out.println("Danh Sach Cac Phong Ban: ");
                    for (PhongBan phongBan : listPb) {
                        System.out.println("- " + phongBan.getTenPhongBan());
                    }

                    System.out.println("Nhap Ten Phong Ban");
                    String tenPb = scanner.nextLine();
                    try {
                        for (PhongBan phongBan : listPb) {
                            if (phongBan.getTenPhongBan().equalsIgnoreCase(tenPb)) {
                                nv1.ganPhongBan(phongBan);
                            }
                        }
                    } catch (Exception e) {
                    }
                    qlnv.themNv(nv1);
                    System.out.println(nv1.toString());

                    break;
                case 3:

                    System.out.println("Them Du An");
                    DuAn da = new DuAn();
                    da.nhapDA();
                    qlda.themDuAn(da);

                    break;
                case 4:

                    System.out.println("Sua Du An");
                    System.out.println(qlda.toString());
                    System.out.println("Nhap Ma Du An Can Sua");
                    String dkSua = scanner.nextLine();
                    try {
                        for (DuAn d : qlda.getDsDuAn()) {
                            if (d.getMaDA().equalsIgnoreCase(dkSua)) {
                                d.suaDa();
                            }
                        }
                    } catch (Exception e) {
                    }
                    break;
                case 5:

                    System.out.println("Xoa Du An");
                    System.out.println(qlda.toString());
                    System.out.println("Nhap Ma Du An Can Xoa");
                    String dkXoa = scanner.nextLine();
                    try {
                        for (DuAn d : qlda.getDsDuAn()) {
                            if (d.getMaDA().equalsIgnoreCase(dkXoa)) {
                                qlda.xoaDuAn(d);
                            }
                        }
                    } catch (Exception e) {
                    }
                    break;
                case 6:
                    System.out.println("Xem Luong Nhan Vien");
                    qlnv.tinhLuongNv();
                    break;
                case 7:
                    System.out.println("Gan Nhan Vien Cho Du An");
                    System.out.println("Danh Sach Du An:");
                    System.out.println(qlda.toString());
                    System.out.println("Nhap Ma Du An");
                    String maDa = scanner.nextLine();
                    qlda.getDsDuAn().forEach(d -> {
                        if (d.getMaDA().equalsIgnoreCase(maDa)) {
                            System.out.println("Danh Sach Nhan Vien:");
                            System.out.println(qlnv.toString());
                            System.out.println("Nhap Ma Nhan Vien Can Gan:");
                            String maNv = scanner.nextLine();
                            qlnv.getDsNV().forEach(nv -> {
                                if (nv.getMaNV().equalsIgnoreCase(maNv)) {
                                    d.themNVDuAn(nv);
                                }

                            });
                        }
                    });
                    break;
                case 8:
                    System.out.println("Gan Chu Nhiem Cho Du An");
                    System.out.println("Danh Sach Du An:");
                    System.out.println(qlda.toString());
                    System.out.println("Nhap Ma Du An");
                    String maDa1 = scanner.nextLine();
                    qlda.getDsDuAn().forEach(d -> {
                        if (d.getMaDA().equalsIgnoreCase(maDa1)) {
                            System.out.println("Danh Sach Nhan Vien:");
                            System.out.println(qlnv.toString());
                            System.out.println("Nhap Ma Nhan Vien Can Gan:");
                            String maNv1 = scanner.nextLine();
                            qlnv.getDsNV().forEach(nv -> {
                                if (nv.getMaNV().equalsIgnoreCase(maNv1)) {
                                    d.ganChuNhiemDa(nv);
                                }

                            });
                        }
                    });
                    break;
                case 9:
                    System.out.println("Tim Kiem Du An");
                    System.out.println("Nhap Ten Du An Can Tim");
                    String name = scanner.nextLine();
                    System.out.println("Nhap Thoi Gian Du An Bat Dau");
                    String date = scanner.nextLine();
                    qlda.sapXepGiamKinhPhi();
                    List<DuAn> kq = qlda.timKiem(name, date);
                    kq.forEach(d -> {
                        System.out.println(d.toString());
                    });
                    break;
                case 10:
                    System.out.println("Tim Kiem Nhan Vien");
                    System.out.println("Nhap Ten Nhan Vien Can Hoac Ten Phong Ban Can Tim");
                    String dk = scanner.nextLine();
                    qlnv.timKiem(dk).forEach(n -> {
                        System.out.println(n.toString());
                    });
                    break;
                case 11:
                    System.out.println("Xem Danh Sach Nhan Vien Cua Du An");
                    System.out.println("Danh Sach Du An:");
                    System.out.println(qlda.toString());
                    System.out.println("Nhap Ma Du An");
                    String maDa2 = scanner.nextLine();
                    qlda.getDsDuAn().forEach(d -> {
                        if (d.getMaDA().equalsIgnoreCase(maDa2)) {
                            if (d.getDsNhanVien() != null) {
                                System.out.println("Danh Sach Nhan Vien Cua Du An:");
                                d.getDsNhanVien().forEach(n -> {
                                    System.out.println(n.toString());
                                });
                            } else {
                                System.out.println("Chua Gan Nhan Vien Cho Du An");
                            }
                        }
                    });
                    break;
                case 12:
                    System.out.println("Gan Du An Cho Nhan Vien");
                    System.out.println("Danh Sach Nhan Vien: ");
                    System.out.println(qlnv.toString());
                    System.out.println("Nhap Ma Nhan Vien:");
                    String maNv3 = scanner.nextLine();
                    qlnv.getDsNV().forEach(n -> {
                        if (n.getMaNV().equalsIgnoreCase(maNv3)) {
                            System.out.println("Danh Sach Du An:");
                            System.out.println(qlda.toString());
                            System.out.println("Nhap Ma Du An Can Gan");
                            String maDa3 = scanner.nextLine();
                            qlda.getDsDuAn().forEach(d -> {
                                if (d.getMaDA().equalsIgnoreCase(maDa3)) {
                                    n.themDAThamGia(d);
                                }
                            });
                        }
                    });
                    break;
                case 13:
                    System.out.println("Xem Danh Sach Du An Cua Nhan Vien");
                    System.out.println("Danh Sach Nhan Vien: ");
                    System.out.println(qlnv.toString());
                    System.out.println("Nhap Ma Nhan Vien:");
                    String maNv4 = scanner.nextLine();
                    qlnv.getDsNV().forEach(n -> {
                        if(n.getMaNV().equalsIgnoreCase(maNv4)){
                            if(n.getDsDA() != null){
                                System.out.println("Danh sach Du An Cua Nhan Vien: ");
                                n.getDsDA().forEach(d -> {
                                    System.out.println(d.toString());
                                });
                            }
                        }
                    });
                    break;
                case 0:
                    System.out.println("Thoat Chuong Trinh");
                    System.exit(0); // thoát chương trình
                    break;
            }
        }

    }
}
