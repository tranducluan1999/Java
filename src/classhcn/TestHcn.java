package classhcn;

import java.util.Scanner;

public class TestHcn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Hcn hcn = new Hcn();

        System.out.println(" Nhập chiều dài: " );
        int cd = sc.nextInt();

        System.out.println(" Nhập chiều rộng: ");
        int cr = sc.nextInt();
        hcn = new Hcn(cd, cr);
        hcn.tinhChuVi();
        hcn.tinhdienTich();
        if(hcn.ktra() == true)
        {
            System.out.println(" Đây là hình vuông");
        }
        else
        {
            System.out.println(" Đây là hình chữ nhật");
        }


    }
}
