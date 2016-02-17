package santander.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;


import org.apache.log4j.Logger;

import santander.Conexion.ConexionSybases;
import santander.beans.Bitacora;

public class DaoBitacora {
	private static final Logger logger = Logger.getLogger(DaoBitacora.class);
	
	
	public List<Bitacora> GetBitacoras(String Sponsor){
		
		String sql ="SELECT b.CCCExt_ID_Bitacora,"
						  + "convert(char(10),b.CCCExt_Fecha_Carga,103) as CCCExt_Fecha_Carga,(convert(char(8),b.CCCExt_Fecha_Carga,118)) As hora,"
						  + "b.CCCExt_CantReg_Infor,"
						  + "b.CCCExt_Nom_Arch_Orig,"
						  + "b.CCCExt_MontoPagado_Info,"
						  + " a.CCCExt_Glosa_Tipo"
					+ " FROM dbo.CCteExt_Bitacora b "
					+ " INNER JOIN  dbo.CCteExt_Tipo_Movto a  on a.CCCExt_Cod_Tipo=b.CCCExt_Cod_Tipo "
					+ "WHERE b.CCCExt_Estado_Proc =2 and"
						  + " b.CCCExt_Sponsor=?";

			
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		List<Bitacora> Cuentas = new ArrayList<Bitacora>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(sql);
			pre.setInt(1, Integer.parseInt(Sponsor));

			
			
			rs = pre.executeQuery();
			
			while (rs.next()) {
				Bitacora bi=new Bitacora();

				bi.setCCCExt_Fecha_Carga(rs.getString("CCCExt_Fecha_Carga"));
				bi.setHora_Carga(rs.getString("hora"));
				bi.setCCCExt_CantReg_Infor(rs.getInt("CCCExt_CantReg_Infor"));
				bi.setCCCExt_ID(rs.getInt("CCCExt_ID_Bitacora"));
				bi.setCCCExt_MontoPagado_Info(rs.getDouble("CCCExt_MontoPagado_Info"));
				bi.setCCCExt_Nom_Arch_Orig(rs.getString("CCCExt_Nom_Arch_Orig"));
				bi.setDesc_Tipo(rs.getString("CCCExt_Glosa_Tipo"));
				Cuentas.add(bi);
				

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
	
	public void UpdateEstado(int id,int cod){
		String sql ="   UPDATE dbo.CCteExt_Bitacora        "
					+ "SET CCCExt_Estado_Proc=?"
					+ "       WHERE CCCExt_ID_Bitacora =?";

		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(sql);
			pre.setInt(1,cod);
			pre.setInt(2,id);

			pre.executeUpdate();
			
			
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


		
		
	}
	public String GetRuta(int id){
		String sql ="SELECT CCCExt_Ruta_Respaldo "
					+ "FROM dbo.CCteExt_Bitacora "
					+ "WHERE  CCCExt_ID=?";

		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		String ruta=null;
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(sql);
			pre.setInt(1,id);

			
			
			rs = pre.executeQuery();
			
			while (rs.next()) {

				ruta=rs.getString(1);
			
				

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

		return ruta;
		
		
	}
	
	public List<Bitacora> getAll(){
		String sql ="SELECT CCCExt_ID_Bitacora,"
						  + "convert(char(10),getdate(),103) as CCCExt_Fecha_Carga,(convert(char(8),getdate(),118)) As hora,"
						  + "CCCExt_CantReg_Infor,"
						  + "CCCExt_Nom_Arch_Orig,"
						  + "CCCExt_MontoPagado_Info "
					+ "FROM dbo.CCteExt_Bitacora "
					+ "WHERE CCCExt_Estado_Proc =4 ";
					

		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		List<Bitacora> Cuentas = new ArrayList<Bitacora>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(sql);
			

			
			
			rs = pre.executeQuery();
			
			while (rs.next()) {
				Bitacora bi=new Bitacora();

				bi.setCCCExt_Fecha_Carga(rs.getString("CCCExt_Fecha_Carga"));
				bi.setHora_Carga(rs.getString("hora"));
				bi.setCCCExt_CantReg_Infor(rs.getInt("CCCExt_CantReg_Infor"));
				bi.setCCCExt_ID(rs.getInt("CCCExt_ID_Bitacora"));
				bi.setCCCExt_MontoPagado_Info(rs.getDouble("CCCExt_MontoPagado_Info"));
				bi.setCCCExt_Nom_Arch_Orig(rs.getString("CCCExt_Nom_Arch_Orig"));
				Cuentas.add(bi);
				

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
	
	
	public List<Bitacora> getByID(int id){
		String sql ="SELECT CCCExt_ID_Bitacora,"
						  + "convert(char(10),getdate(),103) as CCCExt_Fecha_Carga,(convert(char(8),getdate(),118)) As hora,"
						  + "CCCExt_CantReg_Infor,"
						  + "CCCExt_Nom_Arch_Orig,"
						  + "CCCExt_MontoPagado_Info "
					+ "FROM dbo.CCteExt_Bitacora "
					+ "WHERE CCCExt_Estado_Proc !=100 ";
					

		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		List<Bitacora> Cuentas = new ArrayList<Bitacora>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(sql);
			

			
			
			rs = pre.executeQuery();
			
			while (rs.next()) {
				Bitacora bi=new Bitacora();

				bi.setCCCExt_Fecha_Carga(rs.getString("CCCExt_Fecha_Carga"));
				bi.setHora_Carga(rs.getString("hora"));
				bi.setCCCExt_CantReg_Infor(rs.getInt("CCCExt_CantReg_Infor"));
				bi.setCCCExt_ID(rs.getInt("CCCExt_ID"));
				bi.setCCCExt_MontoPagado_Info(rs.getDouble("CCCExt_MontoPagado_Info"));
				bi.setCCCExt_Nom_Arch_Orig(rs.getString("CCCExt_Nom_Arch_Orig"));
				Cuentas.add(bi);
				

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
	
	
	public List<Bitacora> getArchivo(int id){
		String sql ="SELECT CCCExt_ID_Bitacora,"
						  + "convert(char(10),getdate(),103) as CCCExt_Fecha_Carga,(convert(char(8),getdate(),118)) As hora,"
						  + "CCCExt_CantReg_Infor,"
						  + "CCCExt_Nom_Arch_Orig,"
						  + "CCCExt_MontoPagado_Info "
					+ "FROM dbo.CCteExt_Bitacora "
					+ "WHERE CCCExt_Estado_Proc !=100 ";
					

		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		List<Bitacora> Cuentas = new ArrayList<Bitacora>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(sql);
			

			
			
			rs = pre.executeQuery();
			
			while (rs.next()) {
				Bitacora bi=new Bitacora();

				bi.setCCCExt_Fecha_Carga(rs.getString("CCCExt_Fecha_Carga"));
				bi.setHora_Carga(rs.getString("hora"));
				bi.setCCCExt_CantReg_Infor(rs.getInt("CCCExt_CantReg_Infor"));
				bi.setCCCExt_ID(rs.getInt("CCCExt_ID"));
				bi.setCCCExt_MontoPagado_Info(rs.getDouble("CCCExt_MontoPagado_Info"));
				bi.setCCCExt_Nom_Arch_Orig(rs.getString("CCCExt_Nom_Arch_Orig"));
				Cuentas.add(bi);
				

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
