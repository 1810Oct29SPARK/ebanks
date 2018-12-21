package com.revature.beans;

public class Employee {

	public Employee(int e_ID, String fIRSTNAME, String lASTNAME, String eMAIL, String pHONE, String aDDRESS,
			int sUPERVISOR, int rEPORTSTO) {
		super();
		E_ID = e_ID;
		FIRSTNAME = fIRSTNAME;
		LASTNAME = lASTNAME;
		EMAIL = eMAIL;
		PHONE = pHONE;
		ADDRESS = aDDRESS;
		SUPERVISOR = sUPERVISOR;
		REPORTSTO = rEPORTSTO;
	}

	private int E_ID;
    private String FIRSTNAME;
    private String LASTNAME;
    private String EMAIL;
    private String PHONE;
    private String ADDRESS;
    private int SUPERVISOR;
    private int REPORTSTO;
    
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

	@Override
	public String toString() {
		return "Employee [E_ID=" + E_ID + ", FIRSTNAME=" + FIRSTNAME + ", LASTNAME=" + LASTNAME + ", EMAIL=" + EMAIL
				+ ", PHONE=" + PHONE + ", ADDRESS=" + ADDRESS + ", SUPERVISOR=" + SUPERVISOR + ", REPORTSTO="
				+ REPORTSTO + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ADDRESS == null) ? 0 : ADDRESS.hashCode());
		result = prime * result + ((EMAIL == null) ? 0 : EMAIL.hashCode());
		result = prime * result + E_ID;
		result = prime * result + ((FIRSTNAME == null) ? 0 : FIRSTNAME.hashCode());
		result = prime * result + ((LASTNAME == null) ? 0 : LASTNAME.hashCode());
		result = prime * result + ((PHONE == null) ? 0 : PHONE.hashCode());
		result = prime * result + REPORTSTO;
		result = prime * result + SUPERVISOR;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ADDRESS == null) {
			if (other.ADDRESS != null)
				return false;
		} else if (!ADDRESS.equals(other.ADDRESS))
			return false;
		if (EMAIL == null) {
			if (other.EMAIL != null)
				return false;
		} else if (!EMAIL.equals(other.EMAIL))
			return false;
		if (E_ID != other.E_ID)
			return false;
		if (FIRSTNAME == null) {
			if (other.FIRSTNAME != null)
				return false;
		} else if (!FIRSTNAME.equals(other.FIRSTNAME))
			return false;
		if (LASTNAME == null) {
			if (other.LASTNAME != null)
				return false;
		} else if (!LASTNAME.equals(other.LASTNAME))
			return false;
		if (PHONE == null) {
			if (other.PHONE != null)
				return false;
		} else if (!PHONE.equals(other.PHONE))
			return false;
		if (REPORTSTO != other.REPORTSTO)
			return false;
		if (SUPERVISOR != other.SUPERVISOR)
			return false;
		return true;
	}
	public int getSUPERVISOR() {
		return SUPERVISOR;
	}
	public void setSUPERVISOR(int sUPERVISOR) {
		SUPERVISOR = sUPERVISOR;
	}
	public int getREPORTSTO() {
		return REPORTSTO;
	}
	public void setREPORTSTO(int rEPORTSTO) {
		REPORTSTO = rEPORTSTO;
	}
}