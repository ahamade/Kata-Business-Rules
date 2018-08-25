package kata;

public class Product {

	private ProductType type;
	private String title = "";

	public Product(ProductType type) {
		this.type = type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public ProductType getType() {
		return this.type;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

}
