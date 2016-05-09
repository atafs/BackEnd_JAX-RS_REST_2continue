package pt.americolib.projWS_006_HTTP_header;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("ws")
public class MyResource {

	//Get HTTP header in JAX-RS ###
    @GET
	@Path("/get1")
	public Response addUser(@HeaderParam("user-agent") String userAgent) {

		return Response.status(200)
			.entity("addUser is called, userAgent : " + userAgent)
			.build();

	}
    
    @GET
	@Path("/get2")
	public Response addUser(@Context HttpHeaders headers) {

		String userAgent = headers.getRequestHeader("user-agent").get(0);
		
		return Response.status(200)
			.entity("addUser is called, userAgent : " + userAgent)
			.build();

	}
}
