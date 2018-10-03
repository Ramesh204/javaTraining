package com.training;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddToCart
 */
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddToCart() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		
		Map<String,String[]> items = (Map<String, String[]>) session.getAttribute("cart");
		
		RequestDispatcher dispatcher = null;
		
		if((int)session.getAttribute("jspPage")==1){
			
			String[] arr = new String[1];
			arr[0] =  request.getParameter("bookSelected") ;
			items=new HashMap<>();
			items.put("Books", arr);
			
			dispatcher = request.getRequestDispatcher("gadget.jsp");
		}
		else if((int)session.getAttribute("jspPage")==2){
			
			System.out.println(items);
			String[] arr = new String[1];
			arr[0] =  request.getParameter("gadgetSelected") ;
			
			
			items.put("Gadgets", arr);
			dispatcher = request.getRequestDispatcher("coupons.jsp");
		}
		else{
			items.put("Coupons", request.getParameterValues("coupnSelected"));
			dispatcher = request.getRequestDispatcher("cartItems.jsp");
		}
		
		session.setAttribute("cart", items);
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
