package com.jspdynamicpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6709018845456274700L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int int1 = Integer.parseInt(req.getParameter("num1"));
		
		PrintWriter writer = res.getWriter();
		int ans = int1 * int1;
		writer.print("<p>Result: " + ans + "</p>");
	}
}
