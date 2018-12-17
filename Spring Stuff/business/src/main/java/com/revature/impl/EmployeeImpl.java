package com.revature.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAO;
import com.revature.util.ConnectionUtil;

public class EmployeeImpl implements EmployeeDAO {
	private static final String filename="connection.properties";
			
	@Override
	public List<Employee> getEmployee() {
		List<Employee> el = new ArrayList<>();
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT E.E_ID, E.FIRSTNAME, E.LASTNAME, E.EMAIL, E.PHONE, E.ADDRESS, E.L_ID " + 
					"FROM EMPLOYEE E";
			//statement needed to run the string in sql
			Statement stmt = con.createStatement();
			ResultSet ers = stmt.executeQuery(sql);
			
			while (ers.next()) {
				int E_ID = ers.getInt("E_ID");
			    String FIRSTNAME = ers.getString("FIRSTNAME");
			    String LASTNAME = ers.getString("LASTNAME");
			    String EMAIL = ers.getString("EMAIL");
			    String PHONE = ers.getString("PHONE");
			    String ADDRESS = ers.getString("ADDRESS");
			    int L_ID = ers.getInt("L_ID");
			    el.add(new Employee(E_ID, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, L_ID));
			   
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return el;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
