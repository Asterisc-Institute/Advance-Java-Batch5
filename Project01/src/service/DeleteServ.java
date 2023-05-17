package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserDao;


@WebServlet("/delete")
public class DeleteServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int uid=Integer.parseInt(request.getParameter("uid"));
		int pid=Integer.parseInt(request.getParameter("pid"));
		UserDao db=new UserDao();
		
		
		try {
			
			
			int a=db.deleteUser(uid);
			
			if(a>0)
			{
				//out.print("<script type='text/javascript'>alert('Data Deleted !!')</script>");
			    //response.sendRedirect("show?page="+pid);
				
				request.getRequestDispatcher("show?page="+pid).include(request, response);
				out.print("<p style='color : red'>Data Deleted !!</p>");
				
			}
			else 
				out.print("Data Not Deleted !");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
