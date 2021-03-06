package pt.americolib.projWS_005_FormParam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("ws")
public class MyResource {

	//JAX-RS @FormParam example ###
    @POST
	@Path("/add")
	public Response addUser(
		@FormParam("name") String name,
		@FormParam("age") int age) {

		return Response.status(200)
			.entity("addUser is called, name : " + name + ", age : " + age)
			.build();

	}
}
