package congnhan;

import java.util.Scanner;

public class TestCongNhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    //String name, float age, String sex, String add, int level
        System.out.println(" name: ");
        String name  = sc.nextLine();

        System.out.println(" Age: ");
        float age = sc.nextFloat();
        sc.nextLine();

        System.out.println(" Sex: ");
        String sex = sc.nextLine();

        System.out.println(" Address: ");
        String add = sc.nextLine();

        System.out.println(" Level: ");
        int level = sc.nextInt();

        CongNhan congNhan = new CongNhan(name, age, sex, add, level);
        System.out.println(congNhan);
        congNhan.print();



    }
}
