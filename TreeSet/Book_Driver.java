package TreeSet;

import java.util.TreeSet;

public class Book_Driver {
	public static void main(String[] args) {
		TreeSet<Book> treeSet = new TreeSet<>();
		treeSet.add(new Book(120, "Java", 52.3));
		treeSet.add(new Book(112, "C++ ", 56.3));
		treeSet.add(new Book(130, "JavaScript", 50.3));
		treeSet.add(new Book(112, "C++ ", 56.3));
		System.out.println("-------------Books-------------");
        System.out.println();
		for (Book book : treeSet) {
			System.out.println(book);
		}
	}
}
