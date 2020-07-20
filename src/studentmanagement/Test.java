package studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println(" Nhập danh sách học sinh: ");
        int n =sc.nextInt();
        sc.nextLine();
        List<Student> students = new ArrayList<>();

        for(int i=0;i<n; i++)
        {
             Student student = new Student();
            System.out.println(" Nhập thông tin cho học sinh thứ: " +(i+1));
            student.nhap();
            students.add(student);
        }

        System.out.println("----Hiển thị----");
        int a=0;
        for(Student ss : students)
        {
            a++;
            System.out.println("--Sinh viên thứ: " +a);
            ss.xuat();

        }



    }

   /* public void checkGpa()
    {
        Student student = new Student();
        if(student.ckeck() ==true)
        {
            System.out.println(" Sinh viên này đỗ! ");
        }
        else
        {
            System.out.println(" Sinh viên này trượt!");
        }
    }*/

}
