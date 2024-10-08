package com.jspdynamicpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		HttpSession session = req.getSession();
		
//		int k = (int)session.getAttribute("k");
		
		int k = 0;
		
		for(Cookie cookie: req.getCookies()) {
			if(cookie.getName().equals("k"))
				k = Integer.parseInt(cookie.getValue());
		}
		
		k = k*k;
		PrintWriter out = res.getWriter();
		out.print("Sq Result: " + k);
	}

}
