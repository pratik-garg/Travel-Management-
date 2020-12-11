package tms;
import java.sql.*;
public class Conn {
	Connection c;
	Statement st;
	public Conn(){
		try {
			String url = "jdbc:mysql://localhost:3306/tms?" + "autoReconnect=true&useSSL=false" ;
			String user = "root" ;
			String password = "password";
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection(url,user,password);
			st = c.createStatement();
		
		/*	st.close();
			c.close();
		*/	
		}catch(Exception e) {}
	}
}

