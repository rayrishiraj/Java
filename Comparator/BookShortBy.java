package Comparator;

import java.util.Comparator;

public class BookShortBy implements Comparator<Book> {
//    @Override
//    public int compare(Book b1, Book b2) {
//        return Double.compare(b1.price, b2.price);
//    }
	@Override
	public int compare(Book b1, Book b2) {
		return b1.title.compareTo(b2.title);
	}
//	public int compare(Book b1, Book b2) {
//        return Integer.compare(b1.bookID, b2.bookID);  // Comparing by bookID
//    }
}

//	@Override
//	public int compare(Book b1, Book b2) {
//		return b1.bookID - b2.bookID;
//	}

//}
