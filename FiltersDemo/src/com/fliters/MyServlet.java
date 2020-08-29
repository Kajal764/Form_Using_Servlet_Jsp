package com.fliters;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/addStudent")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("sname");
		int id = Integer.parseInt(request.getParameter("sid"));

		PrintWriter out = response.getWriter();

		out.println("welcome " + name );
	}
}
