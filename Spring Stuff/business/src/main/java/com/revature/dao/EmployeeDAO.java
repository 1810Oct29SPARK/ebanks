package com.revature.dao;

import java.util.List;

import com.revature.beans.Employee;

public interface EmployeeDAO {
	//spits out all the employees
	public List<Employee> getEmployee();
	//spits out only one
	public Employee getEmployeeById(int id);
	//put methods here
 	
}
