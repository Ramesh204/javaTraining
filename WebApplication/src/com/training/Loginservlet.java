package com.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class Loginservlet
 */
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname = request.getParameter("userName");
		String pword = request.getParameter("passWord");
		
		boolean isValidUser = false;
		
		String errorMessage = "Invalid UserName or PassWord";
		
		 if(uname.equals("India")&&(pword.equals("India"))){
			 isValidUser = true;
		 }
		 
		 RequestDispatcher dispatcher;
		 
		 request.setAttribute("errMsg", errorMessage);
		 
		 if(isValidUser){
			 dispatcher = request.getRequestDispatcher("Success.jsp");
			 
		 }
		 else
		 {
			 dispatcher = request.getRequestDispatcher("Failure.jsp");
		 }
		 dispatcher.forward(request, response);
		//doGet(request, response);
	}

}
