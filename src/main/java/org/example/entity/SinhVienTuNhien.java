package org.example.entity;

public class SinhVienTuNhien extends SinhVien {
    private double diemLy;
    private double diemHoa;

    public SinhVienTuNhien(){};

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void setDiemTB() {
        double dtb = (this.getDiemToan() * 2 + this.diemLy + this.diemHoa) / 4;
        super.setDiemTB(dtb);
    }
}
