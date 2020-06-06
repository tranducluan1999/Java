package chuadethiquanlikhachsan;

import java.util.Scanner;

public class KhachSan extends ConNguoi{

    private  int songaytro;
    private String loaiphongtro;
    private float giaphong;

    public KhachSan(String hoten, int tuoi, String ngaysinh, String cmt) {
        super(hoten, tuoi, ngaysinh, cmt);
    }

    public KhachSan(String hoten, int tuoi, String ngaysinh, String cmt, int songaytro, String loaiphongtro, float giaphong) {
        super(hoten, tuoi, ngaysinh, cmt);
        this.songaytro = songaytro;
        this.loaiphongtro = loaiphongtro;
        this.giaphong = giaphong;
    }

    public KhachSan() {

    }

    public int getSongaytro() {
        return songaytro;
    }

    public void setSongaytro(int songaytro) {
        this.songaytro = songaytro;
    }

    public String getLoaiphongtro() {
        return loaiphongtro;
    }

    public void setLoaiphongtro(String loaiphongtro) {
        this.loaiphongtro = loaiphongtro;
    }

    public float getGiaphong() {
        return giaphong;
    }

    public void setGiaphong(float giaphong) {
        this.giaphong = giaphong;
    }

   @Override
   public void nhap()
   {

       super.nhap();
       Scanner sc = new Scanner(System.in);
       System.out.println(" Nhap so ngay tro: ");
       int songaytro = sc.nextInt();
       sc.nextLine();

       System.out.println(" Nhap loai phong tro: " );
       String loaiphongtro = sc.nextLine();

       System.out.println(" Gia phong: ");
       float giaphong = sc.nextFloat();

   }

   @Override
    public void xuat()
   {
       super.xuat();
       System.out.println(" So ngay tro: " + this.songaytro);
       System.out.println(" loai phong tro: " +this.loaiphongtro);
       System.out.println(" Gia phong: " +  this.giaphong);
   }
}
