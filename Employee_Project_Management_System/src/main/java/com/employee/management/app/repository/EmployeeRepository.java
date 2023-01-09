package com.employee.management.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.management.app.entity.Employee;

// JPA Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	// customized query using JPQL

	// JPQL query for select Employee using Employee first name
	@Query("select f from Employee f where f.firstName=?1")
	List<Employee> getEmployeeByFirstName(String firstName);

	// JPQL query for select Employee using Employee last name
	@Query("select l from Employee l where l.lastName=?1")
	List<Employee> getEmployeeByLastName(String lastName);

	// JPQL query for select Employee using Employee city name
	@Query("select c from Employee c where c.city=?1")
	List<Employee> getEmployeeByCity(String city);

}
