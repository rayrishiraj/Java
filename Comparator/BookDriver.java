package Comparator;

import java.util.Arrays;

public class BookDriver {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "ABC", 31.12),
            new Book(123, "XYZ", 30.12),
            new Book(321, "PQR", 29.12),
        };

        Arrays.sort(books, new BookShortBy());

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
