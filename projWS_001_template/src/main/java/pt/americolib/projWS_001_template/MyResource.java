package pt.americolib.projWS_001_template;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("ws")
public class MyResource {
	
	//Download Image in JAX-RS
	private static final String FILE_PATH2 = "C:\\Timwe\\test\\img1.jpg";

	@GET
	@Path("/image/get")
	@Produces("image/png")
	public Response getFile2() {

		File file = new File(FILE_PATH2);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=image_from_server.png");
		return response.build();

	}
}
