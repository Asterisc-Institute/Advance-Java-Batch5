

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Topic :	Cookies

@WebServlet("/home")
public class MyServ1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("doGet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
		out.print("welcome to Home : "+name+" "+pass);
	
		
		HttpSession session=request.getSession();//new object HttpSession
		session.setAttribute("uname", name);
		session.setAttribute("upass", pass);
		
		out.print("<br/><br/><br/><a href='profile'>Click</a>");
		

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("doPost");
	}

}
