package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.service.AuthenticationService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AuthenticationService authService = new AuthenticationService();

	//return Login page for GET request
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("login.html").forward(req, resp);
		
	}
	
	//handle POST request from form on Login page
	//(or anywhere else)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// checks whether a session exists, otherwise creates a new one. 
		// overloaded version takes a boolean create param, if false it returns 
		// null if no session exists for the current request. 
		HttpSession session = req.getSession(); 
		resp.setContentType("text/html");
		//grab params from request 
		Credentials cred = new Credentials(req.getParameter("username"),req.getParameter("password"));
		//attempt to authenticate the user
		Employee e = authService.isValidUser(cred);
		//set user information as session attributes
		if (e != null) {
			session.setAttribute("e_id", e.getE_ID());
			session.setAttribute("login", e.getLOGIN());
			session.setAttribute("firstname", e.getFIRSTNAME());
			session.setAttribute("lastname", e.getLASTNAME());
			session.setAttribute("email", e.getEMAIL());
			session.setAttribute("phone", e.getPHONE());
			session.setAttribute("address", e.getADDRESS());
			session.setAttribute("supervisor", e.getSUPERVISOR());
			session.setAttribute("reportsto", e.getREPORTSTO());
			session.setAttribute("problem", null);
			//redirect user to profile page if authenticated
			resp.sendRedirect("profile");
		} else {
			session.setAttribute("problem", "invalid credentials");
			//redirect user to login page if authentication fails
			resp.sendRedirect("login");
		}
		
	}


}