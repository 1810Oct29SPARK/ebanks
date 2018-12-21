package com.revature.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.revature.beans.Login;
import com.revature.dao.LoginDAO;
import com.revature.util.ConnectionUtil;

public class LoginImpl implements LoginDAO {
	private static final String filename="connection.properties";

	@Override
	public List<Login> getLogin() {
		List<Login> l = new ArrayList<>();
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT L.L_ID, L.E_ID, L.LOGIN, L.PASS " + 
					"FROM LOGIN L";
			//statement needed to run the string in sql
			Statement stmt = con.createStatement();
			ResultSet ers = stmt.executeQuery(sql);
			
			while (ers.next()) {
				int L_ID = ers.getInt("L_ID");
				int E_ID = ers.getInt("E_ID");
			    String LOGIN = ers.getString("LOGIN");
			    String PASS = ers.getString("PASS");

			    l.add(new Login(L_ID, E_ID, LOGIN, PASS));
			   
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return l;
	}


}
