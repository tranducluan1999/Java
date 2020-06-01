package classofficials;

import java.util.Scanner;

public class TestEmployees {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);



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
        Employees employees = new Employees(name ,age, sex, add, work);
        System.out.println(employees);
    }
}
