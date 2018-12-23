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
		/*
		List<Employee> employee = ed.getEmployee();
		for (Employee e : employee)  {
			System.out.println(e);
			
		}
		*/
		/*
		ed.createEmployee(520, "Kevin", "Simon", "ksimon@gmail.com", "5556789371", "3729 College Court", 0);
		System.out.println(ed);
		*/
		
		/*
		ed.deleteEmployee(515);
		System.out.println(ed);
		*/
		
		/*
		ed.getEmployeeById(500);
		System.out.println(ed);
		*/
		
		/*
		ed.updateEmployee(530, "William", "Johnson", "wjohnson@aol.com", "5553782910", "4782 Candycane Lane");
		System.out.println(ed);
		*/
		
		System.out.println(ed.getEmployeeById(500));
		

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