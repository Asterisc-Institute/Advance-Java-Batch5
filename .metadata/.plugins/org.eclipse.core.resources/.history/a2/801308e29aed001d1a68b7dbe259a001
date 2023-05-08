

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

@WebServlet("/profile")
public class MyServ2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("doGet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		out.print("welcome to profile : "+name+" "+pass);
	
		out.print("<form action='about'>");
		out.print("<input type='hidden' name='uname' value='"+name+"'>");
		out.print("<input type='hidden' name='upass' value='"+pass+"'>");
		out.print("<input type='submit' value='click'>");
		out.print("</form>");
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("doPost");
	}

}
