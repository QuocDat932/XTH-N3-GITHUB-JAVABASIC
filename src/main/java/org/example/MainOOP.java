package org.example;

import org.example.entity.SinhVienTuNhien;

public class MainOOP {
    public static void main(String[] args) {
        SinhVienTuNhien svtn01 = new SinhVienTuNhien();
        svtn01.setMaSoSinhVien("PS12121");
        svtn01.setHoVaTen("Bui Quoc Dat");


        System.out.println(">> MSSV: "+ svtn01.getMaSoSinhVien());
        System.out.println(">> hoVaTen: "+ svtn01.getHoVaTen());
    }
}
