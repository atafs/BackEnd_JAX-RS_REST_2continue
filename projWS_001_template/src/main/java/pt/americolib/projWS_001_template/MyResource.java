package pt.americolib.projWS_001_template;

import java.io.File;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("ws")
public class MyResource {
	
	//JAX-RS @MatrixParam example ###
	@GET
	@Path("{year}")
	public Response getBooks(@PathParam("year") String year,
			@MatrixParam("author") String author,
			@MatrixParam("country") String country) {

		return Response
			.status(200)
			.entity("getBooks is called, year : " + year
				+ ", author : " + author + ", country : " + country)
			.build();

	}
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
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
