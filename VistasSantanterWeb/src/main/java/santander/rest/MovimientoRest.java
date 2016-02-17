package santander.rest;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import santander.daos.DaosMovimientos;



@Path("/movimientos")
public class MovimientoRest {

	@GET
	@Path("/find")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response GetMovimientos(@Context HttpServletRequest req) throws URISyntaxException  {
		
		Map<String,String> movimientos= new HashMap<String,String>();
		movimientos= new DaosMovimientos().GetMovimiento();
		
		
		Gson gson = new Gson();	
		String resp = gson.toJson(movimientos);
			
		return Response.ok(resp).build();
		
		


	}
}
