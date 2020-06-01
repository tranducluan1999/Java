package classbook;

import java.util.Arrays;

public class BookManagement {
    private int totalBook;
    private Book []books;

    public BookManagement() {
    }

    public BookManagement(Book[] books) {
        this.books = books;
        this.totalBook = this.books.length;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookManagement{" +
                "totalBook=" + totalBook +
                ", books=" + Arrays.toString(books) +
                '}';
    }
    public  int count()
    {
        int count= 0;
        for(int i=0;i<totalBook;i++)
        {
            if(books[i].bestSeller() == true )
            {
                count++;
            }

        }
        System.out.println(" Total bestseller are: " + count);


        return count;

    }
    public void print()
    {
        Book max = books[0];
        for (int i=0;i<totalBook;i++)
        {
            if(this.books[i].getTotalSold() > this.books[0].getTotalSold() )
            {
                max = this.books[i];
            }

        }
        System.out.println(" BestSellerBook: " + max);
    }

}
