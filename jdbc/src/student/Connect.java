package student;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
Connect(){
		
		connect();
	}
	
	public Connection con;
	
	public void connect() {
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	   con=DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/stud","10decoders","10decoders");
	}catch (Exception e) {
		System.out.println(e);
	}
}
	
	      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
