package ProjectManagement;

import java.util.Scanner;

public class ProjectManagementSystem {

	static int choice() {
		System.out.println("Enter 1 to add project");
		System.out.println("Enter 2 to display projects");
		System.out.println("Enter 3 to sort by project name and display projects");
		System.out.println("Enter 4 to update duration");
		System.out.println("Enter 5 to search projects with given technology");
		return Integer.parseInt(s.nextLine());
	}

	// projects array to keep collection of objects
	static Project projects[] = new Project[1];
	static Scanner s = new Scanner(System.in);
	static int size = 0;

	static void add() {
		if (size == projects.length)
			resize();
		System.out.println("Enter project id");
		long id = Long.parseLong(s.nextLine());
		System.out.println("Enter project name");
		String name = s.nextLine();
		System.out.println("Enter Description");
		String description = s.nextLine();
		System.out.println("Enter team size");
		int teamSize = Integer.parseInt(s.nextLine());
		System.out.println("Enter duration in months");
		byte durationInMonth = Byte.parseByte(s.nextLine());
		System.out.println("Enter the number of technologies");
		int numbeOfTechnology = Integer.parseInt(s.nextLine());
		String[] technologies = new String[numbeOfTechnology];

		for (int i = 0; i < numbeOfTechnology; i++) {
			System.out.println("Enter technology name");
			technologies[i] = s.nextLine();

		}

		projects[size++] = new Project(id, name, description, teamSize, durationInMonth, technologies);
	}

	private static void displayProjectwithHighestNumberOfTeamSize() {
		int teamSize = -1;

		int index = 0;
		for (int i = 0; i < size; i++) {
			if (projects[i].getTeamSize() > teamSize)
				index = i;
		}
		System.out.println(projects[index]);

	}

	private static void resize() {
		Project[] newarr = new Project[2 * size];

		for (int i = 0; i < size; i++)
			newarr[i] = projects[i];

		projects = newarr;

	}
	static void sortByProjectName() {

		for (int i = 0; i < projects.length - 1; i++) {
			for (int j = i; i < projects.length - 2; j++) {
				if (projects[i].getName().compareTo(projects[i + 1].getName()) < 0) {
					Project temp = projects[i];
					projects[i] = projects[i + 1];
					projects[i + 1] = temp;

				}
			}
		}

	}
	static void update_Duration() {
		long id = Long.parseLong(s.nextLine());
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (projects[i].getId() == id) {
				index = i;
				break;
			}
		}
		byte duration = Byte.parseByte(s.nextLine());

		projects[index].setDurationInMonth(duration);
		System.out.println(projects[index]);
	}
	static void display() {
		for (Project p : projects)
			System.out.println(p);
	}
	public static void main(String[] args) {
		String choice;
		do {
			switch (choice()) {
			case 1:
				add();
				break;
			case 2:
				display();
				break;
			case 3:
				sortByProjectName();
				display();
				break;
			case 4:
				update_Duration();
				break;
			case 5:
				searchProjectsWithGiventechnology();

			default:
				System.out.println("Wrong choice");
			}
			System.out.println("Enter true if you want to continue");
			choice = s.nextLine();
		} while (choice.equals("true") || choice.equals("True"));
		System.out.println("You are out of the system");
	}
	private static void searchProjectsWithGiventechnology() {
//loop for each objects
		// in that object we need to search all the technology.
		// if that technology is present put that into array.
		// move next
		System.out.println("Enter the Technology");
		String technology = s.nextLine();

		for (int i = 0; i < size; i++) {
			Project p = projects[i];

			for (int j = 0; j < p.getTechnologies().length; j++) {
				if (p.getTechnologies()[i].equals(technology)) {
					System.out.println(p);
					break;
				}
			}
		}

	}
}
