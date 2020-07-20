package quanlicanbo;

import java.util.Scanner;

public class CongNhan extends CanBo {

    private int bac;

    public CongNhan() {
    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(String hoTen, int tuoi, String gioiTinh) {
        super(hoTen, tuoi, gioiTinh);
    }

    public CongNhan(String hoTen, int tuoi, String gioiTinh, int bac) {
        super(hoTen, tuoi, gioiTinh);
        this.bac = bac;
    }

    public CongNhan(CongNhan congNhan) {
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhập cấp bậc: ");
        bac =sc.nextInt();

    }

    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println(" Cấp bậc: " +bac);
    }

    public void timcongNhan()
    {
        CongNhan congNhan = new CongNhan();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhập cấp bậc muốn tìm kiếm: ");
        int cap = sc.nextInt();

        if(cap == congNhan.bac)
        {
            System.out.println(congNhan);
        }
        else
        {
            System.out.println(" Không tìm thấy công nhân có cấp bậc phù hợp!");
        }

    }
}
