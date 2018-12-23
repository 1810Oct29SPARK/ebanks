package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profile2")
public class ProfileServlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Check whether as session exists for the incoming request
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("username") != null) {
			request.getRequestDispatcher("profile.html").forward(request, response);
		} else {
			response.sendRedirect("login");
		}
	}

}
