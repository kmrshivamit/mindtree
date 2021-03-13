package ProjectManagement;

public class Customer {
	String name;
	int id;
	byte age;
	Medicine medicines[];

	public String getName() {
		return name;
	}

	public Medicine[] getMedicines() {
		return medicines;
	}

	public void setMedicines(Medicine[] medicines) {
		this.medicines = medicines;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

}
