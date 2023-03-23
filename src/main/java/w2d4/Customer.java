package w2d4;

public class Customer {
	
	private long id;
	private String name;
	private int tier;
	
	public Customer(String n, int t) {
		this.name = n;
		this.tier = t;
		this.id = 000000 + t;
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

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}
	
}
