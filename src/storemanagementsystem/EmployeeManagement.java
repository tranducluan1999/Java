package storemanagementsystem;

import java.util.Scanner;

public class EmployeeManagement {
    private int n ;
    Emmployee[] emmployees;

    public EmployeeManagement() {
    }

    public EmployeeManagement(int n, Emmployee[] emmployees) {
        this.n = this.emmployees.length;
        this.emmployees = emmployees;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Emmployee[] getEmmployees() {
        return emmployees;
    }

    public void setEmmployees(Emmployee[] emmployees) {
        this.emmployees = emmployees;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhập tên: ");
        String name =sc.nextLine();

        System.out.println(" Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println(" Nhập chứng minh thư: ");
        String idcard = sc.nextLine();

        System.out.println(" Nhập vị trí muốn làm: ");
        String vitri =sc.nextLine();

        if(vitri.equalsIgnoreCase("fulltime"))
        {
            System.out.println(" Nhân viên Fulltime");
            System.out.println(" Nhập số ngày làm việc: ");
            int ngaylv= sc.nextInt();
            sc.nextLine();

            System.out.println(" Nhập lương theo ngày: ");
            long luongtn = sc.nextLong();



        }
        else if(vitri.equalsIgnoreCase("parttime"))
        {
            System.out.println(" Nhân viên Parttime");
            System.out.println(" Nhập số ca làm việc: ");
            int calv = sc.nextInt();
            sc.nextLine();

            System.out.println(" Nhập lương cơ bản: ");
            long luongcb = sc.nextLong();


        }



    }




}
