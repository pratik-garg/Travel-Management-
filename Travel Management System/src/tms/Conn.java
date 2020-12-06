package tms;
import java.sql.*;
public class Conn {
	Connection c;
	Statement s;
	public Conn() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms?autoReconnect=true&useSSL=false" , "root" , "AppleOrange123");
			System.out.println("Driver loaded!");
			s = c.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
