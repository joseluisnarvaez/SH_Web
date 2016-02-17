package santander.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import santander.Conexion.ConexionSybases;

public class DaoUsuarios {
	private static final Logger logger = Logger.getLogger(DaoUsuarios.class);
	
	public String getUsuario(String Rut, String pass){
		
		String query = "select Rut from RlsMst..Usuarios where Usuario= ? and Clave=?";
		String rut=null;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(query);
			pre.setString(1, Rut);
			pre.setString(2, pass);
			
			
			
			rs = pre.executeQuery();

			while (rs.next()) {
				rut=rs.getString(1);

			}

		} catch (Exception e) {
			 logger.error("Error, causa:" , e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					 logger.error("Error, causa:" , e);
				}
			}
			if (pre != null) {
				try {
					pre.close();
				} catch (SQLException e) {
					 logger.error("Error, causa:" ,
					 e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					 logger.error("Error, causa:" ,
					 e);
				}
			}

		}
		return rut;
		
	}
	
public String getCorreo(int Rut){
		
		String query = "select EMail from RlsMst..Usuarios where Rut=?";
		String rut=null;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(query);
			pre.setInt(1, Rut);
			
			
			
			rs = pre.executeQuery();

			while (rs.next()) {
				rut=rs.getString(1);

			}

		} catch (Exception e) {
			 logger.error("Error, causa:" , e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					 logger.error("Error, causa:" , e);
				}
			}
			if (pre != null) {
				try {
					pre.close();
				} catch (SQLException e) {
					 logger.error("Error, causa:" ,
					 e);
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					 logger.error("Error, causa:" ,
					 e);
				}
			}

		}
		return rut;
		
	}

}
