package santander.rest;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.sun.jersey.api.view.Viewable;

import santander.beans.CuentaCorriente;
import santander.beans.DetalleCuentaCorriente;
import santander.beans.Usuarios;
import santander.daos.DaoCuentaCorriente;

@Path("/CCorrientes")
public class CuentasRest {
	
	@GET
	@Produces({ MediaType.TEXT_HTML })
	public Response getIt(@Context HttpServletRequest req) {
		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		
		if(use!=null){
			return Response.ok(new Viewable("/buscar")).build();	
		}
		else{
			 java.net.URI location = null;
			try {
				location = new java.net.URI("../web/");
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    return Response.temporaryRedirect(location).build();
		}


	}
	
	@GET
	@Path("/getcuentas")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getCuentas(@Context HttpServletRequest req,
		
			@QueryParam("periodo") String periodo)  {
		
		List<CuentaCorriente> cuentas= new ArrayList<CuentaCorriente>();
		HttpSession session = req.getSession(true);
		
		Usuarios user = (Usuarios) session.getAttribute("user");

		cuentas=new  DaoCuentaCorriente().GetCuentaCorriente(Integer.parseInt(user.getSponsor()),periodo);
		Gson gson = new Gson();	
		String resp = gson.toJson(cuentas);
		
		return Response.ok(resp).build();

	}
	
	@GET
	@Path("/getdetalle")
	@Produces({ MediaType.TEXT_HTML })
	public Response detalleCuentas(@Context HttpServletRequest req)  {
		
		return Response.ok(new Viewable("/mostrar_detalle")).build();

	}
	@GET
	@Path("/CCorrientes/detalle")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response detalle(@Context HttpServletRequest req
			,@QueryParam("rut") String rut
			,@QueryParam("tipodoc") String tipodoc
			,@QueryParam("polcom") String polcom
			,@QueryParam("itemcia") String itemcia
			,@QueryParam("numsoli") String numsoli
			)  {
		
		CuentaCorriente cuenta= new CuentaCorriente();
		cuenta.setCCCExt_RutSponsor(rut);
		cuenta.setCCCExt_Cod_Tipo(tipodoc);
		cuenta.setCCCExt_PolizaCia(polcom);
		cuenta.setCCCExt_ItemCia(itemcia);
		cuenta.setCCCExt_Nro_Solicitud(numsoli);
		
		
		List<DetalleCuentaCorriente> detalle= new ArrayList<DetalleCuentaCorriente>();
		
		detalle=new  DaoCuentaCorriente().GetDetalleCuentaCorriente(cuenta);
		Gson gson = new Gson();	
		String resp = gson.toJson(detalle);
		
		return Response.ok(resp).build();
		


	}

	@GET
	@Path("/CCorrientes/filtro")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response filtro(@Context HttpServletRequest req,
			@QueryParam("rut") String RUTS,
			@QueryParam("ICE") String ICE,
			@QueryParam("periodo") String periodo
			)  {

		List<DetalleCuentaCorriente> detalle= new ArrayList<DetalleCuentaCorriente>();
		
		detalle=new  DaoCuentaCorriente().GetFiltro(RUTS,ICE,periodo);
		Gson gson = new Gson();	
		String resp = gson.toJson(detalle);
		
		return Response.ok(resp).build();
		


	}
//	@GET
//	@Path("/CCorrientes/detalle")
//	@Produces({ MediaType.APPLICATION_JSON })
//	public Response cabtrabajo(@Context HttpServletRequest req
//			,@QueryParam("rut") String rut
//			,@QueryParam("tipodoc") String tipodoc
//			,@QueryParam("polcom") String polcom
//			,@QueryParam("itemcia") String itemcia
//			,@QueryParam("numsoli") String numsoli
//			)  {
//		
//		CuentaCorriente cuenta= new CuentaCorriente();
//		cuenta.setCCCExt_RutSponsor(rut);
//		cuenta.setCCCExt_Cod_Tipo(tipodoc);
//		cuenta.setCCCExt_PolizaCia(polcom);
//		cuenta.setCCCExt_ItemCia(itemcia);
//		cuenta.setCCCExt_Nro_Solicitud(numsoli);
//		
//		
//		List<DetalleCuentaCorriente> detalle= new ArrayList<DetalleCuentaCorriente>();
//		
//		detalle=new  DaoCuentaCorriente().GetDetalleCuentaCorriente(cuenta);
//		Gson gson = new Gson();	
//		String resp = gson.toJson(detalle);
//		
//		return Response.ok(resp).build();
//		
//
//
//	}

}
