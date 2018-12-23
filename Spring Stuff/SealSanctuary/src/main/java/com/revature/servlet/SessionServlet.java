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
		//sets a header of content type
		resp.setContentType("application/json");
		//grab current session and check if it exists
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("username") != null) {
			try {
			int E_ID = Integer.parseInt(session.getAttribute("E_ID").toString());
			String LOGIN = session.getAttribute("LOGIN").toString();
			String PASS = session.getAttribute("PASS").toString();
			String FIRSTNAME = session.getAttribute("FIRSTNAME").toString();
			String LASTNAME = session.getAttribute("LASTNAME").toString();
			String EMAIL = session.getAttribute("EMAIL").toString();
			String PHONE = session.getAttribute("PHONE").toString();
			String ADDRESS = session.getAttribute("ADDRESS").toString();
			int SUPERVISOR = Integer.parseInt(session.getAttribute("SUPERVISOR").toString());
			int REPORTSTO = Integer.parseInt(session.getAttribute("REPORTSTO").toString());
			

			Employee e = new Employee(E_ID, LOGIN, PASS, FIRSTNAME, LASTNAME, EMAIL, PHONE, ADDRESS, SUPERVISOR, REPORTSTO);
			resp.getWriter().write((new ObjectMapper()).writeValueAsString(e));
			} catch (Exception e) {
				resp.getWriter().write("{\"session\":null}");
		} 
			
		} else {
			resp.getWriter().write("{\"session\":null}");
	}

}
}