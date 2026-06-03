package org.example.entity;

public class SinhVienXaHoi extends SinhVien{
    private double diemVan;
    private double diemAnh;

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public void setDiemTB(){
        double dtb = (this.getDiemToan() + this.diemVan + this.diemAnh) / 3;
        super.setDiemTB(dtb);
    }

    public void outPutIn4(){
        System.out.println(">> MSSV: "+ getMaSoSinhVien());
        System.out.println(">> Diem Toan: "+ super.getDiemToan());
        System.out.println(">> Diem Van: "+ this.getDiemVan());
        System.out.println(">> Diem Anh: "+ this.getDiemAnh());
        System.out.println(">> Diem Trung Binh: "+ super.getDiemTB());
        System.out.println("----------------------------------------");
    }
}
