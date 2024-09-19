package com.jspdynamicpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6709018845456274700L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int int1 = Integer.parseInt(req.getParameter("num1"));

//		res.addCookie(new Cookie("k", int1 + ""));
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", int1);
		
//		res.sendRedirect("sq");
		
//		res.sendRedirect("sq?k=" + int1); // URL Rewriting.
		
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/sq");
//		
//		requestDispatcher.forward(req, res);
		
		
		PrintWriter writer = res.getWriter();
		int ans = int1 * int1;
		writer.print("<p>Result: " + ans + "</p>");
	}
}
