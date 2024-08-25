package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	 public static Connection connectWithDb(){
		 Connection con=null;
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","username","password");
				return con;
			 }
			 catch(ClassNotFoundException e) {
				 System.out.println("Exception :"+e);
			 }
			 	
			catch(SQLException c) {
				System.out.println("Exception:"+c);
			}
		 	return con;
	 } 

}
