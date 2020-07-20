package quanlicanbo;

import sun.awt.event.IgnorePaintEvent;

import java.util.Scanner;

public class CanBo {

    private String hoTen;
    private int tuoi;
    private String gioiTinh;

    public CanBo() {
    }

    public CanBo(String hoTen, int tuoi, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhập họ tên: ");
        hoTen =sc.nextLine();

        System.out.println(" Nhập tuổi: ");
        tuoi =sc.nextInt();
        sc.nextLine();

        System.out.println(" Nhập giới tính: ");
        gioiTinh =sc.nextLine();

    }

    public void xuat()
    {
        System.out.println(" Họ tên: " +hoTen);
        System.out.println(" Tuổi: " + tuoi);
        System.out.println(" Giới tính: " + gioiTinh);

    }
}
