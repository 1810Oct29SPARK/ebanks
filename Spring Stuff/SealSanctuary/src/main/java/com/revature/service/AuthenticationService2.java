package com.revature.service;

import com.revature.beans.Credentials;
import com.revature.beans.User;

public class AuthenticationService2 {

	public AuthenticationService2() {
	}
	
	public User isValidUser(Credentials credentials) {
		User u = null;
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		//this is AUTHENTICATION (does the user exist in the system?)
		//now AUTHORIZATION (what can the user access within the system?) (user roles)
		//take credentials and return the User to which they belong if it exists
		if (username != null && password != null) {
			//for now... this is fake!! 
			if (username.equals("Merlin") && password.equals("wizard")) {
				u = new User(5,username,"Merlin","Cat","wizcat@tampa.com");
			}
		}
		return u;
	}
	

}
