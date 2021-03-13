package ProjectManagement;

import java.util.Arrays;

public class Project {

	public Project(long id, String name, String description, int teamSize, byte durationInMonth, String[] technologies) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.teamSize = teamSize;
		this.durationInMonth = durationInMonth;
		this.technologies = technologies;
	}

	private long id;
	private String name;
	private String description;
	private int teamSize;
	private byte durationInMonth;
	private String technologies[];

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public byte getDurationInMonth() {
		return durationInMonth;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + ", teamSize=" + teamSize
				+ ", durationInMonth=" + durationInMonth + ", technologies=" + Arrays.toString(technologies) + "]";
	}

	public void setDurationInMonth(byte durationInMonth) {
		this.durationInMonth = durationInMonth;
	}

	public String[] getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}

}
