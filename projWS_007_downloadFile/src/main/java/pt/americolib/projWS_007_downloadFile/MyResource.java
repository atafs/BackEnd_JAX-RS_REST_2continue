package pt.americolib.projWS_007_downloadFile;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("ws")
public class MyResource {

	//Download File in JAX-RS
    private static final String FILE_PATH = "C:\\Timwe\\test\\test.log";

	@GET
	@Path("/file/get")
	@Produces("text/plain")
	public Response getFile() {

		File file = new File(FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=\"file_from_server.log\"");
		return response.build();

	}
}
