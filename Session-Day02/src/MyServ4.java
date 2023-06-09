

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logout")
public class MyServ4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("doGet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("nav.html");
		dispatcher.include(request, response);
		
		Cookie c=new Cookie("uname", "");
		Cookie c1=new Cookie("upass", "");
		
		c.setMaxAge(0);
		c1.setMaxAge(0);
		
		response.addCookie(c);
		response.addCookie(c1);
		
		out.print("you are successfully logged out!");
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("doPost");
	}

}
