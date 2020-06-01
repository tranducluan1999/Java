package cauhoi;

import java.util.Scanner;

public class TestCauHoi {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println(" CauHoi: ");
        System.out.println(" con meof co mays chan: ");
        System.out.println(" A. 1 chan");
        System.out.println(" B. 2 chan");
        System.out.println(" C. 3 chan");
        System.out.println(" D. 4 chan");
        System.out.println(" moi ban chon dap an: ");
        String n=sc.nextLine();

        do {


            switch (n) {
                case "A":

                    System.out.println(" ban da chon sai");
                    break;
                case "B":

                    System.out.println(" ban da chon sai");
                    break;
                case "C":

                    System.out.println(" ban da chon sai");
                    break;
                case "D":

                    System.out.println(" ban da chon dung");
                    break;


            }
        }while (n == "D");



    }
}
