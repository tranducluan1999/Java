package classstudent;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Import Name: ");
        String name = sc.nextLine();

        System.out.println(" Import Gpa: ");
        float gpa = sc.nextFloat();

        Student students = new Student(name, gpa);
        System.out.println(students);
        students.printInfo();

        if(students.check() == true )
        {
            System.out.println(" This student passed");
        }
        else
        {
            System.out.println(" This student failed");
        }


    }
}
