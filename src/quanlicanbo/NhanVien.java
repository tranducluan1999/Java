package quanlicanbo;

import java.util.Scanner;

public class NhanVien extends CanBo{

    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh) {
        super(hoTen, tuoi, gioiTinh);
    }

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String congViec) {
        super(hoTen, tuoi, gioiTinh);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println(" Nhập công việc: ");
        congViec =sc.nextLine();
    }

    @Override
    public void xuat()
    {
        System.out.println(" Công việc: " +congViec);
    }
}
