package com.revature.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.RB_Request;
import com.revature.dao.RB_RequestDAO;
import com.revature.util.ConnectionUtil;

public class RB_RequestImpl implements RB_RequestDAO {
	private static final String filename="connection.properties";

	@Override
	public List<RB_Request> getRB_Request() {
		List<RB_Request> rbl = new ArrayList<>();
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT RB.RB_REQ_ID, RB.E_ID, RB.RB_REQ_AMT, RB.APPROVAL, RB.APPROVED_BY " + 
					"FROM RB_REQUEST RB";

			Statement stmt = con.createStatement();
			ResultSet ers = stmt.executeQuery(sql);
			
			while (ers.next()) {
				int RB_REQ_ID = ers.getInt("RB_REQ_ID");
			    int E_ID = ers.getInt("E_ID");
			    int RB_REQ_AMT = ers.getInt("RB_REQ_AMT");
			    int APPROVAL = ers.getInt("APPROVAL");
			    int APPROVED_BY = ers.getInt("APPROVED_BY");

			    rbl.add(new RB_Request(RB_REQ_ID, E_ID, RB_REQ_AMT, APPROVAL, APPROVED_BY));
			   
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return rbl;
	}

	@Override
	public RB_Request getRB_RequestById(int e_ID) {
		RB_Request n = null;
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "SELECT RB_REQ_ID, E_ID, RB_REQ_AMT, APPROVAL, S_ID FROM RB_REQUEST WHERE E_ID=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, e_ID);
			ResultSet ers = stmt.executeQuery();
			while (ers.next()) {
				int RB_REQ_ID = ers.getInt("RB_REQ_ID");
			    int E_ID = ers.getInt("E_ID");
			    int RB_REQ_AMT = ers.getInt("RB_REQ_AMT");
			    int APPROVAL = ers.getInt("APPROVAL");
			    int APPROVED_BY = ers.getInt("APPROVED_BY");
			    n = new RB_Request(RB_REQ_ID, E_ID, RB_REQ_AMT, APPROVAL, APPROVED_BY);
			   
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
	public RB_Request createRB_Request(int rB_REQ_ID, int e_ID, int rB_REQ_AMT, int aPPROVAL, int aPPROVED_BY) {
			try (Connection con = ConnectionUtil.getConnection(filename)) {
				String sql = "INSERT INTO RB_REQUEST VALUES (?, ?, ?, ?, ?)";
				PreparedStatement p = con.prepareStatement(sql);
				p.setInt(1, rB_REQ_ID);
				p.setInt(2, e_ID);
				p.setInt(3, rB_REQ_AMT);
				p.setInt(4, aPPROVAL);
				p.setInt(5, aPPROVED_BY);
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
	public RB_Request deleteRB_Request(int e_ID) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "DELETE FROM RB_REQUEST WHERE E_ID=?";
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
	public RB_Request updateRB_Request(int rB_REQ_ID, int e_ID, int rB_REQ_AMT, int aPPROVAL, int aPPROVED_BY) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "UPDATE RB_REQUEST SET RB_REQ_AMT=? FROM RB_REQUEST WHERE RB_REQ_ID=?";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, rB_REQ_AMT);
			p.setInt(2, rB_REQ_ID);
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
	public RB_Request superUpdateRB_Request(int rB_REQ_ID, int e_ID, int rB_REQ_AMT, int aPPROVAL, int s_ID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void uploadPhoto (int rB_REQ_ID) {
		try (Connection con = ConnectionUtil.getConnection(filename)) {
			String sql = "UPDATE ACCOUNTS SET PHOTO = ? WHERE RB_ID = ?";
			PreparedStatement p = con.prepareStatement(sql);
			File blob = new File ("receipt file path");
			FileInputStream in = new FileInputStream(blob);
			p.setBinaryStream(1, in);
			p.setInt(2, rB_REQ_ID);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}