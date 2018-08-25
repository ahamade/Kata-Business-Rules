package kata;

public class Product {
	
	private ProductType type;

	public Product(ProductType type) {
		this.type = type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public ProductType getType() {
		return this.type;
	}

}
