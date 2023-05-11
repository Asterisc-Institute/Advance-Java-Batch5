package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

	String driver = "com.mysql.jdbc.Driver";
	String db_name = "batch5";
	String db_url = "jdbc:mysql://localhost:3306/" + db_name;
	String db_uname = "root";
	String db_upass = "abc123";

	Connection getConnect() throws ClassNotFoundException, SQLException 
	{
		Class.forName(driver); //s1
		Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);//s2
		return con;
	}

	public int save(User u) throws ClassNotFoundException, SQLException
	{
		String sql="insert into user_tbl (fname, uname, email, mob, upass, gender) values(?,?,?,?,?,?)";
		Connection con=getConnect();
		PreparedStatement ps=con.prepareStatement(sql);//s3
		ps.setString(1, u.getFname());
		ps.setString(2, u.getUname());
		ps.setString(3, u.getEmail());
		ps.setString(4, u.getMob());
		ps.setString(5, u.getUpass());
		ps.setString(6, u.getGender());
		
		int a =ps.executeUpdate();//s4
		
		con.close();//s5
		return a;
		
	}
	
	
	
}
