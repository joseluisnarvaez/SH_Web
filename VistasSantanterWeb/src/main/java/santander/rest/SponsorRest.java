package santander.rest;

import java.net.URISyntaxException;

import java.util.HashMap;

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

import santander.beans.Usuarios;
import santander.daos.SponsorDao;

@Path("/Sponsor")
public class SponsorRest {
	
	
	@GET
	@Path("/find")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response crea_user(@Context HttpServletRequest req,
			@QueryParam("user") int user) throws URISyntaxException  {
		
		Map<String,String> Sponsor= new HashMap<String,String>();
		 Sponsor= new SponsorDao().GetSponsor(user);
		
		
		Gson gson = new Gson();	
		String resp = gson.toJson(Sponsor);
			
		return Response.ok(resp).build();
		
		


	}
	
	@GET
	@Path("/getrut")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response creagetrut(@Context HttpServletRequest req) throws URISyntaxException  {
		
		HttpSession session = req.getSession(true);
		
		Usuarios user = (Usuarios) session.getAttribute("user");

		
		
		Gson gson = new Gson();	
		String resp = gson.toJson(user.getNombre_sponsor());
			
		return Response.ok(resp).build();
		
		


	}



}
