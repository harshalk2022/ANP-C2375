package com.employee.management.app.servicetest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.employee.management.app.entity.Employee;
import com.employee.management.app.repository.EmployeeRepository;
import com.employee.management.app.service.EmployeeService;

// Testing all CRUD method of Employee Service
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRepository employeeRepository;

	// testing saveProject() of Employee service
	@Test
	public void testSaveEmployee() {
		Employee employee = new Employee();
		employee.setEId(2);
		employee.setFirstName("Harshal");
		employee.setLastName("Khandalkar");
		employee.setEmail("harhalk2022@gmail.com");
		employee.setMobile(724894497);
		employee.setCity("Chandrapur");
		employee.setSalary(40000);
		employee.setJoiningDate("01-08-2022");

		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
		assertThat(employeeService.saveEmployee(employee)).isEqualTo(employee);
	}

	// testing getAllEmployees() of Employee service
	@Test
	public void testGetAllEmployees() {

		// Creating Employee 1 object and adding values in it
		Employee employee1 = new Employee();
		employee1.setEId(1);
		employee1.setFirstName("Yogesh");
		employee1.setLastName("Kamble");
		employee1.setEmail("yogesh43@gmail.com");
		employee1.setMobile(784574497);
		employee1.setCity("Nagpur");
		employee1.setSalary(35000);
		employee1.setJoiningDate("01-10-2022");

		// Creating Employee 2 object and adding values in it
		Employee employee2 = new Employee();
		employee2.setEId(2);
		employee2.setFirstName("Harshal");
		employee2.setLastName("Khandalkar");
		employee2.setEmail("harhalk2022@gmail.com");
		employee2.setMobile(724894497);
		employee2.setCity("Chandrapur");
		employee2.setSalary(40000);
		employee2.setJoiningDate("01-08-2022");

		List<Employee> employees = List.of(employee1, employee2);

		Mockito.when(employeeRepository.findAll()).thenReturn(employees);
		assertThat(employeeService.getAllEmployees()).isEqualTo(employees);
	}

	// testing getEmployeeById() of Employee service
	@Test
	public void testGetEmployeeById() {
		Employee employee = new Employee();
		employee.setEId(2);
		employee.setFirstName("Dipak");
		employee.setLastName("Doiphode");
		employee.setEmail("dipak3d@gmail.com");
		employee.setMobile(78947548);
		employee.setCity("Wardha");
		employee.setSalary(25000);
		employee.setJoiningDate("01-08-2022");

		Optional<Employee> optional = Optional.of(employee);
		Employee emp = optional.get();

		Mockito.when(employeeRepository.findById((long) 2)).thenReturn(optional);
		assertThat(employeeService.getEmployeeById(2)).isEqualTo(emp);
	}

	// testing testUpdateEmployeeById() of Employee service
	@Test
	public void testUpdateEmployeeById() {
		Employee employee = new Employee();
		employee.setEId(2);
		employee.setFirstName("Harshal");
		employee.setLastName("Khandalkar");
		employee.setEmail("harhalk2022@gmail.com");
		employee.setMobile(724894497);
		employee.setCity("Chandrapur");
		employee.setSalary(40000);
		employee.setJoiningDate("01-08-2022");

		Optional<Employee> optional = Optional.of(employee);
		Employee emp = optional.get();

		Mockito.when(employeeRepository.findById((long) 2)).thenReturn(optional);

		// updating values
		emp.setEmail("harshalkhandal123@gmail.com");
		emp.setMobile(87459754);
		emp.setCity("Gadchandur");
		emp.setSalary(50000);

		Mockito.when(employeeRepository.save(emp)).thenReturn(emp);
		assertThat(employeeService.updateEmployeeById(emp, 2)).isEqualTo(emp);
	}

	// testing DeleteEmployeeById() of Employee service
	@Test
	public void testDeleteEmployeeById() {
		Employee employee = new Employee();
		employee.setEId(2);
		employee.setFirstName("Dipak");
		employee.setLastName("Doiphode");
		employee.setEmail("dipak3d@gmail.com");
		employee.setMobile(78947548);
		employee.setCity("Wardha");
		employee.setSalary(25000);
		employee.setJoiningDate("01-08-2022");

		Optional<Employee> optional = Optional.of(employee);

		Mockito.when(employeeRepository.existsById((long) 2)).thenReturn(false);
		assertThat(employeeRepository.existsById(optional.get().getEId()));
	}

}
