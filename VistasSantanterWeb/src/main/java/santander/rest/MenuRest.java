package santander.rest;


import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.view.Viewable;

import santander.beans.Usuarios;


@Path("/menu")
public class MenuRest {
	
	@GET
	@Produces({ MediaType.TEXT_HTML })
	public Response getIt(@Context HttpServletRequest req) {
		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		
		if(use!=null){
			return Response.ok(new Viewable("/menuPrincipal")).build();	
		}
		else{
			 java.net.URI location = null;
			try {
				location = new java.net.URI("../web/?cod=1");
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    return Response.temporaryRedirect(location).build();
		}
		
		
	}
	
	@Path("/Cuadratura")
	@GET
	@Produces({ MediaType.TEXT_HTML })
	public Response get(@Context HttpServletRequest req) {
		
	
		
		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		
		if(use!=null){
			return Response.ok(new Viewable("/cuadraturaArchivos")).build();
		}
		else{
			 java.net.URI location = null;
			try {
				location = new java.net.URI("../web/?cod=1");
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    return Response.temporaryRedirect(location).build();
		}

		
		
	}
	
	@Path("/Confirmacion")
	@GET
	@Produces({ MediaType.TEXT_HTML })
	public Response getConfirmacion(@Context HttpServletRequest req) {
		
	
		
		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		
		if(use!=null){
			return Response.ok(new Viewable("/Confirmacion")).build();
		}
		else{
			 java.net.URI location = null;
			try {
				location = new java.net.URI("../web/?cod=1");
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    return Response.temporaryRedirect(location).build();
		}

		
		
	}
	@Path("/ResumenCC")
	@GET
	@Produces({ MediaType.TEXT_HTML })
	public Response getResumenCC(@Context HttpServletRequest req) {

		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		
		if(use!=null){
			return Response.ok(new Viewable("/resumenCuentaC")).build();	
		}
		else{
			 java.net.URI location = null;
			try {
				location = new java.net.URI("../web/?cod=1");
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    return Response.temporaryRedirect(location).build();
		}

		
		
		
	}
	@Path("/RevisarArch")
	@GET
	@Produces({ MediaType.TEXT_HTML })
	public Response getResumenArch(@Context HttpServletRequest req) {

		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		
		if(use!=null){
			return Response.ok(new Viewable("/revisarArchivos")).build();
		}
		else{
			 java.net.URI location = null;
			try {
				location = new java.net.URI("../web/?cod=1");
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    return Response.temporaryRedirect(location).build();
		}

		
		
		
	}
	@Path("/RevisarArch/detalle")
	@GET
	@Produces({ MediaType.TEXT_HTML })
	public Response getDetalleArch(@Context HttpServletRequest req) {

		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		
		if(use!=null){
			return Response.ok(new Viewable("/detalleArchivo")).build();
		}
		else{
			 java.net.URI location = null;
			try {
				location = new java.net.URI("../web/?cod=1");
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    return Response.temporaryRedirect(location).build();
		}

		
		
		
	}
	
	
	
}
