package com.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DemoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("city", "Benaglore");
		
		System.out.println("creation Time"+session.getCreationTime());
		System.out.println("Last Accessed Time"+session.getLastAccessedTime());
		
		
		session.removeAttribute("name");
		
		
		long timeElasped = session.getLastAccessedTime()-session.getCreationTime();
		long inactiveTime = session.getMaxInactiveInterval();
		
		if(timeElasped>inactiveTime){session.invalidate();}
		System.out.println(timeElasped);
		
//		session.invalidate();  called by our own 
		
		response.getWriter().println("<a href='Info.jsp'>Info</a>");
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Info.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
