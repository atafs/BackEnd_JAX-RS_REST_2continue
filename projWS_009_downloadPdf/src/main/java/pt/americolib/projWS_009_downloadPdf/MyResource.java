package pt.americolib.projWS_009_downloadPdf;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("ws")
public class MyResource {

	private static final String FILE_PATH = "C:\\Timwe\\test\\book.pdf";

	@GET
	@Path("/pdf/get")
	@Produces("application/pdf")
	public Response getFile() {

		File file = new File(FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=new-android-book.pdf");
		return response.build();

	}
}
