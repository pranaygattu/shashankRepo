package login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import Service.LoginService;

public class LoginServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse rqs) throws ServletException, IOException {
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	System.out.println(username+password);
	LoginService ls = new LoginService();
	boolean flag =  ls.isValidUser(username,password);
		if(flag==true) {
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/Home.jsp");
			rd.forward(req, rqs);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/Error.jsp");
		}
	}
	

}
