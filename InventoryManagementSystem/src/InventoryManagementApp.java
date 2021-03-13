import java.util.Scanner;

/*question 1 . Inventory Management
Write a menu driver program for inventory management where Product(id, name, quantity, price_per_unit).
1. Add new product in inventory.
2. Update the quantity of particular product.
3. Display products where quantity is less than provided by a user.
4. Display product sort on the basis of quantity.
5. Delete a particular product from inventory.
6. Exit*/

/*
 1 add
take values from the user
use constructor and add new product to the array.


2 update quantity

take id from user
search for id in the array
ask for the quantity if id is correct
update the quantity 

3 Display products based on quantity less than value
take quantity detail from user
search for the array 
check for the quantity using getter
print the quantity

4 sorted Products based on quantity
use bubble sort to do it.

5 delete product
take id 
if id is incorrect then print error message
else
traverse the array and search for the id
put null on that place 
use another array and put all the elements without the null element.
*/

public class InventoryManagementApp {

	private static int countOfProducts = 0;

	public static void main(String[] args) {
		String ifContinue = "yes";

		Product products[] = new Product[1];
		do {
			Scanner scanner = new Scanner(System.in);
			switch (menu()) {
			case 1:
				products = add(products);
				display(products);
				break;
			case 2:
				System.out.println("Enter id");
				long id = scanner.nextLong();
				updateQuantity(id, products);
				break;
			case 3:
				System.out.println("Enter the quantity");
				int quantity = scanner.nextInt();
				displayProductsBasedOnQuantityLessThanVaue(quantity, products);
				break;
			case 4:
				Product[] sortedProducts = sort(products);
				display(sortedProducts);
				break;
			case 5:
				System.out.println("Enter the id of product you want to delete");
				long id1 = scanner.nextLong();

				products = delete(products, id1);
				break;
			default:
				System.out.println("Wrong choice");

			}
			System.out.println(" If you want to continue please write yes ");

			Scanner scanner1 = new Scanner(System.in);
			ifContinue = scanner.nextLine();

		} while (ifContinue.equals("yes"));
		System.out.println("Thank you for using this system");
	}

	static int menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("_____________________________________________________");
		System.out.println("Enter 1 to add new product in inventory");
		System.out.println("Enter 2 to update the quantity off particular product");
		System.out.println("Enter 3 to display products where quantity is less than provided by a user");
		System.out.println("Enter 4 to Display product sort on the basis of quantity");
		System.out.println("Enter 5 to Delete a paticular product from inventory");
		return scanner.nextInt();
	}

	private static Product[] delete(Product products[], long id) {
		// TODO Auto-generated method stub
		boolean isCorrect = false;
		for (int i = 0; i < countOfProducts; i++) {
			if (products[i].getId() == id)
				isCorrect = true;
		}
		if (isCorrect == false) {
			System.out.println("No such product exist");
			return products;
		}

		for (int i = 0; i < countOfProducts; i++) {
			if (products[i].getId() == id)
				products[i] = null;
		}
		countOfProducts--;
		Product newProductsArray[] = new Product[products.length];
		for (int i = 0, j = 0; i < products.length; i++) {
			if (products[i] != null)
				newProductsArray[j++] = products[i];
		}
		System.out.println("Product deleted successfully");
		return newProductsArray;
	}

	private static void display(Product products[]) {
		for (int i = 0; i < countOfProducts; i++) {
			System.out.println(products[i]);
		}
	}

	private static Product[] sort(Product[] products) {
		// TODO Auto-generated method stub
		Product sortedProducts[] = new Product[products.length];

		for (int i = 0; i < sortedProducts.length; i++) {
			sortedProducts[i] = products[i];

		}

		for (int i = 0; i < countOfProducts - 1; i++) {
			for (int j = 0; j < countOfProducts - i - 1; j++)
				if (sortedProducts[j].getQuantity() > sortedProducts[j + 1].getQuantity()) {
					Product temp = sortedProducts[j];
					sortedProducts[j] = sortedProducts[j + 1];
					sortedProducts[j + 1] = temp;
				}
		}
		return sortedProducts;
	}

	private static void displayProductsBasedOnQuantityLessThanVaue(int givenQuantity, Product products[]) {

		for (int i = 0; i < countOfProducts; i++) {

			if (products[i].getQuantity() < givenQuantity)
				System.out.println(products[i]);
		}
	}

	private static void updateQuantity(long id, Product products[]) {
		Scanner scanner = new Scanner(System.in);
		boolean isIDCorrect = false;

		System.out.println("Enter  the amount to be updated");
		int quantity = scanner.nextInt();

		for (int i = 0; i < countOfProducts; i++) {
			if (products[i].getId() == id) {
				isIDCorrect = true;
				products[i].setQuantity(quantity);
				System.out.println("Updated");
				break;
			}
		}

		if (isIDCorrect == false) {
			System.out.println("Wrong ID");
			return;
		}

	}

	private static Product[] add(Product products[]) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("Count of products is" + countOfProducts);
		if (countOfProducts == products.length)
			products = reisze(products);

		System.out.println("Enter name of product");
		String name = scanner.nextLine();
		System.out.println("Enter quantity of product");
		int quantity = scanner.nextInt();
		System.out.println("Enter price per piece of product");
		float pricePerUnit = scanner.nextFloat();
		products[countOfProducts++] = new Product(name, quantity, pricePerUnit);
		return products;
	}

	private static Product[] reisze(Product products[]) {
		// System.out.println("I am in resize block");
		Product[] tempProduct = new Product[2 * countOfProducts];
		for (int i = 0; i < countOfProducts; i++)
			tempProduct[i] = products[i];
		return tempProduct;

	}

}
