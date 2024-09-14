package com.jspdynamicpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = (int) req.getAttribute("k");
		k = k*k;
		PrintWriter out = res.getWriter();
		out.print("Sq Result: " + k);
	}

}
