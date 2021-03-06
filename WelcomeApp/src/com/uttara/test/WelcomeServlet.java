package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        System.out.println("in no-arg constr of WS");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet() of WS");
		//access user inputs
		//validate
		//show output msg
		
		String fname = request.getParameter("uname");
		
		String a = request.getParameter("age");
		
		StringBuilder sb = new StringBuilder();
		if(name==null || name.trim().equals(""))
			sb.append("Your parents did not name you or what!!Enter name!<br/>");
		else
			if(name.length() > 30)
				sb.append("Your name is too long. Cut it and come back!<br/>");
		
		if(a == null || a.trim().equals(""))
			sb.append("Do you exist? Or are you a ghost or yet to be born? Enter age!!<br/>"); 

		int num = 0;
		try
		{
			num = Integer.parseInt(a);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			sb.append("Age must be in integer digits, you mutthal!!");
		}

		String msg = sb.toString();
		
		PrintWriter pw = response.getWriter();
		
		if(msg.equals(""))
		{
			//validation has succeeded!
			if(num < 50)
				pw.write("<html><body><h1>Welcome youngling, "+name+"</h1></body></html>");
			else
				pw.write("<html><body><h1>Welcome oldie-goldie, "+name+"</h1></body></html>");
		}
		else{
			//validation has failed!
			pw.write("<html><body><h1>Error</h1><b>"+msg+"</b></body></html>");
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doPost() of WS");
	}

}
