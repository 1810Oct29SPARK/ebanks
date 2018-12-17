package com.revature.driver;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAO;
import com.revature.impl.EmployeeImpl;
import com.revature.util.ConnectionUtil;

public class Driver {
	public static void main (String[] args) {
		init();

		EmployeeDAO ed = new EmployeeImpl();
		List<Employee> employee = ed.getEmployee();
		for (Employee e : employee)  {
			System.out.println(e);
			
		}
	}
	
	static void init() {
		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
