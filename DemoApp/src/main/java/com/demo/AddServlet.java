package com.demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet {
	// Creating a Life Cycle

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
//		PrintWriter dedo = res.getWriter();
//		dedo.println(k);
		req.setAttribute("k",k);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req,res);
		
		//Session Management - when you want to pass some data from one servlet to another
	
		
	
	}
	
	
	//Request Dispatcher
	
	
}
