package quanlicanbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập danh sách công nhân: ");
        int n = sc.nextInt();
        List<CongNhan> congNhans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            CongNhan congNhan = new CongNhan();
            System.out.println(" Nhập thông tin cho công nhân thứ: " + (i + 1));
            congNhan.nhap();
            congNhans.add(congNhan);
        }

        System.out.println("-----Hiển Thị-----");
        int a = 0;
        for (CongNhan cn : congNhans) {
            a++;
            System.out.println("--Công nhân thứ: " + a);
            cn.xuat();

        }
        CongNhan congNhan = new CongNhan();
        congNhan.timcongNhan();
    }
}
