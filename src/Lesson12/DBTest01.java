package Lesson12;

import java.sql.*;

public class DBTest01 {

	public static void main(String[] args) {
		try {
			Class. DBTest01forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:test.db");
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO testtable(id,name) VALUES(1,��ȫ�浿')";	
			stmt.executeUpdate(sql);			
		} catch (Exception e) {
			e.printStackTrace();
	        System.exit(0);
		}

	}

}
