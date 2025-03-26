package oops_relationship;

public class Product { //Many to One Relation
	private String product_name;

	public Product(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void getProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
}
