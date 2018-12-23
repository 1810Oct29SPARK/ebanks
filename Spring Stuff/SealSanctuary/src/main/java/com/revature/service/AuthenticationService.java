package com.revature.service;

import java.util.List;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAO;
import com.revature.impl.EmployeeImpl;

public class AuthenticationService {

	public Employee isValidUser(Credentials credentials) {
		boolean manager = false;
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		EmployeeDAO ed = new EmployeeImpl();
		List<Employee> el = ed.getEmployee();
		Employee e = null;

		if (username != null && password != null) {
			/*
			for (int i = 0; i < el.size(); i++) {

				if (username.equals(el.get(i).getLOGIN()) && password.equals(el.get(i).getPASS())) {
					if (el.get(i).getSUPERVISOR() != 0) {
						manager = true;
						return e;
					}
				}
			} 
		}
		return e;
		*/
			if (username.equals("jsmith") && password.equals("password1")) {
				e = new Employee(800, "jsmith", "password1", "John", "Smith", "jsmith@aol.com","5557778957","1234 Somewhere Road", 0, 820 );
			}
	} return e;
} 
}
