package classbook;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class TestBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter bookname: ");
        String bk = scanner.nextLine();

        System.out.println(" Author: ");
        String author = scanner.nextLine();

        System.out.println(" Price: ");
        float price = scanner.nextFloat();

        System.out.println(" Total Sell: ");
        int ts = scanner.nextInt();

        Book book = new Book(bk, author, price, ts);
        System.out.println(book);

        if(book.bestSeller() == true)
        {
            System.out.println(" this is the best seller");
        }







    }
}
