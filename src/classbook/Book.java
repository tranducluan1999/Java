package classbook;

public class Book {
    private String bookName;
    private String author;
    private float price;
    private int totalSold;

    public Book() {
    }

    public Book(String bookName, String author, float price, int totalSold) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.totalSold = totalSold;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName='" + bookName + '\'' + ", author='" + author + '\'' + ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }
    public  boolean bestSeller()
    {
        if(this.totalSold>= 1000)
        {
           return true;
        }
        else
            return false;


    }
}
