package classbook;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println(" Enter the number of book: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Book book[] = new Book[n];

        for(int i=0;i< n;i++)
        {
            System.out.println(" Enter the information for the " + (i+1) + " book");

            System.out.println(" Enter bookname: ");
            String bk = scanner.nextLine();

            System.out.println(" Author: ");
            String author = scanner.nextLine();

            System.out.println(" Price: ");
            float price = scanner.nextFloat();

            System.out.println(" Total Sell: ");
            int ts = scanner.nextInt();
            scanner.nextLine();

          book[i] = new Book( bk, author, price, ts);
        }
        BookManagement bookManagement = new BookManagement(book); // gans
        System.out.println(bookManagement);
        bookManagement.count();
        bookManagement.print();//



    }
}
