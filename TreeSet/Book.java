package TreeSet;

public class Book implements Comparable<Book> {
	private int id;
	private String title;
	private double price;

	public Book(int id, String title, double price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Book nextBook) {
		return Double.compare(this.id, nextBook.id);
	}

	@Override
	public String toString() {
        return "ID:" + id + " | Name: " + title + " | Price:" + price;
}
}
