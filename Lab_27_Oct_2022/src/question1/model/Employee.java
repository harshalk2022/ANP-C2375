package question1.model;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private String phone;
	private String address;
	private String email;
	private String department;
	
	public Employee(int id, String name, String phone, String address, String email, String department) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", email="
				+ email + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, department, email, id, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(department, other.department)
				&& Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& phone == other.phone;
	}
	 

}
