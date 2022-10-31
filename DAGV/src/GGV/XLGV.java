package GGV;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class XLGV {
	static Connection conn = null;
    private static String DB_URL = "jdbc:mysql://localhost:3306/dlgv_java";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";
    
	public static Connection getConn() {
        try {          
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
	
	public static void getGV(String donvi, int soct) {
		
		try {
			Statement stmt = conn.createStatement();
	    	ResultSet rs = stmt.executeQuery("select * from tbgiangvien where Donvi = '" + donvi + "' and Soct = " + soct);
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getInt(5));
	        }

	    	} catch (SQLException ex) {
	    		ex.printStackTrace();
	    		}
	}
	public static void main(String[] args) {
		getConn();
		getGV("Ha Noi", 29);
	}	
}