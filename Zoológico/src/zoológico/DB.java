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
	private static Connection conn;
	private static Statement stmt;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	private static String driverDB = "org.postgresql.Driver";
	private static String dbName = "Mamiferos";
	private static String urlDB = "jdbc:postgresql://localhost:5432/"+dbName; 
	private static String userDB = "postgres";
	private static String passwordDB = "17camarones";
	

	public DB() {
		
		try {
		
			DB.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Zoologico", "postgres", "17camarones");
			JOptionPane.showMessageDialog(null, "Conexion exitosa");
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static void conec() {
		try {
		
			DB.conn = DriverManager.getConnection(urlDB, userDB, passwordDB);
			JOptionPane.showMessageDialog(null, "Conexion a la DB exitosa");
			
		} catch (SQLException e) {
			e.printStackTrace();
			}
	}
	
	public static void dataMamiferos() {
		
		
		try {
		
			DB.conn = DriverManager.getConnection(urlDB, userDB, passwordDB);
			
			
			stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO Mamiferos(edad, peso, numeroDePatas, nombre, tamaño, medio, genero, alimentacion, color, pelo, numeroDeDientes, "
					+ "numeroDeGlandulasMamarias, cantidadDePelo, oreja, huesosEnElOido)VALUES('"+Integer.parseInt(VentanaZooMamiferos.txtEdad.getText())+"', "
							+ "'"+Integer.parseInt(VentanaZooMamiferos.txtPeso.getText())+"', '"+Integer.parseInt(VentanaZooMamiferos.txtPatas.getText())+"', "
							+ "'"+VentanaZooMamiferos.txtNombre.getText()+"', '"+VentanaZooMamiferos.txtTamaño.getText()+"', '"+VentanaZooMamiferos.txtMedio.getText()+"', '"+VentanaZooMamiferos.txtGenero.getText()+"', "
							+ "'"+VentanaZooMamiferos.txtAlimentacion.getText()+"','"+VentanaZooMamiferos.txtColor.getText()+"', '"+true+"', '"+Integer.parseInt(VentanaZooMamiferos.txtNDientes.getText())+"', '"+Integer.parseInt(VentanaZooMamiferos.txtGMamarias.getText())+"', "
							+ "'"+VentanaZooMamiferos.txtCantPelo.getText()+"', '"+true+"', '"+true+"'");
		} catch (SQLException e) {
			e.printStackTrace();
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
