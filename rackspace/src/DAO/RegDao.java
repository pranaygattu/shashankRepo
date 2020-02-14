package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegDao {
	public boolean RegisDao(RegistrationDto rdt) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean status = false;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bag1","root","root");
		
		if(conn!=null)
		{
			System.out.println("DB created successfully");
			pstmt = conn.prepareStatement("insert into sha values(?,?,?,?,?)");
			pstmt.setInt(1,rdt.getCnum());
			pstmt.setString(2,rdt.getCname());
			pstmt.setString(3,rdt.getGender());
			pstmt.setString(4,rdt.getCity());
			pstmt.setString(5,rdt.getHobbies());
			int ab = pstmt.executeUpdate();
			if(ab>0) {
				status = true;
			}
}
	}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	return status;
}
}

