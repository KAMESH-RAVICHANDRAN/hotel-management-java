package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	
	Connection connect;
	
	// Database configuration constants
	private static final String DB_URL = "jdbc:mysql://localhost:3306/renaissance?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";
	
	public Connection getConnection()
	{   
		try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Establish connection
			connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			if (connect != null) {
				System.out.println("Database connected successfully!");
			}
           
		}
		catch(ClassNotFoundException e)
		{
			System.err.println("MySQL JDBC Driver not found!");
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			System.err.println("Database connection failed!");
			System.err.println("Error: " + e.getMessage());
			System.err.println("\nPlease ensure:");
			System.err.println("1. MySQL server is running");
			System.err.println("2. Database 'renaissance' exists");
			System.err.println("3. Username and password are correct");
			System.err.println("4. Run setup_database.sql to create the database");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.err.println("Unexpected error during database connection!");
			e.printStackTrace();
		}
		return connect;
	}
	
	// Method to test database connection
	public static boolean testConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection testConn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			if (testConn != null) {
				testConn.close();
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

}
