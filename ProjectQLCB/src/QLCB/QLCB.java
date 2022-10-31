package QLCB;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QLCB implements ICanbo {
	Connection con = getCon();
	public  Connection getCon() {
        Connection con = null; 
		try {          
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlcb_java", "root", "");
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return con;
    }
	
	public boolean insertCB(int soTK, String hoten, String gT, String diachi, int luong) {
		con = getCon();
		String sql = String.format(
				"INSERT INTO `tbcanbo`(`SoTK`, `Hoten`,`GT`, `Diachi`, `Luong`) VALUES ('%d', '%s', '%s', '%s', '%d')",
				soTK, hoten, gT, diachi, luong);
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			return true;
			
		}catch (SQLException ex) {
            ex.printStackTrace();
            }
		return false;
		
		
	}
}
