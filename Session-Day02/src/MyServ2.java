

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/profile")
public class MyServ2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("doGet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		Cookie d[]=request.getCookies();
		if(d!=null)
		{
		RequestDispatcher dispatcher=request.getRequestDispatcher("nav.html");
		dispatcher.include(request, response);
		out.print("welcome to Profile : "+d[0].getValue()+" "+d[1].getValue());
		}
		else
		{
			RequestDispatcher dispatcher1=request.getRequestDispatcher("index.html");
			dispatcher1.include(request, response);
			out.print("Please Login first");
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("doPost");
	}

}
