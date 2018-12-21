package com.revature.service;

import java.util.List;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.beans.Login;
import com.revature.dao.EmployeeDAO;
import com.revature.dao.LoginDAO;
import com.revature.impl.EmployeeImpl;
import com.revature.impl.LoginImpl;

public class AuthenticationService {
	public LoginDAO ldao = new LoginImpl();
	public Boolean manage = false;
	public EmployeeDAO emdao = new EmployeeImpl();

	public Login isValidUser(Credentials cred) {
		List<Login> llist = ldao.getLogin();
		List<Employee> em = emdao.getEmployee();

		String username = cred.getUsername();
		String password = cred.getPassword();

		if (username != null && password != null) {
			for (int i = 0; i < llist.size(); i++ ) {
				if (username.equals(llist.get(i).getLOGIN()) && password.equals(llist.get(i).getPASS())) {
					if(em.get(i).getSUPERVISOR() != 0) {
						manage = true;
					}
				} return llist.get(i);
			}	
		}
		else {
			return null;
	}
		return null;
	}
	

}