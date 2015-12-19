package GameApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class SampleController {
	
	public void SampleController1()
	{
	/* 
	try{
		//1. get connection to database

			Connection myConn =  DriverManager.getConnection("jdbc:mysql://localhost/moviedb","thomas","123456");
	
			//2. Create a statement
	
			Statement myStmt = myConn.createStatement();
	
	
			//3. execute a SQL query
	
					//read data from database
			ResultSet myRs = myStmt.executeQuery("select * from movie_list");
		
					//insert statement
			String sql = "insert into movie_list (id, name, description) values ('204', 'samu','description12333')";
	
					myStmt.executeUpdate(sql);
					
			System.out.println("insert complete");
			//4. process the result set
	
			while (myRs.next()) {
	
			System.out.println(myRs.getString("name") + "\n\n," + myRs.getString("description"));
			}
		}
		
		catch(Exception exc){

		exc.printStackTrace();

		}
		*/
}
}

