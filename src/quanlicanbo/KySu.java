package quanlicanbo;

import java.util.Scanner;

public class KySu extends CanBo{

    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh) {
        super(hoTen, tuoi, gioiTinh);
    }

    public KySu(String hoTen, int tuoi, String gioiTinh, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.println(" Nhập ngành đào tạo: ");
        nganhDaoTao = sc.nextLine();
    }

    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println(" Ngành đào tạo: " + nganhDaoTao);
    }
}
