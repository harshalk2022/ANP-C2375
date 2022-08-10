package org.mycompany.view;
import org.mycompany.service.EmployeeService ;
import org.mycompany.model.Employee;

public class EmployeeView {
public static void main(String[] args) {
		
		Employee Employee1 = new Employee (10,'H',25000 );
		EmployeeService Employee = new EmployeeService() ;
		System.out.println("old salary: "+ Employee1.getEmployeeSalary());
		Employee UpdatedEmployee = Employee.calculateSalarayIncrement(Employee1,25);
		System.out.println("Employee ID : "+UpdatedEmployee.getEmployeeId());
		System.out.println("Employee Initial : "+UpdatedEmployee.getEmployeeInitial());
		System.out.println("Employee Updated salaray : "+UpdatedEmployee.getEmployeeSalary());
	}

}
