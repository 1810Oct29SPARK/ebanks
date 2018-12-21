package com.revature.beans;

public class Login {

	public Login(int l_ID, int e_ID, String lOGIN, String pASS) {
		super();
		L_ID = l_ID;
		E_ID = e_ID;
		LOGIN = lOGIN;
		PASS = pASS;
	}
	
	private int L_ID;
	private int E_ID;
	private static String LOGIN;
	
	private String PASS;
	public int getL_ID() {
		return L_ID;
	}
	public void setL_ID(int l_ID) {
		L_ID = l_ID;
	}
	public int getE_ID() {
		return E_ID;
	}
	public void setE_ID(int e_ID) {
		E_ID = e_ID;
	}
	public String getLOGIN() {
		return LOGIN;
	}
	public void setLOGIN(String lOGIN) {
		LOGIN = lOGIN;
	}
	public String getPASS() {
		return PASS;
	}
	public void setPASS(String pASS) {
		PASS = pASS;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + E_ID;
		result = prime * result + ((LOGIN == null) ? 0 : LOGIN.hashCode());
		result = prime * result + L_ID;
		result = prime * result + ((PASS == null) ? 0 : PASS.hashCode());
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
		Login other = (Login) obj;
		if (E_ID != other.E_ID)
			return false;
		if (LOGIN == null) {
			if (other.LOGIN != null)
				return false;
		} else if (!LOGIN.equals(other.LOGIN))
			return false;
		if (L_ID != other.L_ID)
			return false;
		if (PASS == null) {
			if (other.PASS != null)
				return false;
		} else if (!PASS.equals(other.PASS))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Login [L_ID=" + L_ID + ", E_ID=" + E_ID + ", LOGIN=" + LOGIN + ", PASS=" + PASS + "]";
	}

}
