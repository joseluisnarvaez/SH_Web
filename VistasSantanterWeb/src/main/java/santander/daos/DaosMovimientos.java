package santander.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;

import java.util.Map;

import org.apache.log4j.Logger;

import santander.Conexion.ConexionSybases;


public class DaosMovimientos {
	
	private static final Logger logger = Logger.getLogger(DaosMovimientos.class);
	
	public Map<String,String> GetMovimiento(){
		String sql =" select * from CCteExt_Tipo_Movto";

		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		Map<String,String> Cuentas = new HashMap<String,String>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(sql);

			
			
			rs = pre.executeQuery();
			
			while (rs.next()) {
				
				Cuentas.put(rs.getString(1),rs.getString(2));

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

		return Cuentas;
		
		
	}
}
