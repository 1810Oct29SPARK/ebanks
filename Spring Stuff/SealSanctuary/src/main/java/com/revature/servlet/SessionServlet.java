package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Employee;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("application/json");
		HttpSession session = req.getSession(false);
		if (session != null) {
			try {
			int E_ID = Integer.parseInt(session.getAttribute("e_id").toString());
			String LOGIN = session.getAttribute("login").toString();
			String PASS = session.getAttribute("pass").toString();
			String FIRSTNAME = session.getAttribute("firstname").toString();
			String LASTNAME = session.getAttribute("lastname").toString();
			String EMAIL = session.getAttribute("email").toString();
			String PHONE = session.getAttribute("phone").toString();
			String ADDRESS = session.getAttribute("address").toString();
			int SUPERVISOR = Integer.parseInt(session.getAttribute("supervisor").toString());
			int REPORTSTO = Integer.parseInt(session.getAttribute("reportsto").toString());
			

			Employee e = new Employee(E_ID, LOGIN, PASS, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, SUPERVISOR, REPORTSTO);
			resp.getWriter().write((new ObjectMapper()).writeValueAsString(e));
			
			} catch (Exception e) {
				resp.getWriter().write("{\"session\":null}");
		} 
		}
			

	}
	
	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("application/json");
		HttpSession session = req.getSession(false);
		if (session != null) {
			try {
			int E_ID = Integer.parseInt(session.getAttribute("e_id").toString());
			String LOGIN = session.getAttribute("login").toString();
			String PASS = session.getAttribute("pass").toString();
			String FIRSTNAME = session.getAttribute("firstname").toString();
			String LASTNAME = session.getAttribute("lastname").toString();
			String EMAIL = session.getAttribute("email").toString();
			String PHONE = session.getAttribute("phone").toString();
			String ADDRESS = session.getAttribute("address").toString();
			int SUPERVISOR = Integer.parseInt(session.getAttribute("superior").toString());
			int REPORTSTO = Integer.parseInt(session.getAttribute("reportsto").toString());
			

			Employee e = new Employee(E_ID, LOGIN, PASS, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, SUPERVISOR, REPORTSTO);
			resp.getWriter().write((new ObjectMapper()).writeValueAsString(e));
			
			} catch (Exception e) {
				resp.getWriter().write("{\"session\":null}");
		} 
		}
			

	}

}