package classofficials;

import java.util.Scanner;

public class TestEmployeesManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.println(" Enter the number of Employess: ");
        int  n = sc.nextInt();
        sc.nextLine();
        // String name, float age, String sex, String add, String work
        Employees []employees = new Employees[n];
        for(int i=0;i<n;i++)
        {
            System.out.println(" Import information of the " + (i+1) + " Employess");
            System.out.println( " Name: ");
            String name = sc.nextLine();

            System.out.println( " Age: ");
            float age  = sc.nextFloat();
            sc.nextLine();

            System.out.println(" Sex: ");
            String sex = sc.nextLine();

            System.out.println(" Address: ");
            String add = sc.nextLine();

            System.out.println(" Work: ");
            String work = sc.nextLine();

            employees[i] = new Employees(name, age, sex, add, work);


        }

        EmployeesManagement employeesManagement = new EmployeesManagement(employees);
        System.out.println(employees);
    }
}
