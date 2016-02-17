package santander.rest;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
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

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.sun.jersey.api.view.Viewable;

import santander.beans.Bitacora;
import santander.beans.Usuarios;
import santander.daos.DaoBitacora;
import santander.daos.DaoUsuarios;
import santander.utils.Funciones;

@Path("/Bitacora")
public class BitacoraRest {
	Logger logg= Logger.getLogger(BitacoraRest.class);
	@GET
	@Produces({ MediaType.TEXT_HTML })
	public Response getIt(@Context HttpServletRequest req) {
		
		
		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		
		if(use!=null){
			return Response.ok(new Viewable("/Confirmacion")).build();	
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
	@Path("/GetInfo")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getTabla(@Context HttpServletRequest req) {
		List<Bitacora> bitacoras = new ArrayList<Bitacora>();
		
		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		
		bitacoras= new DaoBitacora().GetBitacoras(use.getSponsor());
		

		Gson gson = new Gson();	
		String resp = gson.toJson(bitacoras);
			
		return Response.ok(resp).build();

	}
	
	@GET
	@Path("/Updateregistro")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response Updateregistro(@Context HttpServletRequest req,@QueryParam("ID") int id,@QueryParam("cod") int cod ) {
		
	
		
		 new DaoBitacora().UpdateEstado(id,cod);
		 
		 if(cod== 5){
			 HttpSession session = req.getSession(true);
				
			 Usuarios user = (Usuarios) session.getAttribute("user");
			 String correo= new DaoUsuarios().getCorreo(user.getRut());
			 
			 String ruta= new DaoBitacora().GetRuta(id);
			 try {
				new Funciones().SendMail(correo,ruta);
			} catch (FileNotFoundException e) {
				logg.error(e);
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				logg.error(e);
				e.printStackTrace();
			}
		 }
		 
		Gson gson = new Gson();	
		String resp = gson.toJson("ok");
			
		return Response.ok(resp).build();

	}
	
	@GET
	@Path("/GetAll")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getAll(@Context HttpServletRequest req) {
		List<Bitacora> bitacoras = new ArrayList<Bitacora>();
		
		
		
		bitacoras= new DaoBitacora().getAll();
		

		Gson gson = new Gson();	
		String resp = gson.toJson(bitacoras);
			
		return Response.ok(resp).build();

	}
	
	

}
