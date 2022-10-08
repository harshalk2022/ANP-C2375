package org.practicaltest.model;

import java.util.Objects;

public class Department {
	private int Id;
	private String name;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Id == other.Id && Objects.equals(name, other.name);
	}

}
