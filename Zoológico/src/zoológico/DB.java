package zoológico;


import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;



public class DB {
	
	private static DB db = new DB();
	static Connection conn;
	static Statement stmt;
	static PreparedStatement pstmt;
	static ResultSet rs;
	private String driverDB = "org.postgresql.Driver";
	private String dbName = "Mamiferos";
	private String urlDB = "jdbc:postgresql://localhost:5432/"+dbName; 
	private String userDB = "postgres";
	private String passwordDB = "17camarones";
	

	public DB() {
		
		try {
			Class.forName("org.postgresql.Driver");
			this.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Zoologico", "postgres", "17camarones");
			JOptionPane.showMessageDialog(null, "Conexion exitosa");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	public static DB getInstances() {
		return db;
	}
	
	public ResultSet dbStatement (String query) {
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString("username"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				this.stmt.close();
				this.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		return rs;
	}
	
		public void dbPrepareStatement(String query, Object[] obj) {
			try {
				this.pstmt = this.conn.prepareStatement(query);
				this.pstmt.setString(1, (String) obj[0]);
				this.pstmt.setString(2, (String) obj[1]);
				this.pstmt.setString(2, (String) obj[1]);
				this.pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}finally {
				try {
					this.pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
	}
		
		public void dbClose(){
			try {
				this.conn.close();
				JOptionPane.showMessageDialog(null, "Conexion cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
}
