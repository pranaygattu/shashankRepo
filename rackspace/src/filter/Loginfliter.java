package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Loginfilter
 */
@WebFilter("/Loginfliter")
public class Loginfliter implements Filter {

    /**
     * Default constructor. 
     */
    public Loginfliter() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("virat")&&password.equals("dhoni")) {
			RequestDispatcher rq =request.getRequestDispatcher("/WEB-INF/JSP/admin.jsp");
			rq.forward(request, response);
		}
		else {
			RequestDispatcher rq =request.getRequestDispatcher("/WEB-INF/JSP/Error.jsp");
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
