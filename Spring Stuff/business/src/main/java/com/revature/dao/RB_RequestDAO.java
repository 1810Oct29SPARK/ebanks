package com.revature.dao;

import java.util.List;

import com.revature.beans.RB_Request;

public interface RB_RequestDAO {
	
	public List<RB_Request> getRB_Request();
	
	public RB_Request getRB_RequestById (int rB_REQ_ID);
	
	public RB_Request createRB_Request (int rB_REQ_ID, int e_ID, int rB_REQ_AMT, int aPPROVAL, int s_ID);
	
	public RB_Request deleteRB_Request (int rB_REQ_ID);
	
	public RB_Request updateRB_Request (int rB_REQ_ID, int e_ID, int rB_REQ_AMT, int aPPROVAL, int s_ID);
	
	public RB_Request superUpdateRB_Request (int rB_REQ_ID, int e_ID, int rB_REQ_AMT, int aPPROVAL, int s_ID);
	
	public void uploadPhoto (int rB_REQ_ID);
}
