package qlsv;

import java.util.Scanner;

public class SinhVien {

    private String name;
    private float gpa;

    public SinhVien() {
    }

    public SinhVien(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


    public void nhap()
    {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Nhập tên: ");
        name =sc.nextLine();

        System.out.println(" Nhập GPA: ");
        gpa =sc.nextFloat();

    }

    public void xuat()
    {
        System.out.println(" Họ tên: " + this.name);
        System.out.println(" GPA: " + this.gpa);
    }

    public boolean check()
    {
        if(this.gpa >= 1.5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }





}
