import java.util.Arrays;
import java.util.Scanner;
public class CosmeticStore {
	static Scanner s = new Scanner(System.in);
	static Cosmetic arr[] = new Cosmetic[10];
	static int size = 0;
	static String again;
	private static void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void displayBrand() {
		System.out.println("Enter product name");
		s.nextLine();
		String name = s.nextLine();
		int i;
		for (i = 0; i < size; i++)
			if (arr[i].getName().equals(name)) {
				System.out.println(arr[i]);
			}
		if(i==size)
			System.out.println("invalid brand");
	}
	
	static private void updateQuantity() {
		System.out.println("Enter id of the product");
		long id = s.nextInt();
		int i;
		for (i = 0; i < size; i++) {
			if (id == arr[i].getId())
				break;
		}
		if (i == size)
			System.out.println("wrong id");
		else {
			System.out.println("enter quantity");
			int quantity = s.nextInt();
			arr[i].setQuantity(quantity);

		}

	}

	private static void choice() {
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for display objects");
		System.out.println("Enter 3 to display and view according to range");
		System.out.println("Enter 4 to display brand");
		System.out.println("Enter 5 to Update quantity");
	}

	static void add() {

		System.out.println("Enter name,brand, quantity, price");
		String name = s.nextLine();
		s.nextLine();
		String brand = s.nextLine();

		int quantity = s.nextInt();
		float price = s.nextFloat();

		if (size == arr.length)
			resize(arr);
		arr[size++] = new Cosmetic(name, brand, quantity, price);
		System.out.println(arr[size-1]);
	}

	static void resize(Cosmetic c[]) {
		int newSize = 2 * c.length;
		Cosmetic newarr[] = new Cosmetic[newSize];
		for (int i = 0; i < c.length; i++) {
			newarr[i] = c[i];
		}
		c = newarr;

	}

	static void sortAndSearchBasedOnRange(float r1, float r2) {
		Cosmetic arrNew[] = new Cosmetic[size];
		int j = 0;// to iterate for arrNew
		for (int i = 0; i < size; i++) {
			if ((arr[i].getPrice() >= r1) && (arr[i].getPrice() <= r2)) {
				arrNew[j] = arr[i];
				j++;
			}

		}

		Cosmetic arrNew1[] = new Cosmetic[j];

		for (int i1 = 0; i1 < j; i1++) {
			arrNew1[i1] = arrNew[i1];
		}

		Arrays.sort(arrNew1, new BrandCompare());

		for (Cosmetic i : arrNew1) {
			System.out.println(i);
		}
	}

	public static void main(String args[]) {

		arr[size++] = new Cosmetic("cream", "ponds", 100, 50);
		arr[size++] = new Cosmetic("toothpaste", "colget", 300, 33);
		arr[size++] = new Cosmetic("oil", "natural", 330, 44);

		System.out.println();

		// create a dynamic array to add new objects into it.

		// create a switch case inside do while to do varous operations.

		do {
			choice();
			int option = s.nextInt();
			switch (option) {
			case 1: {
				add();
				break;
			}
			case 2: {
				display();
				break;
			}
			case 3: {
				int range1 = s.nextInt();
				int range2 = s.nextInt();
				sortAndSearchBasedOnRange(range1, range2);
				break;
			}
			case 4: {
				displayBrand();
				break;
			}
			case 5: {
				updateQuantity();
				break;
			}

			default: {
				System.out.println("Enter proper choice");
				choice();
			}
			}
		
			System.out.println("Do you want to continue press y or n");
			s.nextLine();
			again = s.nextLine();
		} while ((again.equals("Y")) || (again.equals("y")));
		System.out.println("hii you are out of loop");
	}
}
