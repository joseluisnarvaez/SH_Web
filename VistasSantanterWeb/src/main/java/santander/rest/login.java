package santander.rest;


import java.net.URISyntaxException;
import java.util.Map;

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

import santander.beans.Usuarios;
import santander.daos.DaoUsuarios;
import santander.daos.SponsorDao;

@Path("/")
public class login {
	
	
	@GET
	@Produces({ MediaType.TEXT_HTML })
	public Response getIt() {
		return Response.ok(new Viewable("/index")).build();
	}
	
	@GET
	@Path("/login")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response crea_user(@Context HttpServletRequest req,
			@QueryParam("user") String user
			,@QueryParam("pass") String pass) throws URISyntaxException  {
		HttpSession session = req.getSession(true);
		String rut="";
		rut= new DaoUsuarios().getUsuario(user, pass);
		rut="1";
		Usuarios usuario= new Usuarios();
		if(rut!=null){
			usuario.setUser(user);
			usuario.setPassword(pass);
			usuario.setRut(Integer.parseInt(rut));
			
			
			
			Gson gson = new Gson();	
			String resp = gson.toJson(rut);
			session.setAttribute("user", usuario);
			return Response.ok(resp).build();
		}
		else{
			Gson gson = new Gson();	
			String resp = gson.toJson(false);
			
			return Response.ok(resp).build();
		}
		


	}

	@GET
	@Path("/setsponsor")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response SetSponsor(@Context HttpServletRequest req,
			@QueryParam("Sponsor") String Sponsor) throws URISyntaxException  {
		HttpSession session = req.getSession(true);
		Usuarios use = (Usuarios) session.getAttribute("user");
		 Map<String,String> spon=  new SponsorDao().GetSponsor(use.getRut());
		use.setSponsor(Sponsor);
		use.setNombre_sponsor(spon.get(Sponsor));
		
		session.setAttribute("user", use);
	
			return Response.ok("ok").build();
		}
		


	

}
