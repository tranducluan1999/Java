package qlsv;

public class QLSV {
    int soSV;
    SinhVien[] sv;

    public QLSV() {
    }

    public QLSV(int soSV, SinhVien[] sv) {
        this.soSV = soSV;
        this.sv = sv;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public SinhVien[] getSv() {
        return sv;
    }

    public void setSv(SinhVien[] sv) {
        this.sv = sv;
    }
}
