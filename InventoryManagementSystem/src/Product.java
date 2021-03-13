
public class Product {
	private static long idStart = 1000;
	private long id;
	private String name;
	private int quantity;
	private float pricePerUnit;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int quantity, float pricePerUnit) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
		setId();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", pricePerUnit=" + pricePerUnit
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId() {
		id = idStart++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(float pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

}
