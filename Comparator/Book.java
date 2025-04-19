package Comparator;

public class Book {
    int bookID;
    String title;
    double price;

    public Book(int bookID, String title, double price) {
        this.bookID = bookID;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return bookID + "\t" + title + "\t" + price;
    }
}
