package com.revature.service;

import java.util.List;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAO;
import com.revature.impl.EmployeeImpl;

public class AuthenticationService {

	public Employee isValidUser(Credentials credentials) {
		Employee u = null;
		EmployeeDAO emim = new EmployeeImpl();
		List<Employee> employeeList = emim.getEmployee();
		String username = credentials.getUsername();
		String password = credentials.getPassword();

		if (username != null && password != null) {
			
			for(Employee emp : employeeList) {
				if(username.equals(emp.getLOGIN()) && password.equals(emp.getPASS())) {
					Employee e = emim.getEmployeeByLogin(username);
					u = new Employee(e.getE_ID(), e.getLOGIN(), e.getPASS(), e.getFIRSTNAME(), e.getLASTNAME(), e.getEMAIL(), e.getPHONE(), e.getADDRESS(), e.getSUPERVISOR(), e.getREPORTSTO());
				}
			}
			}
		return u;
		}
	
}


		
		/*
		boolean manager = false;
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		EmployeeDAO ed = new EmployeeImpl();
		List<Employee> el = ed.getEmployee();

		if (username != null && password != null) {

			for (int i = 0; i < el.size(); i++) {

				if (username.equals(el.get(i).getLOGIN()) && password.equals(el.get(i).getPASS())) {
					if (el.get(i).getSUPERVISOR() != 0) {
						manager = true;
						return el.get(i);
					}
				}
			} 
		} return null;
	*/
			/*
			if (username.equals("jsmith") && password.equals("password1")) {
				System.out.println("test");
				e = new Employee(800, "jsmith", "password1", "John", "Smith", "jsmith@aol.com","5557778957","1234 Somewhere Road", 0, 820 );
			}
	} return e;
	*/

