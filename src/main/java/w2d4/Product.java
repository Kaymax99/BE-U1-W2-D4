package w2d4;

public class Product {
	
	private long id;
	private String name;
	private String category;
	private double price;
	
	public Product(long id, String n, String c, double p) {
		this.id = id;
		this.name = n;
		this.category = c;
		this.price = p;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
