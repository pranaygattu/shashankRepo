package DAO;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import database.Regdetails;
import registration.Reginfo;

public class RegServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	Reginfo cds = new Reginfo();
	ArrayList<Regdetails> list = cds.getRegdetails();
	for( Regdetails rdto:list)
		System.out.println(rdto.getCnum()+""+rdto.getCname()+""+rdto.getGender()+""+rdto.getCity()+""+rdto.getHobbiess());
		if(list!=null) {
			req.setAttribute("sucess", list);
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/data.jsp");
			rd.forward(req, res);
		}
		else{
			req.setAttribute("error","error display");
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/Home.jsp");
			rd.forward(req, res);
		}
	}
}


