package santander.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import santander.Conexion.ConexionSybases;

public class SponsorDao {
private static final Logger logger = Logger.getLogger(SponsorDao.class);
	
	public Map<String,String> GetSponsor(int Rut){
		String sql = "SELECT b.CCCExt_RutSponsor,b.CCCExt_Nombre_Sponsor FROM dbo.CCteExt_RelUsr_Sponsor a, dbo.CCteExt_Sponsor b WHERE  a.CCCExt_Sponsor=b.CCCExt_Sponsor and CCCExt_RutUsuario=  ?";

		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		Map<String,String> Cuentas = new HashMap<String,String>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(sql);
			pre.setInt(1, Rut);
			
			
			
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
