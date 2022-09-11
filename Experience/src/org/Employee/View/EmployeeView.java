package org.Employee.View;
import org.Employee.methode.EmployeeService;
import org.mycompany.model.Employee;

public class EmployeeView {
	
	public static void main(String[] args) {
		Employee Employee1 = new Employee(1, 'H', 20000,1);
		EmployeeService emp1 = new EmployeeService();
		
		boolean result = emp1.isEligibleForIncrement(Employee1);
		System.out.println(result);
	}

}
