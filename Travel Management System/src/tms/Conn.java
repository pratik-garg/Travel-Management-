package tms;
import java.sql.*;
public class Conn {
	Connection c;
<<<<<<< HEAD
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

=======
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
>>>>>>> 6642eb361d8dae936bc0814bc00e5ed93353efc9
