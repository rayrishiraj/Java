package oops_relationship;

public class Review { // Many to One Relation
	private String message;

	public Review(String message, Product product) {
		this.message = message;
		this.product = product;
	}

	private Product product;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	void display() {
		System.out.println(getProduct().getProduct_name());
		System.out.println(getMessage());
	}
}
