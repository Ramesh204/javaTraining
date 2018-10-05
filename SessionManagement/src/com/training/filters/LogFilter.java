package com.training.filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class LogFilter
 */
public class LogFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LogFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		Logger log = Logger.getLogger("second");
		
		HttpServletRequest req = (HttpServletRequest) request;
//		System.out.println("One request From"+req.getRemoteAddr()+"  "+req.getRequestURL()+"@"+new Date()+"Recieved");
		
		log.info("One request From"+req.getRemoteAddr()+"  "+req.getRequestURL()+"@"+new Date()+"Recieved");
		chain.doFilter(request, response);
		
		System.out.println("Post Processing");
		
		HttpServletResponse resp = (HttpServletResponse) response;
		
		resp.setContentType("text/html");
		
		resp.getWriter().append("Added by Post Processing by filter");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
