package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;


@WebServlet("/regServ")
public class RegiterServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fname");
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String mob=request.getParameter("mob");
		String upass=request.getParameter("upass");
		String cpass=request.getParameter("cpass");
		String gender=request.getParameter("gender");
		
		
		User u=new User(fname, uname, email, mob, upass, cpass, gender);
	
		//out.print(u);
		//System.out.println("Date :"+u);
		
		UserDao db=new UserDao();
		
		try {
			
			if(!db.checkUser(email))
			{
			
			
			try {
				
				int a=db.save(u);
				if(a>0)
					out.print("<br/><br/>Data Inserted<br/>");
				else
					out.print("<br/><br/>Data Not Inserted<br/>");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			else
			{
				out.print("<br/><br/>User Already Register<br/>");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
