package org.example;

import org.example.entity.SinhVienTuNhien;
import org.example.entity.SinhVienXaHoi;

public class MainOOP {
    public static void main(String[] args) {
        SinhVienTuNhien svtn01 = new SinhVienTuNhien("PS12121", "Bui Quoc Dat", 10.0, 10.0, 10.0);
        SinhVienTuNhien svtn02 = new SinhVienTuNhien("TS01234", "Nguyen Van A", 9.0, 9.5, 10.0);
        SinhVienXaHoi svxh01 = new SinhVienXaHoi();

        svtn01.outPutIn4();
        svxh01.outPutIn4();

    }
}
