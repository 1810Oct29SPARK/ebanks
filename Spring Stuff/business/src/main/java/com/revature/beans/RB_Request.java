package com.revature.beans;

public class RB_Request {
	public RB_Request(int rB_REQ_ID, int e_ID, int rB_REQ_AMT, int aPPROVAL, int s_ID) {
		super();
		RB_REQ_ID = rB_REQ_ID;
		E_ID = e_ID;
		RB_REQ_AMT = rB_REQ_AMT;
		APPROVAL = aPPROVAL;
		S_ID = s_ID;
	}
	private int RB_REQ_ID;
	private int E_ID;
	private int RB_REQ_AMT;
	private int APPROVAL;
	private int S_ID;
	public int getRB_REQ_ID() {
		return RB_REQ_ID;
	}
	public void setRB_REQ_ID(int rB_REQ_ID) {
		RB_REQ_ID = rB_REQ_ID;
	}
	public int getE_ID() {
		return E_ID;
	}
	public void setE_ID(int e_ID) {
		E_ID = e_ID;
	}
	public int getRB_REQ_AMT() {
		return RB_REQ_AMT;
	}
	public void setRB_REQ_AMT(int rB_REQ_AMT) {
		RB_REQ_AMT = rB_REQ_AMT;
	}
	public int getAPPROVAL() {
		return APPROVAL;
	}
	public void setAPPROVAL(int aPPROVAL) {
		APPROVAL = aPPROVAL;
	}
	public int getS_ID() {
		return S_ID;
	}
	public void setS_ID(int s_ID) {
		S_ID = s_ID;
	}
	@Override
	public String toString() {
		return "RB_Request [RB_REQ_ID=" + RB_REQ_ID + ", E_ID=" + E_ID + ", RB_REQ_AMT=" + RB_REQ_AMT + ", APPROVAL="
				+ APPROVAL + ", S_ID=" + S_ID + "]";
	}

}
