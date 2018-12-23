package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Employee;
import com.revature.beans.RB_Request;
import com.revature.dao.EmployeeDAO;
import com.revature.dao.RB_RequestDAO;
import com.revature.impl.EmployeeImpl;
import com.revature.impl.RB_RequestImpl;


public class RB_RequestService {

	private ObjectMapper om = new ObjectMapper();

	public String getRB_RequestsJSON(){
		RB_RequestDAO rbdao = new RB_RequestImpl();
		List<RB_Request> rblist = rbdao.getRB_Request();
		String rbString = "";
		try {
			rbString = om.writeValueAsString(rblist);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return rbString;
	}

}
