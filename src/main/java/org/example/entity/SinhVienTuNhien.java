package org.example.entity;

public class SinhVienTuNhien extends SinhVien {
    private double diemLy;
    private double diemHoa;

    public SinhVienTuNhien(){};

    public double getDiemLy() { return diemLy;    }

    public void setDiemLy(double diemLy) {this.diemLy = diemLy;    }

    public double getDiemHoa() {return diemHoa;    }

    public void setDiemHoa(double diemHoa) {this.diemHoa = diemHoa;}



    public void outPutIn4(){
        System.out.println(">> MSSV: "+ this.getMaSoSinhVien());
        System.out.println(">> hoVaTen: "+ super.getHoVaTen());
        System.out.println(">> Diem Toan: "+ super.getDiemToan());
        System.out.println(">> Diem Hoa: "+ this.getDiemHoa());
        System.out.println(">> Diem Ly: "+ this.getDiemLy());
        System.out.println(">> Diem Trung Binh: "+ super.getDiemTB());
        System.out.println("----------------------------------------");
    }

    public SinhVienTuNhien(String mssv, String hoVaTen, Double diemToan, Double diemLy, Double diemHoa ){
        super.setMaSoSinhVien(mssv);
        super.setHoVaTen(hoVaTen);
        super.setDiemToan(diemToan);
        this.setDiemLy(diemLy);
        this.diemHoa = diemHoa;


    }

    @Override
    public void calDTB() {
        double dtb = (this.getDiemToan() * 2 + this.diemLy + this.diemHoa) / 4;
        super.setDiemTB(dtb);
    }
}
