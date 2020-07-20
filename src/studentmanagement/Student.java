package studentmanagement;

import java.util.Scanner;

public class Student {

    private String name;
    private float gpa;

    public Student() {
    }

    public Student(String name, float gpa) {
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
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhập tên: ");
        name = sc.nextLine();

        System.out.println(" Nhập gpa: ");
        gpa =sc.nextFloat();
    }

    public void xuat()
    {
        System.out.println(" Họ tên: " + name + ", GPA: " +gpa);

    }

    public boolean ckeck()
    {
        if(gpa >= 1.5)
        {
            return true;
        }
        return false;
    }
}
