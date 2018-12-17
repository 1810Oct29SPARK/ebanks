package com.revature.beans;

public class Employee {

	public Employee(int e_ID, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE, String aDDRESS, int l_ID) {
		super();
		E_ID = e_ID;
		FIRSTNAME = fIRSTNAME;
		LASTNAME = lASTNAME;
		EMAIL = eMAIL;
		PHONE = pHONE;
		ADDRESS = aDDRESS;
		L_ID = l_ID;
	}
	private int E_ID;
    private String FIRSTNAME;
    private String LASTNAME;
    private String EMAIL;
    private String PHONE;
    private String ADDRESS;
    private int L_ID;
    
	public int getE_ID() {
		return E_ID;
	}
	public void setE_ID(int e_ID) {
		E_ID = e_ID;
	}
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}
	public String getLASTNAME() {
		return LASTNAME;
	}
	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public int getL_ID() {
		return L_ID;
	}
	public void setL_ID(int l_ID) {
		L_ID = l_ID;
	}
	@Override
	public String toString() {
		return "Employee [E_ID=" + E_ID + ", FIRSTNAME=" + FIRSTNAME + ", LASTNAME=" + LASTNAME + ", EMAIL=" + EMAIL
				+ ", PHONE=" + PHONE + ", ADDRESS=" + ADDRESS + ", L_ID=" + L_ID + "]";
	}
}