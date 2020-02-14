package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	public boolean isValidUser(String username,String password) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		boolean status = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","root");
			if(conn!=null)
			{
				pst = conn.prepareStatement("Select*from info where username = ? and pin = ? ");
				pst.setString(1, username);
				pst.setString(2, password);
				rs = pst.executeQuery();
				while(rs.next()) 
				{
					return true;
				}
			}
			else 
			{
			System.out.println("error");
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		return status;
		}
	}

