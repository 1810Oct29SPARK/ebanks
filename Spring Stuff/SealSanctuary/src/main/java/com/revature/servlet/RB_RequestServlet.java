package com.revature.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.RB_Request;
import com.revature.impl.RB_RequestImpl;
import com.revature.service.RB_RequestService;

public class RB_RequestServlet extends HttpServlet {
	RB_RequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append(RB_RequestService.getRB_RequestsJSON());
		}
		
		/*
		response.setContentType("application/json");
		HttpSession session = request.getSession(false);
		RB_RequestImpl rbimp = new RB_RequestImpl();
		int E_ID =Integer.parseInt(session.getAttribute("E_ID").toString());
		List<RB_Request> rbreq = rbimp.getRB_RequestById(E_ID);
		response.getWriter().write((new ObjectMapper()).writeValueAsString(reimbursements));
		*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}