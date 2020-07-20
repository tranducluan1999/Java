package De6Cau1;

import java.util.Scanner;

public class TaiLieu {
    private String matl;
    private String tennxb;
    private int sobanphathanh;

    public TaiLieu() {
    }

    public TaiLieu(String matl, String tennxb, int sobanphathanh) {
        this.matl = matl;
        this.tennxb = tennxb;
        this.sobanphathanh = sobanphathanh;
    }

    public String getMatl() {
        return matl;
    }

    public void setMatl(String matl) {
        this.matl = matl;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

    public int getSobanphathanh() {
        return sobanphathanh;
    }

    public void setSobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập mã tài liệu: ");
        this.matl = sc.nextLine();

        System.out.println(" Nhập tên nhà xuất bản: ");
        this.tennxb = sc.nextLine();

        System.out.println(" Nhập số bản phát hành: ");
        this.sobanphathanh = sc.nextInt();

    }
     public void xuat()
     {
         System.out.println(" Mã tài liêu: " + this.matl + " Tên nhà xuất bản: " + this.tennxb + " Số bản phát hành: " + sobanphathanh);
     }


}
