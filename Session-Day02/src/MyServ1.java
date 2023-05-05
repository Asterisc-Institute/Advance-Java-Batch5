

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Topic :	Cookies

@WebServlet("/home")
public class MyServ1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("doGet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("nav.html");
		dispatcher.include(request, response);
		
		
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		out.print("welcome to Home : "+name+" "+pass);
	
		Cookie c=new Cookie("uname", name);
		response.addCookie(c);
		response.addCookie(new Cookie("upass", pass));
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("doPost");
	}

}
