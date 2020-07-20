package De6Cau1;

import java.util.Scanner;

public class Sach extends TaiLieu {
    String tacgia;
    int sotrang;

    public Sach() {
    }

    public Sach(String matl, String tennxb, int sobanphathanh) {
        super(matl, tennxb, sobanphathanh);
    }

    public Sach(String matl, String tennxb, int sobanphathanh, String tacgia, int sotrang) {
        super(matl, tennxb, sobanphathanh);
        this.tacgia = tacgia;
        this.sotrang = sotrang;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
    @Override
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println( " Nhập tên tác giả: ");
        this.tacgia = sc .nextLine();

        System.out.println(" Nhập số trang: ");
        this.sotrang = sc.nextInt();
    }

    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println( " Tên tác giả: "+ tacgia);
        System.out.println(" Số trang: "  +sotrang);
    }
}
