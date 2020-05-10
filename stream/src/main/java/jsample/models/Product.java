package jsample.models;

public class Product {

	private String id;
	
	private String name;
	
	private int quantity;

	public String getId() {
		return id;
	}

	public Product setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
}
