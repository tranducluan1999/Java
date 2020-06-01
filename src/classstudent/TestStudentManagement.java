package classstudent;

import java.util.Scanner;

public class TestStudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Import the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student student[] = new Student[n];
        for(int i=0;i<student.length;i++)
        {
            System.out.println(" Enter the infomation for student: " +(i+1));
            System.out.println(" Import Name: ");
            String name = sc.nextLine();


            System.out.println(" Import Gpa: ");
            float gpa = sc.nextFloat();
            sc.nextLine();

            student[i] = new Student(name, gpa);

        }
        StudentManagement studentManagement = new StudentManagement(student);
        studentManagement.countStudentPass();
        studentManagement.countStudentFail();



    }

}
