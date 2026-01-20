package hotel;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Database Setup and Testing Utility
 * Run this class to verify database connection and setup
 */
public class DatabaseSetup {
	
	public static void main(String[] args) {
		System.out.println("===========================================");
		System.out.println("Hotel Management System - Database Setup");
		System.out.println("===========================================\n");
		
		// Test connection
		System.out.println("Testing database connection...");
		GetConnection gc = new GetConnection();
		Connection conn = gc.getConnection();
		
		if (conn == null) {
			System.err.println("\n❌ DATABASE CONNECTION FAILED!");
			System.err.println("\nSetup Instructions:");
			System.err.println("==================");
			System.err.println("1. Install MySQL Server (if not installed)");
			System.err.println("2. Start MySQL Server");
			System.err.println("3. Open MySQL Command Line or MySQL Workbench");
			System.err.println("4. Run the setup_database.sql script:");
			System.err.println("   mysql -u root -p < setup_database.sql");
			System.err.println("   OR open and execute it in MySQL Workbench");
			System.err.println("5. Update GetConnection.java with your MySQL credentials");
			System.err.println("6. Run this program again to verify\n");
			return;
		}
		
		System.out.println("✅ Database connection successful!\n");
		
		// Verify tables exist
		System.out.println("Verifying database tables...");
		try {
			Statement stmt = conn.createStatement();
			
			// Check login table
			ResultSet rs = stmt.executeQuery("SELECT COUNT(*) as count FROM login");
			if (rs.next()) {
				int count = rs.getInt("count");
				System.out.println("✅ login table: " + count + " records");
			}
			
			// Check restaurant table
			rs = stmt.executeQuery("SELECT COUNT(*) as count FROM restaurant");
			if (rs.next()) {
				int count = rs.getInt("count");
				System.out.println("✅ restaurant table: " + count + " items");
			}
			
			// Check room table
			rs = stmt.executeQuery("SELECT COUNT(*) as count FROM room");
			if (rs.next()) {
				int count = rs.getInt("count");
				System.out.println("✅ room table: " + count + " rooms");
			}
			
			// Check customer table
			rs = stmt.executeQuery("SELECT COUNT(*) as count FROM customer");
			if (rs.next()) {
				int count = rs.getInt("count");
				System.out.println("✅ customer table: " + count + " customers");
			}
			
			// Check restaurantcustomer table
			rs = stmt.executeQuery("SELECT COUNT(*) as count FROM restaurantcustomer");
			if (rs.next()) {
				int count = rs.getInt("count");
				System.out.println("✅ restaurantcustomer table: " + count + " orders");
			}
			
			// Check roomcutomer table
			rs = stmt.executeQuery("SELECT COUNT(*) as count FROM roomcutomer");
			if (rs.next()) {
				int count = rs.getInt("count");
				System.out.println("✅ roomcutomer table: " + count + " bookings");
			}
			
			System.out.println("\n===========================================");
			System.out.println("✅ DATABASE SETUP COMPLETE!");
			System.out.println("===========================================");
			System.out.println("\nDefault Login Credentials:");
			System.out.println("  Username: renaissance");
			System.out.println("  Password: renaissance");
			System.out.println("\nYou can now run the application:");
			System.out.println("  java -cp \"bin;External_JARS\\*\" hotel.loginPage\n");
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.err.println("\n❌ ERROR: Some tables are missing!");
			System.err.println("Please run setup_database.sql to create all required tables.\n");
			e.printStackTrace();
		}
	}
}
