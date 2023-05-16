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

@WebServlet("/loginServ")
public class LoginServ extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		

		String email=request.getParameter("email");
		String upass=request.getParameter("upass");
		
		UserDao db=new UserDao();
		
		try {
			
			if(db.loginUser(email,upass))
			{
			
			response.sendRedirect("show");
			}
			else
			{
				out.print("<br/><br/><p style='color:red'>WRONG! Email or Password</p><br/>");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
