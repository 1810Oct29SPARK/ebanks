package com.revature.dao;

import java.util.List;

import com.revature.beans.Employee;

public interface EmployeeDAO {
	//spits out all the employees
	public List<Employee> getEmployee();
	//spits out only one
	public Employee getEmployeeById (int e_ID);
			
	public Employee createEmployee (int e_ID, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE, String aDDRESS, int l_ID);
	
	public Employee deleteEmployee (int e_ID);
	
	public Employee updateEmployee (int e_ID, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE, String aDDRESS);
 	
}
