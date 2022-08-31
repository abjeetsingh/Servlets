package com.demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet {
	// Creating a Life Cycle

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		PrintWriter dedo = res.getWriter();
		dedo.println(k);
	}
	
	
	//creating a post 
}
