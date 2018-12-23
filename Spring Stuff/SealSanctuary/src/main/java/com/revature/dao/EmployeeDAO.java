package com.revature.dao;

import java.util.List;

import com.revature.beans.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployee();

	public Employee getEmployeeById (int e_ID);
			
	public Employee createEmployee (int e_ID, String lOGIN, String pASS, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE,
			String aDDRESS, int sUPERVISOR, int rEPORTSTO);
	
	public Employee deleteEmployee (int e_ID);
	
	public Employee updateEmployee (int e_ID, String lOGIN, String pASS, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE,
			String aDDRESS, int sUPERVISOR, int rEPORTSTO);
 	
}
