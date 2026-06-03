package org.example;

import org.example.entity.SinhVienTuNhien;
import org.example.entity.SinhVienXaHoi;

public class MainOOP {
    public static void main(String[] args) {
        SinhVienTuNhien svtn01 = new SinhVienTuNhien();
        SinhVienTuNhien svtn02 = new SinhVienTuNhien();
        SinhVienXaHoi svxh01 = new SinhVienXaHoi();

        svtn01.setMaSoSinhVien("PS12121");
        svtn01.setHoVaTen("Bui Quoc Dat");
        svtn01.setDiemToan(9.75);
        svtn01.setDiemHoa(8);
        svtn01.setDiemLy(7.25);
        svtn01.setDiemTB();

        svtn02.setMaSoSinhVien("TS01234");
        svtn02.setHoVaTen("Nguyen Van A");
        svtn02.setDiemToan(5);
        svtn02.setDiemLy(6);
        svtn02.setDiemHoa(7);
        svtn02.setDiemTB();

        svxh01.setMaSoSinhVien("TS02309");
        svxh01.setHoVaTen("Thanh Tam");
        svxh01.setDiemToan(8);
        svxh01.setDiemVan(8.75);
        svxh01.setDiemAnh(8.8);
        svxh01.setDiemTB();

        System.out.println(">> MSSV: "+ svtn01.getMaSoSinhVien());
        System.out.println(">> hoVaTen: "+ svtn01.getHoVaTen());
        System.out.println(">> Diem Toan: "+ svtn01.getDiemToan());
        System.out.println(">> Diem Hoa: "+ svtn01.getDiemHoa());
        System.out.println(">> Diem Ly: "+ svtn01.getDiemLy());
        System.out.println(">> Diem Trung Binh: "+ svtn01.getDiemTB());
        System.out.println("----------------------------------------");

        System.out.println(">> MSSV: "+ svtn02.getMaSoSinhVien());
        System.out.println(">> hoVaTen: "+ svtn02.getHoVaTen());
        System.out.println(">> Diem Toan: "+ svtn02.getDiemToan());
        System.out.println(">> Diem Hoa: "+ svtn02.getDiemHoa());
        System.out.println(">> Diem Ly: "+ svtn02.getDiemLy());
        System.out.println(">> Diem Trung Binh: "+ svtn02.getDiemTB());
        System.out.println("----------------------------------------");

        System.out.println(">> MSSV: "+ svxh01.getMaSoSinhVien());
        System.out.println(">> hoVaTen: "+ svxh01.getHoVaTen());
        System.out.println(">> Diem Toan: "+ svxh01.getDiemToan());
        System.out.println(">> Diem Van: "+ svxh01.getDiemVan());
        System.out.println(">> Diem Anh: "+ svxh01.getDiemAnh());
        System.out.println(">> Diem Trung Binh: "+ svxh01.getDiemTB());
        System.out.println("----------------------------------------");

    }
}
