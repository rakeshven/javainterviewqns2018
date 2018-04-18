package objecttofile;

import java.io.Serializable;

public class Employee implements Serializable {

	private int id;
	private String name;
	private String department;
	private static final long serialVersionUID = -1L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
