package com.jspdynamicpage.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/add")
public class Logger implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Logger filter called");
		int num1 = Integer.parseInt(req.getParameter("num1"));
		
		if (num1 % 2 == 0) {
			PrintWriter out = res.getWriter();
			out.print("Number is even not able to process");
			System.out.println("Logger filter condition true");
		} else {		
		chain.doFilter(req, res);
		}
	}

}
