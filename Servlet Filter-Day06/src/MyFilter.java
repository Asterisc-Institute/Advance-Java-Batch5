

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//@WebFilter("/home")
public class MyFilter implements Filter {

   
    public MyFilter() {
    }

    public void init(FilterConfig fConfig) throws ServletException {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		System.out.println("i am MyFilter");
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		if(name.equals("")||pass.equals(""))
		{
			out.print("Please Enter UserName and Password");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else
		{
			out.print("pre Processing<br/><br/>");
			chain.doFilter(request, response);
			out.print("<br/><br/>post Processing<br/><br/>");
		}
	
		
	}
	

	public void destroy() {
	}


}
