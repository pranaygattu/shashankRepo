package registration;

import java.io.IOException;


import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import DAO.RegDao;
import DAO.RegistrationDto;
import Service.RegService;

public class Reg extends GenericServlet {

	@Override
	public void service(ServletRequest sreq, ServletResponse sres) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer number = Integer.parseInt(sreq.getParameter("cnum"));
		String name = sreq.getParameter("cname");
		String gender = sreq.getParameter("gender");
		String city = sreq.getParameter("city");
		String Hobbies = sreq.getParameter("hobbies1")+" "+sreq.getParameter("hobbies2")+" "+sreq.getParameter("hobbies3");
		
		RegistrationDto rdt = new RegistrationDto(number, name, gender, city, Hobbies);
		
		RegService rs = new RegService();
		boolean flag = rs.RegService(rdt);
		if(flag) {
			sreq.setAttribute("sucess","Record inserted");
			RequestDispatcher rt = sreq.getRequestDispatcher("/WEB-INF/JSP/Registration.jsp");
			rt.forward(sreq, sres);
		}else {
			sreq.setAttribute("error", "Records not inserted");
			RequestDispatcher rt = sreq.getRequestDispatcher("/WEB-INF/JSP/Registration.jsp");
			rt.forward(sreq, sres);
		}
		
	}
	

}
