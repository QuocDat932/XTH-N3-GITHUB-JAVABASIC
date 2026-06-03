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
}
