package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.io.IOException;


public class Regdao {

	public ArrayList<Regdetails> getdetails(){
		ArrayList<Regdetails> list = new ArrayList<Regdetails>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bag1","root","root");
			
			if(conn!=null)
			{
				System.out.println("DB connected successfully");
				pstmt = conn.prepareStatement("select*from sha");
				rs=pstmt.executeQuery();
				while(rs.next()) {
					Regdetails cd = new Regdetails();
					cd.setCnum(rs.getInt(1));
					cd.setCname(rs.getString(2));
					cd.setGender(rs.getString(3));
					cd.setCity(rs.getString(4));
					cd.setHobbiess(rs.getString(5));
					list.add(cd);
				}
			}
			
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return list;
	}
}
