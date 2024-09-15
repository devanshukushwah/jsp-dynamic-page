package com.jspdynamicpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig servletConfig = getServletConfig();
		ServletContext servletContext = getServletContext();
		
		PrintWriter writer = resp.getWriter();
		writer.println("using ServletContext(global level) name: " + servletContext.getInitParameter("name"));
		writer.println("using ServletConfig(servlet level) name: " + servletConfig.getInitParameter("name"));
	}

}
