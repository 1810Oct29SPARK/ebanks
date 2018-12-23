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
			String sql = "SELECT E.E_ID, E.LOGIN, E.PASS, E.FIRSTNAME, E.LASTNAME, E.EMAIL, E.PHONE, E.ADDRESS, E.SUPERVISOR, E.REPORTSTO " + 
					"FROM EMPLOYEE E";
			//statement needed to run the string in sql
			Statement stmt = con.createStatement();
			ResultSet ers = stmt.executeQuery(sql);
			
			while (ers.next()) {
				int E_ID = ers.getInt("E_ID");
				String LOGIN = ers.getString("LOGIN");
				String PASS = ers.getString("PASS");
			    String FIRSTNAME = ers.getString("FIRSTNAME");
			    String LASTNAME = ers.getString("LASTNAME");
			    String EMAIL = ers.getString("EMAIL");
			    String PHONE = ers.getString("PHONE");
			    String ADDRESS = ers.getString("ADDRESS");
			    int SUPERVISOR = ers.getInt("SUPERVISOR");
			    int REPORTSTO = ers.getInt("REPORTSTO");
			    el.add(new Employee(E_ID, LOGIN, PASS, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, SUPERVISOR, REPORTSTO));
			   
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
			String sql = "SELECT E_ID, LOGIN, PASS, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, SUPERVISOR, REPORTSTO FROM EMPLOYEE WHERE E_ID=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, e_ID);
			ResultSet ers = stmt.executeQuery();
			while (ers.next()) {
				int E_ID = ers.getInt("E_ID");
				String LOGIN = ers.getString("LOGIN");
				String PASS = ers.getString("PASS");
			    String FIRSTNAME = ers.getString("FIRSTNAME");
			    String LASTNAME = ers.getString("LASTNAME");
			    String EMAIL = ers.getString("EMAIL");
			    String PHONE = ers.getString("PHONE");
			    String ADDRESS = ers.getString("ADDRESS");
			    int SUPERVISOR = ers.getInt("SUPERVISOR");
			    int REPORTSTO = ers.getInt("REPORTSTO");
			    n = new Employee(E_ID, LOGIN, PASS, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, SUPERVISOR, REPORTSTO);
			   
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
	public Employee createEmployee (int e_ID, String lOGIN, String pASS, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE, String aDDRESS, int sUPERVISOR, int rEPORTSTO) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "INSERT INTO EMPLOYEE VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, lOGIN);
			p.setString(2, pASS);
			p.setString(3, fIRSTNAME);
			p.setString(4, lASTNAME);
			p.setString(5, eMAIL);
			p.setString(6, pHONE);
			p.setString(7, aDDRESS);
			p.setInt(8, sUPERVISOR);
			p.setInt(9, rEPORTSTO);
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
	public Employee updateEmployee (int e_ID, String lOGIN, String pASS, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE, String aDDRESS, int sUPERVISOR, int rEPORTSTO) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "UPDATE EMPLOYEE SET FIRSTNAME=?, LASTNAME=?, EMAIL=?, PHONE=?, ADDRESS=?, SUPERVISOR=?, REPORTSTO=? WHERE E_ID=?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, fIRSTNAME);
			p.setString(2, lASTNAME);
			p.setString(3, eMAIL);
			p.setString(4, pHONE);
			p.setString(5, aDDRESS);
			p.setInt(6, e_ID);
			p.setInt(7, sUPERVISOR);
			p.setInt(8, rEPORTSTO);
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