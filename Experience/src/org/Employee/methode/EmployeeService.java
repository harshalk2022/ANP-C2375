package org.Employee.methode;
import org.mycompany.model.Employee;

public class EmployeeService {
	
	public boolean isEligibleForIncrement(Employee obj1) {
		boolean value = false;
		
		if(obj1.getEmployeeExperiance()>2) {
			value = true;
		}
		return value;
	}

}
