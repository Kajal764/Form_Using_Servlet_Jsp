package com.fliters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/addStudent")
public class IdFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();

		HttpServletRequest req = (HttpServletRequest) request;
		int aid = Integer.parseInt(req.getParameter("sid"));

		if (aid >= 1)
			chain.doFilter(request, response);
		else
			out.print("Invalid input");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
