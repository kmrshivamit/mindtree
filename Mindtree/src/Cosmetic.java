import java.util.Arrays;
import java.util.Scanner;

public class Cosmetic {
	private static int idstart = 1000;
	private long id;
	private String name;
	private String brand;
	private int quantity;
	private float price;

	public Cosmetic(String name, String brand, int quantity, float price) {
		super();
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
		id = idstart++;
		
		
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	void choice() {
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for sort and search based on range");
	}

	void sortAndSearchBasedOnRange(float r1, float r2, Cosmetic arr[], int size) {
		Cosmetic arrNew[] = new Cosmetic[size];
		int j = 0;// to iterate for arrNew
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getPrice() >= r1 && arr[i].getPrice() <= r2) {
				arrNew[j] = arr[i];
				j++;
			}

		}

		Arrays.sort(arrNew, new BrandCompare());

		for (Cosmetic i : arrNew) {
			System.out.println(i);
		}
	}

	@Override
	public String toString() {
		return "Cosmetic [id=" + id + ", name=" + name + ", brand=" + brand + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

}
