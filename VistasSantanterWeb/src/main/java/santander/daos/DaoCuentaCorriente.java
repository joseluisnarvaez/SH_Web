package santander.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import santander.Conexion.ConexionSybases;
import santander.beans.CuentaCorriente;
import santander.beans.DetalleCuentaCorriente;

public class DaoCuentaCorriente {
	
	private static final Logger logger = Logger.getLogger(DaoCuentaCorriente.class);
	
	public List<CuentaCorriente> GetCuentaCorriente(int Rut,String periodo){
		String sql = "select CCCExt_RutSponsor,"+
	   "CCCExt_DV_RutSponsor,"+
	   "CCCExt_Cod_Tipo,"+
	   "CCCExt_Nro_Solicitud,"+
	   "CCCExt_PolizaCia,"+
	   "CCCExt_ItemCia,"+
	   "CCCExt_EndosoCia,"+
	   "CCCExt_Periodo,"+
	   "CCCExt_Prima_Debe,"+
	   "CCCExt_Prima_Haber,"+
	   "CCCExt_MonedaOrigen,"+
	   "CCCExt_Prima_Debe_MP,"+
	   "CCCExt_Prima_Haber_MP,"+
	   "CCCExt_Dif_Cambio,"+
	   "CCCExt_Monto_Pagado,"+
	   "CCCExt_Tkt_Oficina,"+
	   "CCCExt_Tkt_Ano,"+
	   "CCCExt_Tkt_Mes,"+
	   "CCCExt_Tkt_Concepto,"+
	   "CCCExt_Tkt_Correlativo,"+
	   "CCCExt_ComPago_Oficina,"+
	   "CCCExt_ComPago_Ano,"+
	   "CCCExt_ComPago_Mes,"+
	   "CCCExt_ComPago_Concepto,"+
	   "CCCExt_ComPago_Correlativo"+
	   " FROM CobMst.dbo.CCteExt_Cab_Movto  "; 
	   

		if(Rut>0){
			sql+= "WHERE CCCExt_RutSponsor = ? ";
			
		}
		
		if(periodo!=null){
			sql+= " AND CCCExt_Periodo = ? ";
		}
		
		sql+= " ORDER BY CCCExt_Nro_Solicitud,CCCExt_ItemCia";
	   

		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		List<CuentaCorriente> Cuentas = new ArrayList<CuentaCorriente>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(sql);
			pre.setInt(1, Rut);
			if(periodo!=null){
			pre.setInt(2,Integer.parseInt(periodo));
			}
			
			
			
			
			rs = pre.executeQuery();

			while (rs.next()) {
				CuentaCorriente n= new CuentaCorriente();
				
				n.setCCCExt_RutSponsor(rs.getString("CCCExt_RutSponsor"));
				n.setCCCExt_DV_RutSponsor(rs.getString("CCCExt_DV_RutSponsor"));
				n.setCCCExt_Dif_Cambio(rs.getString("CCCExt_Dif_Cambio"));
				n.setCCCExt_Cod_Tipo(rs.getString("CCCExt_Cod_Tipo"));
				n.setCCCExt_Nro_Solicitud(rs.getString("CCCExt_Nro_Solicitud"));
				n.setCCCExt_PolizaCia(rs.getString("CCCExt_PolizaCia"));
				n.setCCCExt_ItemCia(rs.getString("CCCExt_ItemCia"));
				n.setCCCExt_EndosoCia(rs.getString("CCCExt_EndosoCia"));
				n.setCCCExt_Periodo(rs.getString("CCCExt_Periodo"));
				n.setCCCExt_Prima_Debe(rs.getString("CCCExt_Prima_Debe"));
				n.setCCCExt_Prima_Haber(rs.getString("CCCExt_Prima_Haber"));
				n.setCCCExt_Prima_Haber(rs.getString("CCCExt_Prima_Haber"));
				n.setCCCExt_MonedaOrigen(rs.getString("CCCExt_MonedaOrigen"));
				n.setCCCExt_Prima_Debe_MP(rs.getString("CCCExt_Prima_Debe_MP"));
				n.setCCCExt_Prima_Haber_MP(rs.getString("CCCExt_Prima_Haber_MP"));
				n.setCCCExt_Dif_Cambio(rs.getString("CCCExt_Dif_Cambio"));
				n.setCCCExt_Monto_Pagado(rs.getString("CCCExt_Monto_Pagado"));
				n.setCCCExt_Tkt_Oficina(rs.getString("CCCExt_Tkt_Oficina"));
				n.setCCCExt_Tkt_Ano(rs.getString("CCCExt_Tkt_Ano"));
				n.setCCCExt_Tkt_Mes(rs.getString("CCCExt_Tkt_Mes"));
				n.setCCCExt_Tkt_Concepto(rs.getString("CCCExt_Tkt_Concepto"));
				n.setCCCExt_Tkt_Correlativo(rs.getString("CCCExt_Tkt_Correlativo"));
				n.setCCCExt_ComPago_Oficina(rs.getString("CCCExt_ComPago_Oficina"));
				n.setCCCExt_ComPago_Ano(rs.getString("CCCExt_ComPago_Ano"));
				n.setCCCExt_ComPago_Mes(rs.getString("CCCExt_ComPago_Mes"));
				n.setCCCExt_ComPago_Concepto(rs.getString("CCCExt_ComPago_Concepto"));
				n.setCCCExt_ComPago_Correlativo(rs.getString("CCCExt_ComPago_Correlativo"));
				Cuentas.add(n);
				

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

	public List<DetalleCuentaCorriente> GetDetalleCuentaCorriente(CuentaCorriente cuenta){
		String SQL= "SELECT CCCExt_RutSponsor,"+
	   "CCCExt_DV_RutSponsor,"+
	   "CCCExt_Cod_Tipo,"+
	   "CCCExt_Nro_Solicitud,"+
	   "CCCExt_PolizaCia_Ext,"+
	   "CCCExt_ItemCia_Ext,"+
	   "CCCExt_PolizaCia,"+
	   "CCCExt_ItemCia,"+
	   "CCCExt_EndosoCia,"+
	   "CCCExt_Prima_Debe,"+
	   "CCCExt_Prima_Haber,"+
	   "CCCExt_Prima_Debe_MP,"+
	   "CCCExt_Prima_Haber_MP,"+
	   "CCCExt_Dif_Cambio,"+
	   "CCCExt_MontoPagado,"+
	   "CCCExt_Rut_Cliente,"+
	   "CCCExt_DV_RutCliente,"+
	   "CCCExt_Periodo_Pago,"+
	   "CCCExt_CodEstado_Registro "
	   + "FROM CobMst.dbo.CCteExt_Det_Movto "
	   + "WHERE CCCExt_RutSponsor = ?"
	   + "AND CCCExt_Cod_Tipo=? "
	   + "AND CCCExt_Nro_Solicitud=? "
	   + "AND CCCExt_PolizaCia=? "
	   + "AND CCCExt_ItemCia=?";
		
		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		List<DetalleCuentaCorriente> detalle = new ArrayList<DetalleCuentaCorriente>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(SQL);
			pre.setInt(1,Integer.parseInt( cuenta.getCCCExt_RutSponsor()));		
			pre.setInt(2,Integer.parseInt(cuenta.getCCCExt_Cod_Tipo()));
			pre.setInt(3,Integer.parseInt(cuenta.getCCCExt_Nro_Solicitud()));
			pre.setInt(4, Integer.parseInt(cuenta.getCCCExt_PolizaCia()));
			pre.setInt(5, Integer.parseInt(cuenta.getCCCExt_ItemCia()));
			rs = pre.executeQuery();

			while (rs.next()) {
				DetalleCuentaCorriente n= new DetalleCuentaCorriente();
				
				n.setCCCExt_RutSponsor(rs.getString(1));
				n.setCCCExt_DV_RutSponsor(rs.getString(2));
				n.setCCCExt_Cod_Tipo(rs.getString(3));
				n.setCCCExt_Nro_Solicitud(rs.getString(4));
				n.setCCCExt_PolizaCia_Ext(rs.getString(5));
				n.setCCCExt_ItemCia_Ext(rs.getString(6));
				n.setCCCExt_PolizaCia(rs.getString(7));
				n.setCCCExt_ItemCia(rs.getString(8));
				n.setCCCExt_EndosoCia(rs.getString(9));
				n.setCCCExt_Prima_Debe_MO(rs.getString(10));
				n.setCCCExt_Prima_Haber_MO(rs.getString(11));
				n.setCCCExt_Prima_Debe_MP(rs.getString(12));
				n.setCCCExt_Prima_Haber_MP(rs.getString(13));
				n.setCCCExt_Dif_Cambio(rs.getString(14));
				n.setCCCExt_MontoPagado(rs.getString(15));
				n.setCCCExt_Rut_Cliente(rs.getString(16));
				n.setCCCExt_DV_RutCliente(rs.getString(17));
				n.setCCCExt_Periodo_Pago(rs.getString(18));
				n.setCCCExt_CodEstado_Registro(rs.getString(19));
				
				
				detalle.add(n);
				

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
		return detalle;

	}
	
	
	
	public List<DetalleCuentaCorriente> GetFiltro(String CCCExt_Rut_Cliente,String CCCExt_ItemCia_Ext,String CCCExt_Periodo_Pago ){
		String SQL= "SELECT CCCExt_RutSponsor,"+
	   "CCCExt_DV_RutSponsor,"+
	   "CCCExt_Cod_Tipo,"+
	   "CCCExt_Nro_Solicitud,"+
	   "CCCExt_PolizaCia_Ext,"+
	   "CCCExt_ItemCia_Ext,"+
	   "CCCExt_PolizaCia,"+
	   "CCCExt_ItemCia,"+
	   "CCCExt_EndosoCia,"+
	   "CCCExt_Prima_Debe,"+
	   "CCCExt_Prima_Haber,"+
	   "CCCExt_Prima_Debe_MP,"+
	   "CCCExt_Prima_Haber_MP,"+
	   "CCCExt_Dif_Cambio,"+
	   "CCCExt_MontoPagado,"+
	   "CCCExt_Rut_Cliente,"+
	   "CCCExt_DV_RutCliente,"+
	   "CCCExt_Periodo_Pago,"+
	   "CCCExt_CodEstado_Registro "
	   + "FROM CobMst.dbo.CCteExt_Det_Movto WHERE";
	   int and=0;
		if(!CCCExt_Rut_Cliente.isEmpty()){
			
			SQL+=	 " CCCExt_Rut_Cliente=? ";
			and++;
		}
		if(and>0){
			SQL+=	 "AND ";
		}
		if(!CCCExt_ItemCia_Ext.isEmpty()){
			SQL+=	 " CCCExt_ItemCia_Ext=? ";	
			and++;
		}
		if(and>0){
			SQL+=	 "AND ";
		}
		if(!CCCExt_Periodo_Pago.isEmpty()){
			SQL+= " CCCExt_Periodo_Pago=? ";
			and++;
		}
		
		
	   
	   
	   
		
		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		List<DetalleCuentaCorriente> detalle = new ArrayList<DetalleCuentaCorriente>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(SQL);
			and =1;
			if(!CCCExt_Rut_Cliente.isEmpty()){
				
				pre.setInt(and,Integer.parseInt(CCCExt_Rut_Cliente));
				and++;
			}
			
			if(!CCCExt_ItemCia_Ext.isEmpty()){
				pre.setInt(and,Integer.parseInt(CCCExt_ItemCia_Ext));
				and++;
			}
			
			if(!CCCExt_Periodo_Pago.isEmpty()){
				pre.setInt(and,Integer.parseInt(CCCExt_Periodo_Pago));
				and++;
			}
			rs = pre.executeQuery();

			while (rs.next()) {
				DetalleCuentaCorriente n= new DetalleCuentaCorriente();
				
				n.setCCCExt_RutSponsor(rs.getString(1));
				n.setCCCExt_DV_RutSponsor(rs.getString(2));
				n.setCCCExt_Cod_Tipo(rs.getString(3));
				n.setCCCExt_Nro_Solicitud(rs.getString(4));
				n.setCCCExt_PolizaCia_Ext(rs.getString(5));
				n.setCCCExt_ItemCia_Ext(rs.getString(6));
				n.setCCCExt_PolizaCia(rs.getString(7));
				n.setCCCExt_ItemCia(rs.getString(8));
				n.setCCCExt_EndosoCia(rs.getString(9));
				n.setCCCExt_Prima_Debe_MO(rs.getString(10));
				n.setCCCExt_Prima_Haber_MO(rs.getString(11));
				n.setCCCExt_Prima_Debe_MP(rs.getString(12));
				n.setCCCExt_Prima_Haber_MP(rs.getString(13));
				n.setCCCExt_Dif_Cambio(rs.getString(14));
				n.setCCCExt_MontoPagado(rs.getString(15));
				n.setCCCExt_Rut_Cliente(rs.getString(16));
				n.setCCCExt_DV_RutCliente(rs.getString(17));
				n.setCCCExt_Periodo_Pago(rs.getString(18));
				n.setCCCExt_CodEstado_Registro(rs.getString(19));
				
				
				detalle.add(n);
				

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
		return detalle;

	}
//	
//	public List<DetalleCuentaCorriente> GetDetalleCuentaCorriente(CuentaCorriente cuenta){
//		String SQL= "SELECT CCCExt_RutSponsor,"+
//	   "CCCExt_DV_RutSponsor,"+
//	   "CCCExt_Cod_Tipo,"+
//	   "CCCExt_Nro_Solicitud,"+
//	   "CCCExt_PolizaCia_Ext,"+
//	   "CCCExt_ItemCia_Ext,"+
//	   "CCCExt_PolizaCia,"+
//	   "CCCExt_ItemCia,"+
//	   "CCCExt_EndosoCia,"+
//	   "CCCExt_Prima_Debe,"+
//	   "CCCExt_Prima_Haber,"+
//	   "CCCExt_Prima_Debe_MP,"+
//	   "CCCExt_Prima_Haber_MP,"+
//	   "CCCExt_Dif_Cambio,"+
//	   "CCCExt_MontoPagado,"+
//	   "CCCExt_Rut_Cliente,"+
//	   "CCCExt_DV_RutCliente,"+
//	   "CCCExt_Periodo_Pago,"+
//	   "CCCExt_CodEstado_Registro "
//	   + "FROM CobMst.dbo.CCteExt_Det_Movto "
//	   + "WHERE CCCExt_RutSponsor = ?"
//	   + "AND CCCExt_Cod_Tipo=? "
//	   + "AND CCCExt_Nro_Solicitud=? "
//	   + "AND CCCExt_PolizaCia=? "
//	   + "AND CCCExt_ItemCia=?";
//		
//		
//		Connection conn = null;
//		ResultSet rs = null;
//		PreparedStatement pre = null;
//		List<DetalleCuentaCorriente> detalle = new ArrayList<DetalleCuentaCorriente>();
//		try {
//			conn = new ConexionSybases().openConnection();
//			
//			pre = conn.prepareStatement(SQL);
//			pre.setInt(1,Integer.parseInt( cuenta.getCCCExt_RutSponsor()));		
//			pre.setInt(2,Integer.parseInt(cuenta.getCCCExt_Cod_Tipo()));
//			pre.setInt(3,Integer.parseInt(cuenta.getCCCExt_Nro_Solicitud()));
//			pre.setInt(4, Integer.parseInt(cuenta.getCCCExt_PolizaCia()));
//			pre.setInt(5, Integer.parseInt(cuenta.getCCCExt_ItemCia()));
//			rs = pre.executeQuery();
//
//			while (rs.next()) {
//				DetalleCuentaCorriente n= new DetalleCuentaCorriente();
//				
//				n.setCCCExt_RutSponsor(rs.getString(1));
//				n.setCCCExt_DV_RutSponsor(rs.getString(2));
//				n.setCCCExt_Cod_Tipo(rs.getString(3));
//				n.setCCCExt_Nro_Solicitud(rs.getString(4));
//				n.setCCCExt_PolizaCia_Ext(rs.getString(5));
//				n.setCCCExt_ItemCia_Ext(rs.getString(6));
//				n.setCCCExt_PolizaCia(rs.getString(7));
//				n.setCCCExt_ItemCia(rs.getString(8));
//				n.setCCCExt_EndosoCia(rs.getString(9));
//				n.setCCCExt_Prima_Debe_MO(rs.getString(10));
//				n.setCCCExt_Prima_Haber_MO(rs.getString(11));
//				n.setCCCExt_Prima_Debe_MP(rs.getString(12));
//				n.setCCCExt_Prima_Haber_MP(rs.getString(13));
//				n.setCCCExt_Dif_Cambio(rs.getString(14));
//				n.setCCCExt_MontoPagado(rs.getString(15));
//				n.setCCCExt_Rut_Cliente(rs.getString(16));
//				n.setCCCExt_DV_RutCliente(rs.getString(17));
//				n.setCCCExt_Periodo_Pago(rs.getString(18));
//				n.setCCCExt_CodEstado_Registro(rs.getString(19));
//				
//				
//				detalle.add(n);
//				
//
//			}
//
//		} catch (Exception e) {
//			 logger.error("Error, causa:" , e);
//		} finally {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					 logger.error("Error, causa:" , e);
//				}
//			}
//			if (pre != null) {
//				try {
//					pre.close();
//				} catch (SQLException e) {
//					 logger.error("Error, causa:" ,
//					 e);
//				}
//			}
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					 logger.error("Error, causa:" ,
//					 e);
//				}
//			}
//
//		}
//		return detalle;
//
//	}
//	
//	
////	
////	public List<DetalleCuentaCorriente> GetFiltro(String CCCExt_Rut_Cliente,String CCCExt_ItemCia_Ext,String CCCExt_Periodo_Pago ){
////		String SQL= "SELECT CCCExt_RutSponsor,"+
////	   "CCCExt_DV_RutSponsor,"+
////	   "CCCExt_Cod_Tipo,"+
////	   "CCCExt_Nro_Solicitud,"+
////	   "CCCExt_PolizaCia_Ext,"+
////	   "CCCExt_ItemCia_Ext,"+
////	   "CCCExt_PolizaCia,"+
////	   "CCCExt_ItemCia,"+
////	   "CCCExt_EndosoCia,"+
////	   "CCCExt_Prima_Debe,"+
////	   "CCCExt_Prima_Haber,"+
////	   "CCCExt_Prima_Debe_MP,"+
////	   "CCCExt_Prima_Haber_MP,"+
////	   "CCCExt_Dif_Cambio,"+
////	   "CCCExt_MontoPagado,"+
////	   "CCCExt_Rut_Cliente,"+
////	   "CCCExt_DV_RutCliente,"+
////	   "CCCExt_Periodo_Pago,"+
////	   "CCCExt_CodEstado_Registro "
////	   + "FROM CobMst.dbo.CCteExt_Det_Movto WHERE";
////	   int and=0;
////		if(!CCCExt_Rut_Cliente.isEmpty()){
////			
////			SQL+=	 " CCCExt_Rut_Cliente=? ";
////			and++;
////		}
////		if(and>0){
////			SQL+=	 "AND ";
////		}
////		if(!CCCExt_ItemCia_Ext.isEmpty()){
////			SQL+=	 " CCCExt_ItemCia_Ext=? ";	
////			and++;
////		}
////		if(and>0){
////			SQL+=	 "AND ";
////		}
////		if(!CCCExt_Periodo_Pago.isEmpty()){
////			SQL+= " CCCExt_Periodo_Pago=? ";
////			and++;
////		}
////		
////		
////	   
////	   
////	   
////		
////		
////		Connection conn = null;
////		ResultSet rs = null;
////		PreparedStatement pre = null;
////		List<DetalleCuentaCorriente> detalle = new ArrayList<DetalleCuentaCorriente>();
////		try {
////			conn = new ConexionSybases().openConnection();
////			
////			pre = conn.prepareStatement(SQL);
////			and =1;
////			if(!CCCExt_Rut_Cliente.isEmpty()){
////				
////				pre.setInt(and,Integer.parseInt(CCCExt_Rut_Cliente));
////				and++;
////			}
////			
////			if(!CCCExt_ItemCia_Ext.isEmpty()){
////				pre.setInt(and,Integer.parseInt(CCCExt_ItemCia_Ext));
////				and++;
////			}
////			
////			if(!CCCExt_Periodo_Pago.isEmpty()){
////				pre.setInt(and,Integer.parseInt(CCCExt_Periodo_Pago));
////				and++;
////			}
////			rs = pre.executeQuery();
////
////			while (rs.next()) {
////				DetalleCuentaCorriente n= new DetalleCuentaCorriente();
////				
////				n.setCCCExt_RutSponsor(rs.getString(1));
////				n.setCCCExt_DV_RutSponsor(rs.getString(2));
////				n.setCCCExt_Cod_Tipo(rs.getString(3));
////				n.setCCCExt_Nro_Solicitud(rs.getString(4));
////				n.setCCCExt_PolizaCia_Ext(rs.getString(5));
////				n.setCCCExt_ItemCia_Ext(rs.getString(6));
////				n.setCCCExt_PolizaCia(rs.getString(7));
////				n.setCCCExt_ItemCia(rs.getString(8));
////				n.setCCCExt_EndosoCia(rs.getString(9));
////				n.setCCCExt_Prima_Debe_MO(rs.getString(10));
////				n.setCCCExt_Prima_Haber_MO(rs.getString(11));
////				n.setCCCExt_Prima_Debe_MP(rs.getString(12));
////				n.setCCCExt_Prima_Haber_MP(rs.getString(13));
////				n.setCCCExt_Dif_Cambio(rs.getString(14));
////				n.setCCCExt_MontoPagado(rs.getString(15));
////				n.setCCCExt_Rut_Cliente(rs.getString(16));
////				n.setCCCExt_DV_RutCliente(rs.getString(17));
////				n.setCCCExt_Periodo_Pago(rs.getString(18));
////				n.setCCCExt_CodEstado_Registro(rs.getString(19));
////				
////				
////				detalle.add(n);
////				
////
////			}
////
////		} catch (Exception e) {
////			 logger.error("Error, causa:" , e);
////		} finally {
////			if (rs != null) {
////				try {
////					rs.close();
////				} catch (SQLException e) {
////					 logger.error("Error, causa:" , e);
////				}
////			}
////			if (pre != null) {
////				try {
////					pre.close();
////				} catch (SQLException e) {
////					 logger.error("Error, causa:" ,
////					 e);
////				}
////			}
////			if (conn != null) {
////				try {
////					conn.close();
////				} catch (SQLException e) {
////					 logger.error("Error, causa:" ,
////					 e);
////				}
////			}
////
////		}
////		return detalle;
////
////	}
	public List<DetalleCuentaCorriente> GetTrabajo(CuentaCorriente cuenta){
		String SQL= "SELECT CCCExt_RutSponsor,"+
	   "CCCExt_DV_RutSponsor,"+
	   "CCCExt_Cod_Tipo,"+
	   "CCCExt_Nro_Solicitud,"+
	   "CCCExt_PolizaCia_Ext,"+
	   "CCCExt_ItemCia_Ext,"+
	   "CCCExt_PolizaCia,"+
	   "CCCExt_ItemCia,"+
	   "CCCExt_EndosoCia,"+
	   "CCCExt_Prima_Debe,"+
	   "CCCExt_Prima_Haber,"+
	   "CCCExt_Prima_Debe_MP,"+
	   "CCCExt_Prima_Haber_MP,"+
	   "CCCExt_Dif_Cambio,"+
	   "CCCExt_MontoPagado,"+
	   "CCCExt_Rut_Cliente,"+
	   "CCCExt_DV_RutCliente,"+
	   "CCCExt_Periodo_Pago,"+
	   "CCCExt_CodEstado_Registro "
	   + "FROM CobMst.dbo.CCteExt_Det_Movto "
	   + "WHERE CCCExt_RutSponsor = ?"
	   + "AND CCCExt_Cod_Tipo=? "
	   + "AND CCCExt_Nro_Solicitud=? "
	   + "AND CCCExt_PolizaCia=? "
	   + "AND CCCExt_ItemCia=?";
		
		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pre = null;
		List<DetalleCuentaCorriente> detalle = new ArrayList<DetalleCuentaCorriente>();
		try {
			conn = new ConexionSybases().openConnection();
			
			pre = conn.prepareStatement(SQL);
			pre.setInt(1,Integer.parseInt( cuenta.getCCCExt_RutSponsor()));		
			pre.setInt(2,Integer.parseInt(cuenta.getCCCExt_Cod_Tipo()));
			pre.setInt(3,Integer.parseInt(cuenta.getCCCExt_Nro_Solicitud()));
			pre.setInt(4, Integer.parseInt(cuenta.getCCCExt_PolizaCia()));
			pre.setInt(5, Integer.parseInt(cuenta.getCCCExt_ItemCia()));
			rs = pre.executeQuery();

			while (rs.next()) {
				DetalleCuentaCorriente n= new DetalleCuentaCorriente();
				
				n.setCCCExt_RutSponsor(rs.getString(1));
				n.setCCCExt_DV_RutSponsor(rs.getString(2));
				n.setCCCExt_Cod_Tipo(rs.getString(3));
				n.setCCCExt_Nro_Solicitud(rs.getString(4));
				n.setCCCExt_PolizaCia_Ext(rs.getString(5));
				n.setCCCExt_ItemCia_Ext(rs.getString(6));
				n.setCCCExt_PolizaCia(rs.getString(7));
				n.setCCCExt_ItemCia(rs.getString(8));
				n.setCCCExt_EndosoCia(rs.getString(9));
				n.setCCCExt_Prima_Debe_MO(rs.getString(10));
				n.setCCCExt_Prima_Haber_MO(rs.getString(11));
				n.setCCCExt_Prima_Debe_MP(rs.getString(12));
				n.setCCCExt_Prima_Haber_MP(rs.getString(13));
				n.setCCCExt_Dif_Cambio(rs.getString(14));
				n.setCCCExt_MontoPagado(rs.getString(15));
				n.setCCCExt_Rut_Cliente(rs.getString(16));
				n.setCCCExt_DV_RutCliente(rs.getString(17));
				n.setCCCExt_Periodo_Pago(rs.getString(18));
				n.setCCCExt_CodEstado_Registro(rs.getString(19));
				
				
				detalle.add(n);
				

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
		return detalle;

	}
}
