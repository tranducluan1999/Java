package qlsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhập số sinh viên: ");
        int n =sc.nextInt();
        sc.nextLine();
        List<SinhVien> sv = new ArrayList<>();
        SinhVien [] sinhViens = new SinhVien[n];
        for( int i=0;i< n ; i++)
        {
            SinhVien sinhVien = new SinhVien();
            System.out.println(" Nhập tên của sinh viên thứ: " + (i+1));
            sinhVien.nhap();
            sv.add(sinhVien);
        }

        //QuanLiSV quanLiSV = new QuanLiSV(sinhViens);
        //System.out.println(quanLiSV);

        System.out.println(" -----Hiển thị-----");
        int a=0;
        for (SinhVien sinhVien: sv)
        {
            a++;
            System.out.println("---Thông tin của  sinh viên thứ: " +a);
            sinhVien.xuat();
        }

    }
}
