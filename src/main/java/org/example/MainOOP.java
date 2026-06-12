package org.example;

import org.example.entity.SinhVien;
import org.example.entity.SinhVienTuNhien;
import org.example.entity.SinhVienXaHoi;

import java.util.ArrayList;
import java.util.List;

public class MainOOP {
    public static void main(String[] args) {
        SinhVienTuNhien svtn01 = new SinhVienTuNhien("PS12121", "Bui Quoc Dat", 10.0, 10.0, 10.0);
        SinhVien svtn02 = new SinhVienTuNhien("TS01234", "Nguyen Van A", 9.0, 9.5, 10.0);
        SinhVienXaHoi svxh01 = new SinhVienXaHoi("PS00001", "Nguyen Van Mot", 9.0, 9.5, 10.0);

        svtn02.calDTB();
        svxh01.calDTB();
        List<SinhVien> lstn = new ArrayList<>();
        lstn.add(svtn01);

        lstn.add(svxh01);

        ArrayList<SinhVien> lstn02 = new ArrayList();





//        svtn01.outPutIn4();
//        svtn02.outPutIn4();
//        svxh01.outPutIn4();









    }
}
