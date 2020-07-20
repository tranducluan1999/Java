package storemanagementsystem;

import java.time.Year;
import java.util.Scanner;

public class AppTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" Nhập số nhân viên: ");
        int n =sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++)
        {
            EmployeeManagement employeeManagement =new EmployeeManagement();
            System.out.println(" Nhập thông tin cho nhân viên thứ: " + (i+1));
            employeeManagement.nhap();

        }
    }
}
