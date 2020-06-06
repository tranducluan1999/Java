package chuadethiquanlikhachsan;
/*
Để quản lí khách hàng đến thuê phòng trọ của một khách sạn, ngta cần quản lí các thông tin như sau:
        -	Số ngày trọ, loại phòng trọ, giá phòng, và các thông tin cá nhân về mỗi khách trọ.
        -	Với mỗi cá nhân, ngta cần quản lí các thông tin: họ tên, tuổi, năm sinh, số cmt,
        A, xây dựng lớp người để quản lí thông tin về mỗi cá nhân.
        B,xây dựng lớp khách sạn để quản lí các thông tin về khách trọ.
        C, viết các phương thức:  nhập, hiển thị các thông tin về mỗi khách trọ.
        D, cài đặt chương trình hiển thị các thông tin sau:
        -	Nhập vào 1 dãy gồm n khách trọ(n từ bàn phím)
        -	Hiển thị ra màn hình các thông tin về các cá nhân hiện đang trọ ở khách sạn đó.
*/


import java.util.Scanner;

public class ConNguoi {
    private String hoten;
    private int tuoi;
    private String ngaysinh;
    private String cmt;

    public ConNguoi() {
    }

    public ConNguoi(String hoten, int tuoi, String ngaysinh, String cmt) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.ngaysinh = ngaysinh;
        this.cmt = cmt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("  Nhap ten: ");
        String ten = sc.  nextLine();

        System.out.println("  Nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();

        System.out.println("  Nhap ngay thang nam sinh: ");
        String ngaysinh = sc.nextLine();
        System.out.println("  Nhap so chung minh thu: ");
        String  cmt = sc.nextLine();
    }
    public void xuat()
    {
        System.out.println(" ho ten: " + this.hoten);
        System.out.println(" tuoi: " +this.tuoi);
        System.out.println(" ngay thang nam sinh: " + ngaysinh);
        System.out.println(" so chung minh thu: " +  this.cmt);
    }
}
