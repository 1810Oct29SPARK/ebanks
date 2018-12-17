package com.revature.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
	public Employee getEmployeeById (int e_ID) {
		Employee n = null;
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT E_ID, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, L_ID FROM EMPLOYEE WHERE E_ID=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, e_ID);
			ResultSet ers = stmt.executeQuery();
			while (ers.next()) {
				int E_ID = ers.getInt("E_ID");
			    String FIRSTNAME = ers.getString("FIRSTNAME");
			    String LASTNAME = ers.getString("LASTNAME");
			    String EMAIL = ers.getString("EMAIL");
			    String PHONE = ers.getString("PHONE");
			    String ADDRESS = ers.getString("ADDRESS");
			    int L_ID = ers.getInt("L_ID");
			    n = new Employee(E_ID, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, L_ID);
			   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;

	}

	@Override
	public Employee createEmployee(int e_ID, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE,
			String aDDRESS, int l_ID) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "INSERT INTO EMPLOYEE VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, e_ID);
			p.setString(2, fIRSTNAME);
			p.setString(3, lASTNAME);
			p.setString(4, eMAIL);
			p.setString(5, pHONE);
			p.setString(6, aDDRESS);
			p.setInt(7, l_ID);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Employee deleteEmployee(int e_ID) {
			try (Connection con = ConnectionUtil.getConnection(filename)) {
				String sql = "DELETE FROM EMPLOYEE WHERE E_ID=?";
				PreparedStatement p = con.prepareStatement(sql);
				p.setInt(1, e_ID);
				p.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		}

	@Override
	public Employee updateEmployee(int e_ID, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE, String aDDRESS) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "UPDATE EMPLOYEE SET FIRSTNAME=?, LASTNAME=?, EMAIL=?, PHONE=?, ADDRESS=? WHERE E_ID=?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, fIRSTNAME);
			p.setString(2, lASTNAME);
			p.setString(3, eMAIL);
			p.setString(4, pHONE);
			p.setString(5, aDDRESS);
			p.setInt(6, e_ID);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
