package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;

@WebServlet("/show")
public class ShowServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>");
		out.print("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js'></script>");
		out.print("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
		  
		out.print("<div style='padding:20px 60px 30px 60px'>");
		out.print("<center><H2>All User Data</H2></center>");
		
		
		UserDao db=new UserDao();
		
		
		out.print("<table class='table'>");
		out.print("    <thead>");
		out.print("      <tr>");
		out.print("        <th>UserID</th>");
		out.print("        <th>FullName</th>");
		out.print("        <th>Username</th>");
		out.print("        <th>Email</th>");
		out.print("        <th>Mobile</th>");
		out.print("        <th>Gender</th>");
		out.print("        <th>Action</th>");
		out.print("      </tr>");
		out.print("    </thead>");
		out.print("    <tbody>");
		
		try {
			ArrayList<User> ul=db.getAllUser();
			
			for(User u:ul)
			{
			//out.print(u+"<br/>");
				//uid, fname, uname, email, mob, upass, gender
				out.print("<tr>");
				out.print("<td>"+u.getUid()+"</td>");
				out.print("<td>"+u.getFname()+"</td>");
				out.print("<td>"+u.getUname()+"</td>");
				out.print("<td>"+u.getEmail()+"</td>");
				out.print("<td>"+u.getMob()+"</td>");
				//out.print("<td>"+u.getUpass()+"</td>");
				out.print("<td>"+u.getGender()+"</td>");
				out.print("<td><a href='#' class='btn btn-primary'>Edit</a> &nbsp;&nbsp;&nbsp; <a href='#' class='btn btn-danger'>Delete</a></td>");
				out.print("</tr>");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		out.print("    </tbody>");
		out.print("</table>");
		
		out.print("<center>");
		out.print("<ul class='pagination'>");
		out.print("  <li><a href='#'>1</a></li>");
		out.print("  <li class='active'><a href='#'>2</a></li>");
		out.print("  <li><a href='#'>3</a></li>");
		out.print("  <li><a href='#'>4</a></li>");
		out.print("  <li><a href='#'>5</a></li>");
		out.print("</ul>");
		out.print("</center>");
		out.print("</div>");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
