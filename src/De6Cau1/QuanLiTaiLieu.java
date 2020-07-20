package De6Cau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiTaiLieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sach sach = new Sach();
        List <Sach> saches = new ArrayList<>();
        System.out.println(" Nhập số sách: ");
        int n = sc.nextInt();
        for(int i=0 ;i<n;i++)
        {
            System.out.println(" Nhập thông tin cho tài liêu sách thứ: " + (i+1));
            sach.nhap();
            saches.add(sach);

        }
        System.out.println(" ---------- Hiển Thị-----------");
         int dem=0;
        for(Sach s : saches)
        {
            dem++;
            System.out.println(" Thông tin của tài liệu sách thứ: " + dem);
            s.xuat();

        }

    }
}
